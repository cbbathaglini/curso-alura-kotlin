// Ctrl + Alt + l : arrumar identação

fun main(){
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

    //val autenticavel: Autenticavel = Diretor("Mariana", "333.333.333-33", 4000.0, "1234", 200.0)
    val autenticavel: Autenticavel = Gerente("Mariana", "222.222.222-22", 2000.0, "4321")
}

