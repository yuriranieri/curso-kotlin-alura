package br.com.alura.bytebank.model.enums

enum class TipoFuncionario(val id: Int, val porcentagemBonificao: Double) {
    COMUM(0, 0.1),
    GERENTE(1, 0.2),
    DIRETOR(2, 0.5);

    companion object {
        fun getTipoById(id: Int): TipoFuncionario {
            when (id) {
                0 -> return COMUM
                1 -> return GERENTE
                2 -> return DIRETOR
                else -> {
                    return COMUM
                }
            }
        }

        fun getById(id: Int): TipoFuncionario {
            return try {
                values()
                    .first { tipoFuncionario -> tipoFuncionario.id == id }
            } catch (ex: NoSuchElementException) {
                COMUM
            }
        }
    }
}