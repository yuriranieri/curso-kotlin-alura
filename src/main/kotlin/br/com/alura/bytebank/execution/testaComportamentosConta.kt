package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.ContaPoupanca

fun testaComportamentosConta() {
    val yuri = Cliente(nome = "Yuri Ranieri", cpf = "111.111.111-11", senha = 123, endereco = Endereco(estado = "sc"))
    val robson = Cliente(nome = "Robson", cpf = "222.222.222-22", senha = 231)
    val contaYuri = ContaCorrente(yuri, 814)
    val contaRobson = ContaPoupanca(robson, 777)

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