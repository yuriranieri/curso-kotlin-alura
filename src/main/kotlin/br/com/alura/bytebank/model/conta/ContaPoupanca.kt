package br.com.alura.bytebank.model.conta

class ContaPoupanca(
    titular: String,
    numero: Int,
) : Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

}