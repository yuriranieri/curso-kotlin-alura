package br.com.alura.bytebank.execution

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArraySalario() {
    val salarios = doubleArrayOf(10000.0, 20000.0, 30000.0, 45000.0, 50000.0)
    val aumento = 1.1

    for ((indice, salario) in salarios.withIndex()) {
        salarios[indice] = salario * aumento
    }

    val salarios2 = doubleArrayOf(1000.0, 2000.0, 3000.0, 4500.0, 5000.0)
    salarios2.withIndex().forEach { (indice, salario) -> salarios2[indice] = salario * aumento }

    val salarios3 = doubleArrayOf(100.0, 200.0, 300.0, 450.0, 500.0)
    salarios3.forEachIndexed { i, salario -> salarios3[i] = salario * aumento }

    println("Salários 1 com aumento: ${salarios.contentToString()}")
    println("Salários 2 com aumento: ${salarios2.contentToString()}")
    println("Salários 3 com aumento: ${salarios3.contentToString()}")
}

fun testaArrayMaiorIdade() {
    //    val numeros = IntArray(5) --> yeahhhh <--
    val idades = intArrayOf(25, 29, 33, 20, 55, 40, 200)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("A maior idade é $maiorIdade")
    println("A menor idade é $menorIdade")
}

fun testaMetodosArray() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    println("maior idade: ${idades.maxOrNull()}")
    println("menor idade: ${idades.minOrNull()}")
    println("idade média: ${idades.average()}")
    println("método all: ${idades.all { it >= 18 }}") // todos sao maior de idade?
    println("método any: ${idades.any { it >= 18 }}") // tem algum aluno maior de idade?
    println("idades maior de idade: ${idades.filter { it >= 18 }}")
    println("primeira idade maior de idade: ${idades.find { it >= 18 }}")
}

fun testaSalarioComBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0")

    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        if (salario < "5000.0".toBigDecimal()) {
            salario + "500.0".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoEmUmMes = salariosComAumento.somatoria()
    println("gasto no primeiro mês: $gastoEmUmMes")

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoEmUmMes) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("gasto total após $meses meses: $gastoTotal")

    val media = salariosComAumento.sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("media: $media")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { i -> valores[i].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor -> acumulador + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}