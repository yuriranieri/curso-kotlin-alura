package entity

import entity.funcionario.FuncionarioAdmin
import entity.funcionario.Gerente

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank autenticacao realizada")
        } else {
            println("falha na autenticacao")
        }
    }

}