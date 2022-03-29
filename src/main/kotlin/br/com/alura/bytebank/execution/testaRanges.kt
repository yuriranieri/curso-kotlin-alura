package br.com.alura.bytebank.execution

fun testaRanges() {
    val serie: IntRange = 1.rangeTo(10)
    serie.forEach { s -> println("$s") }

    println("-------------------")

    val numerosPares = 0..100 step 2
    numerosPares.forEach { num -> println("$num") }

    println("-------------------")

    val until = 2.until(100) step 2
    until.forEach { num -> println("$num") }

    println("-------------------")

    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { num -> println("$num") }

    println("-------------------")

    val intervalo = 1500.0..5000.0
    val salario = 4540.0
    if (salario in intervalo) {
        println("salario $salario dentro do intervalo")
    } else {
        println("salario $salario não está dentro do intervalo")
    }

    println("-------------------")

    val alfabeto = "a".."z"
    val letra = "k"
    if (letra in alfabeto) {
        println("letra $letra dentro do alfabeto")
    } else {
        println("letra $letra não está dentro do alfabeto")
    }
}