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