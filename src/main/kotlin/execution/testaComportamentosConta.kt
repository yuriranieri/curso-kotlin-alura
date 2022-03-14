package execution

import entity.Conta

fun testaComportamentosConta() {
    val contaYuri = Conta("Yuri", 814)
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