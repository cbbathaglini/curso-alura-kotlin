package br.com.alura.teste

import br.com.alura.modelo.Livro

fun listarLivros(){
    val livro1 = Livro(
        titulo = "LIVRO 1",
        autor = "Autor 1",
        anoPublicacao = 1990,
        editora = "editora 1"
    )

    val livro2 = Livro(
        titulo = "LIVRO 2",
        autor = "Autor 2",
        anoPublicacao = 2001,
        editora = "editora 2"
    )

    val livro3 = Livro(
        titulo = "LIVRO 3",
        autor = "Autor 3",
        anoPublicacao = 1856,
        editora = "editora 1"
    )

    val livro4 = Livro(
        titulo = "LIVRO 4",
        autor = "Autor 4",
        anoPublicacao = 1987,
        editora = "editora 4"
    )

    var livros:MutableList<Livro> = mutableListOf(livro1, livro2,livro3,livro4)
    livros.add(
        Livro(
            titulo = "Livro livro",
            autor = "Autor autor",
            anoPublicacao = 2007,
            editora = "editora zzz"
        )
    )

    println(livros)
    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPubl : List<Livro> = livros.sorted()
    println("-- ordenado por ano de publicação")
    ordenadoAnoPubl.imprimeComMarcadores()

    val ordenadoPorTitulo : List<Livro> = livros.sortedBy { it.titulo }
    println("-- ordenado por título")
    ordenadoPorTitulo.imprimeComMarcadores()

    val ordenadoPorAutor : List<Livro> =  livros.sortedBy { it.autor }
    println("-- ordenado por autor")
    ordenadoPorAutor.imprimeComMarcadores()


    //teste
    livrosMut
        .filter{ it.autor == "Autor 4" }
        .imprimeComMarcadores()

    livrosMut
        .filter{ it.autor.startsWith("Autor 1") }
        .sortedBy{ it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos : List<String> = livrosMut
        .filter{ it.autor.startsWith("Autor 1") }
        .sortedBy{ it.anoPublicacao }
        .map{ it.titulo}

    println("Títulos: " + titulos)
}


fun List<Livro>.imprimeComMarcadores(){
    val join = this.joinToString(separator = "\n"){
        " - ${it.titulo} de ${it.autor}"
    }
    println("------------ Lista de Livros --------------\n$join")

}