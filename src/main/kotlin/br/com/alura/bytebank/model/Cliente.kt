package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.interfaces.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    override val senha: Int,
) : Autenticavel {

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco, senha=$senha)"
    }
}