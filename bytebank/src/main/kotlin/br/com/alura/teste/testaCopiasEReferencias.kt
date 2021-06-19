import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("X: $numeroX")
    println("Y: $numeroY")

    val joao = Cliente(nome = "João", cpf = "786.666.334-98", senha = "1234")
    val contaJoao = ContaCorrente(titular = joao, numero = 3421)
    //contaJoao.titular = "João"
    var contaMaria = contaJoao //por referência = mesmo espaço na memória que foi reservado

    val maria = Cliente(nome = "Maria", cpf = "456.234.678-34", senha = "1234")
    contaMaria.titular = maria

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

    val marcos = Cliente(nome = "Marcos", cpf = "345.678.231-77", senha = "1234")
    val contaMarcos = ContaCorrente(marcos, 9088)
    //contaMarcos.titular = "Marcos"

    println("Transferindo...")
    contaJoao.transferir(contaMarcos,40.56)
    println("Fim transferência... ori: $contaJoao dst: $contaMarcos")

    println("Conta titular CPF: ${contaJoao.titular.cpf}")



    val contaJoaoCorrente = ContaPoupanca(titular = joao, numero = 4444)
}