package br.com.alura.modelo

abstract class Conta(
    var titular: String,
    var numero:Int = 0
){
    var saldo = 0.0
        protected set(value) {
            if(value > 0) {
                field = value
            }
            println("field: $field")
        }


    override fun toString(): String {
        return "br.com.alura.modelo.Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

    fun depositar(valor:Double){
        this.saldo +=valor; // mexendo no saldo do próprio objeto
    }


    abstract fun sacar(valor: Double)

    fun transferir(contaDestino: Conta, valor:Double): Boolean{
        if(this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.depositar(valor)
            return true
        }

        return false
    }


//    fun getSaldo():Double{
//        return this.saldo;
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor >= 0){ this.saldo = valor }
//    }


}