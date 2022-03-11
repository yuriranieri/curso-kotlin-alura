import entity.Conta
import entity.Pessoa

fun main() {
    val contaYuri = Conta("Yuri", 814 )
    val contaRobson = Conta("Robson", 777)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")
    contaYuri.saldo

    contaYuri.depositar(10000.0)
    contaRobson.depositar(5000.0)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")

    contaYuri.transferir(contaRobson, 234.50)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")

    contaYuri.transferir(contaYuri, 234.50)
    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")
}

private fun testaCopiaReferencia() {
    var yuri = Pessoa("Yuri", 20)
    var yuri2 = Pessoa("Yuri", 20)
    var ygor = Pessoa("Ygor", 18)
    var ygor2 = Pessoa(idade = 18, nome = "Ygor")
    var teste = yuri

    if (yuri == yuri2) { // de acordo com metodo equals()
        println("objetos com mesmos valores")
    }

    if (yuri === teste) { // ve a referencia do objeto
        println("objetos com a mesma referencia na memoria")
    }

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")

    yuri.nome = "Tchury"
    yuri.idade = 21

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")

    teste.nome = "teste"
    teste.idade = 20

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")
}

private fun comecandoPOO() {
    val contaYuri = Conta("Yuri Ranieri", 814)
    contaYuri.depositar(10000.0)
    println("Conta 1: $contaYuri")
    println("Titular: " + contaYuri.titular)
    println("numero da conta: " + contaYuri.numero)
    println("saldo: " + contaYuri.saldo + "\n")

    val contaRobson = Conta("Robson", 777)
    contaRobson.depositar(1000.0)
    println("Conta 2: $contaRobson")
    println("Titular: " + contaRobson.titular)
    println("numero da conta: " + contaRobson.numero)
    println("saldo: " + contaRobson.saldo)

    val contaYuri2 = Conta("Yuri Ranieri", 814)
    contaYuri2.depositar(10000.0)

    if (contaYuri == contaYuri2) println("conta iguais")
    else println("conta diferentes")
}

private fun testeProcedural() {
    val titular = "Yuri cRanieri"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo $saldo")

    println(testaCondicoes(saldo))

    for (i in 1..6) {
        whenExpression(i)
    }

    for (i in 6 downTo 0 step 2) {
        println("i: $i")
    }
}

fun testaCondicoes(saldo: Double): String {
    val text = if (saldo > 0.0) {
        println("conta positiva")
        "saldo positivo"
    } else if (saldo == 0.0) {
        println("conta zerada")
        "saldo zerado"
    } else {
        println("conta negativa")
        "saldo negativo"
    }
    return text
}

private fun whenExpression(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        4 -> println("x == 4")
        5 -> println("x == 5")
        else -> {
            println("x is not in 1, 2, 3, 4 , 5")
        }
    }
}