package br.com.alura.bytebank.model.conta

import br.com.alura.bytebank.model.Cliente

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        total++
    }

    abstract fun sacar(valor: Double)

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun transferir(contaDestino: Conta, valor: Double) {
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