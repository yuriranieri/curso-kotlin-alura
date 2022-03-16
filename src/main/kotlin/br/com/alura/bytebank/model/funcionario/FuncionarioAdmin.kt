package br.com.alura.bytebank.model.funcionario

abstract class FuncionarioAdmin(
    // open habilita que qualquer classe herde dela (heranca)
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(nome, cpf, salario) {

    abstract override fun bonificacao(): Double

    open fun autentica(senha: Int): Boolean {
        println("autentica funcionario admin")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}