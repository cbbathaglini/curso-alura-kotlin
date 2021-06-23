package br.com.alura.modelo

class Pedido(val numero: Int, val valor:Double) {
    override fun toString(): String {
        return "Pedido(numero=$numero, valor=$valor)"
    }
}