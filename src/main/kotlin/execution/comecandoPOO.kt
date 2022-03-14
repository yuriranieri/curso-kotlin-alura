package execution

import entity.Conta

fun comecandoPOO() {
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