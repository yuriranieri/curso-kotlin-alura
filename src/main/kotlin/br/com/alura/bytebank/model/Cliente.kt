package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.interfaces.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticavel