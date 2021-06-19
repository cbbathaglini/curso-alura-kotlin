package br.com.alura.teste

import br.com.alura.modelo.*

fun varGlobalEObject() {
    val palavra : kotlin.String = ""

    //criarContas()
    //autenticacoes()

    val cliente = Cliente(nome = "Carine", cpf = "000.000.000-00",senha = "!234")
    val clienteNovo = br.com.alura.modeloAux.Cliente(nome = "CarineAux", cpf = "000.000.000-00",senha = "!2E4")

    var totalContas :Int = 0

    ContaPoupanca(titular = cliente,1246)
    ContaCorrente(titular = cliente,1247)
    totalContas++

    println("Total de contas: ${totalContas}")


    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf : String = "786.987.675-90"
        val senha : String = "1000"

        override fun autentica(senha:String) = this.senha == senha

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, "1000")

    println("Nome do cliente: ${fran.nome}")
}