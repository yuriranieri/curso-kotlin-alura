package entity.funcionario

abstract class Funcionario(
    // open habilita que qualquer classe herde dela (heranca)
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    abstract fun bonificacao(): Double

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

}