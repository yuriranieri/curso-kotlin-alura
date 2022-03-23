package br.com.alura.bytebank.model.conta

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.interfaces.Autenticavel

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        total++
    }

    override val senha: Int
        get() = titular.senha

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    abstract fun sacar(valor: Double)

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun transferir(contaDestino: Conta, valor: Double, senha: Int) {
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        if (contaDestino === this) {
            throw Exception("conta de destino é a mesma que está tranferindo")
        }
        this.sacar(valor)
        contaDestino.depositar(valor)
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }


}