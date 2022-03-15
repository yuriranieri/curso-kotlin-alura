package entity.funcionario

import interfaces.Autenticavel

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
), Autenticavel {

    override fun bonificacao(): Double {
        return salario
    }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }

}