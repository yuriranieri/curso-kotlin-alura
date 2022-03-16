package br.com.alura.bytebank

import br.com.alura.bytebank.execution.*
import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.totalContas
import br.com.alura.bytebank.model.interfaces.Autenticavel

fun main() {

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "222.222.222-22"
        override val senha: Int = 1000

        override fun autentica(senha: Int): Boolean {
            return this.senha == senha
        }
    }

    println("autentica obj anonimo: ${fran.autentica(1000)}")

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 123
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 2222
    )
    testaContasDiferentes()
    println("Total de contas $totalContas")
}