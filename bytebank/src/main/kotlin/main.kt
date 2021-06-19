import br.com.alura.modelo.*
import java.util.*

// Ctrl + Alt + l : arrumar identação

var totalContas : Int = 0

fun main(){

    println("Início main ")
    funcao1()
    println("Fim main ")

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
        println(i)
    }
    println("Fim funcao 3 ")
}

