package br.com.alura.modelo

import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    var numero:Int = 0
){
    var saldo = 0.0
        protected set(value) {
            if(value > 0) {
                field = value
            }
            println("field: $field")
        }
    companion object{
        var total = 0
            private set
    }

    var total = 0

    init {
        println("Criando conta...")
    }

    override fun toString(): String {
        return "br.com.alura.modelo.Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

    fun depositar(valor:Double){
        this.saldo +=valor; // mexendo no saldo do próprio objeto
    }

    abstract fun sacar(valor: Double)

    fun transferir(contaDestino: Conta, valor:Double, senha: String): Boolean{

        if(!this.titular.autentica(senha)){
            throw FalhaAutenticacaoException(mensagem = "Falha na autenticação")
        }

        if(this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.depositar(valor)
            return true
        }

        throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído: $valor")
    }


//    fun getSaldo():Double{
//        return this.saldo;
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor >= 0){ this.saldo = valor }
//    }


}