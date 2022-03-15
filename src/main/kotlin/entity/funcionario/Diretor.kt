package entity.funcionario

import interfaces.Autenticavel

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double,
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override fun bonificacao(): Double {
        return salario + plr
    }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }

}