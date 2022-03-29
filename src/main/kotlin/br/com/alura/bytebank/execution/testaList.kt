package br.com.alura.bytebank.execution

import br.com.alura.bytebank.model.Livro

fun testaList() {
    val livro1 = Livro(titulo = "Grande Sertão: Veredas", autor = "João Guimarães Rosa", anoPublicacao = 1956)
    val livro2 =
        Livro(titulo = "Minha vida de menina", autor = "Helena Morley", anoPublicacao = 1942, editora = "Editora a")
    val livro3 = Livro(
        titulo = "Memórias Pòstumas de Brás Cubas", autor = "Machado de Assis", anoPublicacao = 1881)
    val livro4 = Livro(titulo = "Iracema", autor = "José de Alencar", anoPublicacao = 1865, editora = "Editora b")

    val livros = mutableListOf(livro1, livro2, livro3, livro4)
    livros.imprimeComMarcadores()
    println("ordenado por titulo:")
    livros.sortedBy { it.titulo }.imprimeComMarcadores()
    println("ordenado por autor:")
    livros.sortedBy { it.autor }.imprimeComMarcadores()
    println("ordenado por ano de publicacao:")
    livros.sortedBy { it.anoPublicacao }.imprimeComMarcadores()

    livros.filter { it.autor.startsWith("J") }.imprimeComMarcadores()
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} escrito por ${it.autor} em ${it.anoPublicacao}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}