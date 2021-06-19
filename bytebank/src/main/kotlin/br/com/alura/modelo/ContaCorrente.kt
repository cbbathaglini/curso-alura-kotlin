package br.com.alura.modelo

class ContaCorrente (
    titular: Cliente,
    numero: Int
): Conta(titular = titular, numero = numero) {

    override fun sacar(valor:Double){
        val valorComTaxa = valor * 0.1
        if(this.saldo >= valor) {
            this.saldo -= valorComTaxa
        }
    }
}