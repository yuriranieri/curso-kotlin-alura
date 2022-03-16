package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.ContaPoupanca

fun testaComportamentosConta() {
    val contaYuri = ContaCorrente("Yuri", 814)
    val contaRobson = ContaPoupanca("Robson", 777)

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