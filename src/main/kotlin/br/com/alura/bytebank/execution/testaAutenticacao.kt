package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.SistemaInterno
import br.com.alura.bytebank.model.funcionario.Diretor
import br.com.alura.bytebank.model.funcionario.Gerente

fun testaAutenticacao() {
    val gerente = Gerente(
        cpf = "222.222.222-22",
        nome = "alex",
        salario = 3000.0,
        senha = 1234
    )

    val diretor = Diretor(
        cpf = "333.333.333-33",
        nome = "Gui",
        salario = 4000.0,
        senha = 12345678,
        plr = 200.0
    )

    val cliente = Cliente(
        cpf = "222.222.222-22",
        nome = "alex",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretor, diretor.senha)
    sistemaInterno.entra(cliente, cliente.senha)
}