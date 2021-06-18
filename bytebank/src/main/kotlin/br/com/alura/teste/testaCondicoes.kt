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