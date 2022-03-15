package entity.funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
) {

    override fun bonificacao(): Double {
        return salario
    }

}