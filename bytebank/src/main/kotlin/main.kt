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

    val contaCah = Conta()
    contaCah.titular = "Carine"
    contaCah.numero = 1000
    contaCah.saldo = 300.0
    println(contaCah)


    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.saldo = 450.0
    println(contaAlex)
}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }


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