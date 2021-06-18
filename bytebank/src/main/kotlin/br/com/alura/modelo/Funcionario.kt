package br.com.alura.modelo

abstract class Funcionario( // abstract: funcionário não representa algo real, ngm cria este objeto
    val nome: String,
    val cpf: String,
    val salario: Double,
    //val tipo: Int //0 - funcionário, 1- gerente, 2 - diretor, etc
){

    abstract val bonificacao: Double

    override fun toString(): String {
        return "br.com.alura.modelo.Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

//    fun autentica(senha: Int):boolean{
//        if(this.s == senha){
//            return true
//        }
//        return false
//    }

}