package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.funcionario.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

}