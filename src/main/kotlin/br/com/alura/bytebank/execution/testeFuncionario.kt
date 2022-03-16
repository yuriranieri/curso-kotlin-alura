package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.CalculadoraBonificacao
import br.com.alura.bytebank.model.funcionario.Analista
import br.com.alura.bytebank.model.funcionario.Diretor
import br.com.alura.bytebank.model.funcionario.Gerente

fun testaFuncionario() {
    val alex = Analista(
        cpf = "111.111.111-11",
        nome = "Alex",
        salario = 1000.0
    )

    val maria = Analista(
        cpf = "444.444.444-44",
        nome = "maria",
        salario = 2000.0
    )

    val fran = Gerente(
        cpf = "222.222.222-22",
        nome = "Fran",
        salario = 3000.0,
        senha = 1234
    )

    val gui = Diretor(
        cpf = "333.333.333-33",
        nome = "Gui",
        salario = 4000.0,
        senha = 12345678,
        plr = 200.0
    )

    if (gui.autentica(12345678)) {
        println("autenticou com sucesson\n")
    } else {
        println("falha na autenticação\n")
    }

    val funcionarios = listOf(alex, fran, gui, maria)
    val calculadora = CalculadoraBonificacao()

    println("total calculadora antes do for ${calculadora.total}\n")
    funcionarios.forEach { funcionario ->
        println("${funcionario.nome}: $funcionario")
        println("bonificação ${funcionario.nome}: ${funcionario.bonificacao()}\n")
        calculadora.registra(funcionario)
    }
    println("total calculadora depois do for ${calculadora.total}")
}