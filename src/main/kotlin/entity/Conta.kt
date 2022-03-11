package entity

data class Conta(
    val titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        private set

    fun sacar(valor: Double) {
        val saldoMaiorQueValor = saldo >= valor
        if (saldoMaiorQueValor) {
            saldo -= valor
        }
    }

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