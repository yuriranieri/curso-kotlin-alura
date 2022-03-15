package entity

import interfaces.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticavel