package br.com.alura.bytebank.model.funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome,
    cpf,
    salario
) {

    override fun bonificacao(): Double {
        return salario * 0.1
    }

}