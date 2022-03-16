package br.com.alura.bytebank.model.conta

import br.com.alura.bytebank.model.Cliente

class ContaCorrente(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }

}