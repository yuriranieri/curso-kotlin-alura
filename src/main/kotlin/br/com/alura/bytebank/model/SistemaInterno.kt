package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.interfaces.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank autenticacao realizada")
        } else {
            println("falha na autenticacao")
        }
    }

}