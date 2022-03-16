package br.com.alura.bytebank.model

import br.com.alura.bytebank.model.funcionario.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

    fun registraAnyExample(funcionario: Any) {
        if (funcionario is Funcionario) { // smart cast tbm pode ser funcionario as Funcionario
            this.total += funcionario.bonificacao()
        }
    }

}