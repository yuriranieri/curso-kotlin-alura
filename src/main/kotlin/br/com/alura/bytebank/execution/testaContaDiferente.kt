package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.ContaPoupanca

fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 123
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = alex,
        numero = 1000
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("contaCorrente deposito: $contaCorrente")
    println("contaPoupanca deposito: $contaPoupanca\n")

    contaPoupanca.sacar(100.0)
    contaCorrente.sacar(100.0)

    println("contaCorrente saque: $contaCorrente")
    println("contaPoupanca saque: $contaPoupanca\n")

    contaPoupanca.transferir(contaCorrente, 100.0, alex.senha)
    println("contaPoupanca apos fazer transferencia: $contaPoupanca")
    println("contaCorrente apos receber transferencia: $contaCorrente\n")

    contaCorrente.transferir(contaPoupanca, 100.0, alex.senha)
    println("contaCorrente apos fazer transferencia: $contaCorrente")
    println("contaPoupanca apos receber transferencia: $contaPoupanca\n")
}