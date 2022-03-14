import entity.conta.ContaCorrente
import entity.conta.ContaPoupanca

fun main() {
    println("Bem vindo ao ByteBank")

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Alex",
        numero = 1000
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("contaCorrente deposito: $contaCorrente")
    println("contaPoupanca deposito: $contaPoupanca\n")

    contaPoupanca.sacar(100.0)
    contaCorrente.sacar(100.0)

    println("contaCorrente saque: $contaCorrente")
    println("contaPoupanca saque: $contaPoupanca\n")

    contaPoupanca.transferir(contaCorrente, 100.0)
    println("contaPoupanca apos fazer transferencia: $contaPoupanca")
    println("contaCorrente apos receber transferencia: $contaCorrente\n")

    contaCorrente.transferir(contaPoupanca, 100.0)
    println("contaCorrente apos fazer transferencia: $contaCorrente")
    println("contaPoupanca apos receber transferencia: $contaPoupanca\n")

}