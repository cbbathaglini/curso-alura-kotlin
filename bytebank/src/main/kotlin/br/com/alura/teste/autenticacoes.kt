package br.com.alura.teste

import br.com.alura.modelo.Autenticavel
import br.com.alura.modelo.Cliente
import br.com.alura.modelo.Gerente
import br.com.alura.modelo.SistemaInterno

fun autenticacoes(){
    val mari = Gerente("Mariana", "222.222.222-22", 2000.0, "4321")
    println("Nome: ${mari.nome}")
    println("CPF: ${mari.cpf}")
    println("Bonificação: ${mari.bonificacao}")
    println(mari)

    val sistema = SistemaInterno()
    sistema.entra(mari,"4321")

    val cliente = Cliente(
        nome = "Gui",
        cpf = "666.666.666-66",
        senha = "5698"
    )
    sistema.entra(cliente,"5698")

    //val autenticavel: br.com.alura.modelo.Autenticavel = br.com.alura.modelo.Diretor("Mariana", "333.333.333-33", 4000.0, "1234", 200.0)
    val autenticavel: Autenticavel = Gerente("Mariana", "222.222.222-22", 2000.0, "4321")
}