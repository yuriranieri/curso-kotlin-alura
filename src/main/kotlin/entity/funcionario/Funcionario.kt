package entity.funcionario

open class Funcionario( // open habilita que qualquer classe herde dela (heranca)

    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    fun bonificacao(): Double {
        return salario * 0.1
    }

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

}