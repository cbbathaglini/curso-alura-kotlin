import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("X: $numeroX")
    println("Y: $numeroY")

    val contaJoao = ContaCorrente(titular = "João", numero = 3421)
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

    val contaMarcos = ContaCorrente("Marcos", 9088)
    //contaMarcos.titular = "Marcos"

    println("Transferindo...")
    contaJoao.transferir(contaMarcos,40.56)
    println("Fim transferência... ori: $contaJoao dst: $contaMarcos")



    val contaJoaoCorrente = ContaPoupanca(titular = "João", numero = 4444)
}