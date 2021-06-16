// Ctrl + Alt + l : arrumar identação

fun main(){
    println("Olá Mundo")

    testes()

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


