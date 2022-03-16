package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.ContaPoupanca

fun comecandoPOO() {
    val yuri = Cliente(nome = "Yuri Ranieri", cpf = "111.111.111-11", senha = 123)
    val robson = Cliente(nome = "Robson", cpf = "222.222.222-22", senha = 231)

    val contaYuri = ContaCorrente(yuri, 814)
    contaYuri.depositar(10000.0)
    println("Conta 1: $contaYuri")
    println("Titular: " + contaYuri.titular)
    println("numero da conta: " + contaYuri.numero)
    println("saldo: " + contaYuri.saldo + "\n")

    val contaRobson = ContaPoupanca(robson, 777)
    contaRobson.depositar(1000.0)
    println("Conta 2: $contaRobson")
    println("Titular: " + contaRobson.titular)
    println("numero da conta: " + contaRobson.numero)
    println("saldo: " + contaRobson.saldo)

    val contaYuri2 = ContaCorrente(yuri, 814)
    contaYuri2.depositar(10000.0)

    if (contaYuri == contaYuri2) println("conta iguais")
    else println("conta diferentes")
}