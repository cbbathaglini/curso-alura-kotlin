// Ctrl + Alt + l : arrumar identação

fun main(){
    println("Olá Mundo")

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

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("X: $numeroX")
    println("Y: $numeroY")

    val contaJoao = Conta(titular = "João")
    //contaJoao.titular = "João"
    var contaMaria = contaJoao //por referência = mesmo espaço na memória que foi reservado
    contaMaria.titular = "Maria"

    println("Maria: $contaMaria")
    //println("Maria: ${contaMaria.titular}")
    println("João: $contaJoao")

    //contaJoao.saldo += 20.98
    println("Depositando...")
    contaJoao.depositar(120.76)
    println("Fim depósito... $contaJoao")


    println("Sacando...")
    contaJoao.sacar(2.89)
    println("Fim saque... $contaJoao")

    val contaMarcos = Conta("Marcos")
    //contaMarcos.titular = "Marcos"

    println("Transferindo...")
    contaJoao.transferir(contaMarcos,40.56)
    println("Fim transferência... ori: $contaJoao dst: $contaMarcos")
}



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



fun testaLacoes(){
    // Estruturas de repetição

    for (i in 1..10) {
        val titularAuxiliar = "Nome auxilar $i"
        println(titularAuxiliar)
    }

    println("\ndownTo: ")
    for (i in 20 downTo 1 step 2) {
        val titularAuxiliar = "Nome auxilar $i"
        println(titularAuxiliar)
    }


    println("\nbreak: ")
    for (i in 20 downTo 1) {
        if( i < 10){
            break;
        }
        println(i)
    }

    var x = 25
    while (x > 10) {
        println(x)
        x--
    }


    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

fun testaCondicoes(saldo:Double){
    if (saldo >= 0.0){
        println("+")
    }else if (saldo == 0.0){
        println("-+")
    }else{
        println("-")
    }

    when {
        saldo >= 0.0 -> {
            println("+")
        }
        saldo == 0.0 -> {
            println("-+")
        }
        else -> {
            println("-")
        }
    }
}