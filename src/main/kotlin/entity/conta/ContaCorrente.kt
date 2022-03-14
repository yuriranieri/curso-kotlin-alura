package entity.conta

class ContaCorrente(
    titular: String,
    numero: Int,
) : Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        super.sacar(valor + 0.1)
    }

}