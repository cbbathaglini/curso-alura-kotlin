fun criarContas(){
    val contaCah = Conta("Carine")
//    contaCah.titular = "Carine"
//    contaCah.numero = 1000
    contaCah.depositar(300.0)
    println(contaCah)


    val contaAlex = Conta("Alex",1001)
    val contaAlexOrdem = Conta(numero = 1001, titular = "Alex") // pode mudar a ordem
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1001
    contaAlex.depositar(450.0)
    println(contaAlex)

    val contaCa = Conta("Carine",2443)
}