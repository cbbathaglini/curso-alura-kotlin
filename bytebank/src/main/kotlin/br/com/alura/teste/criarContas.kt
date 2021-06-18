import br.com.alura.modelo.ContaPoupanca

fun criarContas(){
    val contaCah = ContaPoupanca("Carine", 4859)
//    contaCah.titular = "Carine"
//    contaCah.numero = 1000
    contaCah.depositar(300.0)
    println(contaCah)


    val contaAlex = ContaPoupanca("Alex",1001)
    val contaAlexOrdem = ContaPoupanca(numero = 1001, titular = "Alex") // pode mudar a ordem
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1001
    contaAlex.depositar(450.0)
    println(contaAlex)

    val contaCa = ContaPoupanca("Carine",2443)
}