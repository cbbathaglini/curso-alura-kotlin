package br.com.alura.teste

import br.com.alura.exception.SaldoInsuficienteException
import java.lang.ArithmeticException
import java.lang.NumberFormatException



fun testaExcecoes() {
    val entrada: String = "1,9"
    var valor: Double = 0.0
    try {
        valor = entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão...")
        // java.lang.NumberFormatException: For input string: "1,9"
        //	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        //	at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        //	at java.base/java.lang.Double.parseDouble(Double.java:543)
        //	at MainKt.main(main.kt:17)
        //	at MainKt.main(main.kt)
        e.printStackTrace()
    }


    val valorComTaxa: Double? = if (valor != null) {
        valor + 0.1
    } else {
        null
    }

    val valorComTaxa2: Double? = when {
        valor != null -> {
            valor + 0.1
        }
        else -> {
            null
        }
    }


}

fun funcao1(){
    println("Início funcao 1 ")
    funcao2()
    println("Fim funcao 1 ")
}

fun funcao2(){
    println("Início funcao 2 ")
    funcao3()
    println("Fim funcao 2 ")
}


fun funcao3(){
    println("Início funcao 3 ")

    for(i in 1..5){

        // Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class br.com.alura.modelo.Endereco
        // (java.lang.Object is in module java.base of loader 'bootstrap'; br.com.alura.modelo.Endereco is in unnamed module of loader 'app')
        // tentando converter a classe de um tipo não compatível
        //val endereco = Any()
        //endereco as Endereco


        //val endereco = Any()
        //endereco as Endereco
        //throw  ClassCastException()
        throw  SaldoInsuficienteException()


        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at MainKt.funcao3(main.kt:39)
        //	at MainKt.funcao2(main.kt:24)
        //	at MainKt.funcao1(main.kt:18)
        //	at MainKt.main(main.kt:11)
        //	at MainKt.main(main.kt)
        // var x = 10
        // println(x/0)

        try{
            10/0
        }catch (e: ArithmeticException){
            println("stack: " + e.stackTrace.toString())
            println("message: " + e.message)
            println("cause: " + e.cause)
            println("ARITHMETIC EXCEPTION")
        }

        println(i)
    }
    println("Fim funcao 3 ")
}


fun recursao(){
    return recursao()
}
