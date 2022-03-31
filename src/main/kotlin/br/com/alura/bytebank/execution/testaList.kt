package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Livro
import br.com.alura.bytebank.model.Pratileira

fun testaList() {
    livros.imprimeComMarcadores()
    println("ordenado por titulo:")
    livros.sortedBy { it.titulo }.imprimeComMarcadores()
    println("ordenado por autor:")
    livros.sortedBy { it.autor }.imprimeComMarcadores()
    println("ordenado por ano de publicacao:")
    livros.sortedBy { it.anoPublicacao }.imprimeComMarcadores()

    livros.filter { it.autor.startsWith("J") }.imprimeComMarcadores()
}

fun testaListComNull() {
    livros.groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}

fun testaPratileira() {
    val pratileira = Pratileira(genero = "literatura ", livrosMutaveis = livros, livrosImutaveis = livros)
    println("Livros mutaveis")
    val organizarPorAutorMutavel = pratileira.organizarPorAutorMutavel()
    val organizarPorAnoPublicacaoMutavel = pratileira.organizarPorAnoPublicacaoMutavel()
    organizarPorAutorMutavel.imprimeComMarcadores()
    organizarPorAnoPublicacaoMutavel.imprimeComMarcadores()
    println("Livros imutaveis")
    val organizarPorAutorImutavel = pratileira.organizarPorAutorImutavel()
    val organizarPorAnoPublicacaoImutavel = pratileira.organizarPorAnoPublicacaoImutavel()
    organizarPorAutorImutavel.imprimeComMarcadores()
    organizarPorAnoPublicacaoImutavel.imprimeComMarcadores()
}

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this.filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} escrito por ${it.autor} em ${it.anoPublicacao}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}