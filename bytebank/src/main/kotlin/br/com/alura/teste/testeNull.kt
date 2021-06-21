package br.com.alura.teste

import br.com.alura.modelo.Endereco
import java.lang.IllegalStateException

fun testeNull() {

    //var enderecoNulo : Endereco? = null // ? permite ser null
    //endereco!!.logradouro   //Exception in thread "main" java.lang.NullPointerException
    //	at MainKt.main(main.kt:20)
    //	at MainKt.main(main.kt)
    //val enderecoNaoNulo : Endereco = enderecoNulo!!
    //enderecoNaoNulo.logradouro

    //null safety
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }


    val a = "Kotlin"
    val c: String? = null
    println(c?.length)
    println(a?.length) // Unnecessary safe call



    var enderecoNulo : Endereco? = Endereco(logradouro = "rua xxxx") // ? permite ser null
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
        println("endereco.logradouro.length: " + endereco.logradouro.length)
    }

    enderecoNulo?.let {
        println("it.logradouro.length: " + it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println("Tam complemento: " +  tamanhoComplemento)

    }


    val numero: Int? = 10 as? Int
    println(numero)


}