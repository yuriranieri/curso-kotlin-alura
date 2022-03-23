package br.com.alura.bytebank.execution

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.model.conta.ContaCorrente
import br.com.alura.bytebank.model.conta.ContaPoupanca

fun testaComportamentosConta() {
    val yuri = Cliente(nome = "Yuri Ranieri", cpf = "111.111.111-11", senha = 123, endereco = Endereco(estado = "sc"))
    val robson = Cliente(nome = "Robson", cpf = "222.222.222-22", senha = 231)
    val contaYuri = ContaCorrente(yuri, 814)
    val contaRobson = ContaPoupanca(robson, 777)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")
    contaYuri.saldo

    contaYuri.depositar(10000.0)
    contaRobson.depositar(5000.0)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")

    contaYuri.transferir(contaRobson, 234.50, yuri.senha)

    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")

//    contaYuri.transferir(contaYuri, 234.50, yuri.senha)
    println("Yuri: $contaYuri")
    println("Robshow: $contaRobson \n")

    try {
        contaRobson.transferir(contaDestino = contaYuri, valor = 10000000.0, senha = robson.senha)
        println("Transferencia sucesso")
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na autenticação senha incorreta para o titular ${contaRobson.titular.nome}")
    } catch (e: SaldoInsuficienteException) {
        println("Saldo insuficiente para saque")
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

}