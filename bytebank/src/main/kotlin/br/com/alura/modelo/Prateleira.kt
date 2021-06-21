package br.com.alura.modelo

data class Prateleira (
    val genero : String,
    val livros : MutableList<Livro>
){
    fun organizadorPorAutor() : MutableList<Livro>{
        livros.sortBy { it.autor }
        return livros
    }

    fun organizadorPorAnoPublicacao() : MutableList<Livro>{
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}