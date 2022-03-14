package entity.funcionario

open class Funcionario( // open habilita que qualquer classe herde dela (heranca)

    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    open fun bonificacao(): Double = salario * 0.1

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

}