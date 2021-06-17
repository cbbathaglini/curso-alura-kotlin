// Ctrl + Alt + l : arrumar identação

fun main(){
    println("Olá Mundo")

    //testes()

    val alex = Funcionario("Alex", "111.111.111-11", 1000.0)
    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Bonificação: ${alex.bonificacao()}")
    println(alex)

    val mari = Gerente("Mariana", "222.222.222-22", 2000.0,"4321")
    println("Nome: ${mari.nome}")
    println("CPF: ${mari.cpf}")
    println("Bonificação: ${mari.bonificacao()}")
    println(mari)

    val gui = Diretor("Mariana", "222.222.222-22", 4000.0, "1234", 200.0)
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Bonificação: ${gui.bonificacao()}")
    println(gui)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(mari)
    calculadora.registra(gui)

    println("Total de bonificação: ${calculadora.total}")
}


private fun testes() {
    val titular = "Alex"
    println("Titular: " + titular)
    println("Titular: $titular") //string template (Alt + Enter)

    val numeroConta = 1000
    var saldo = 0.0

    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

    saldo = 100.0
    println("Saldo: $saldo")

    saldo += 134.89
    println("Saldo: $saldo")

    testaCondicoes(saldo)
    testaLacoes()
    criarContas()
    testaCopiasEReferencias()
}


