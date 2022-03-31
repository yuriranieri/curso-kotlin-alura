package br.com.alura.bytebank.model

data class Pratileira(
    val genero: String,
    val livrosMutaveis: MutableList<Livro>,
    val livrosImutaveis: List<Livro>,
) {
    fun organizarPorAutorMutavel(): MutableList<Livro> {
        livrosMutaveis.sortBy { it.autor } // sort will be applied on original list. but not return anything
        return livrosMutaveis
    }

    fun organizarPorAnoPublicacaoMutavel(): MutableList<Livro> {
        livrosMutaveis.sortBy { it.anoPublicacao }
        return livrosMutaveis
    }

    fun organizarPorAutorImutavel(): List<Livro> {
        return livrosImutaveis.sortedBy { it.autor } // sort will be applied on original list. but not return anything
    }

    fun organizarPorAnoPublicacaoImutavel(): List<Livro> {
        return livrosImutaveis.sortedBy { it.anoPublicacao }
        // sorted will not change original list but returns new list after applying changes
    }
}