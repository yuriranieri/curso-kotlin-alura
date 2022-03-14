import entity.funcionario.Diretor
import entity.funcionario.Funcionario
import entity.funcionario.Gerente

fun main() {
    println("Bem vindo ao ByteBank")

    val alex = Funcionario(
        cpf = "111.111.111-11",
        nome = "Alex",
        salario = 1000.0
    )

    val fran = Gerente(
        cpf = "222.222.222-22",
        nome = "Fran",
        salario = 2000.0,
        senha = 1234
    )

    val gui = Diretor(
        cpf = "333.333.333-33",
        nome = "Gui",
        salario = 4000.0,
        senha = 12345678,
        plr = 200.0
    )

    println("alex: $alex")
    println("bonificacao alex ${alex.bonificacao()}\n")
    println("fran: $fran")
    println("bonificacao fran ${fran.bonificacao()}\n")
    println("gui: $gui")
    println("bonificacao gui ${gui.bonificacao()}")
    println("plr gui ${gui.plr}\n")

    if(gui.autentica(12345678)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
}