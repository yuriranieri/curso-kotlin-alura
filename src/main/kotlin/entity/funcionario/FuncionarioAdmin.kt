package entity.funcionario

abstract class FuncionarioAdmin(
    // open habilita que qualquer classe herde dela (heranca)
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(nome, cpf, salario) {

    abstract override fun bonificacao(): Double

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}