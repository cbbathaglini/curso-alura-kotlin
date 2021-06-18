package br.com.alura.modelo

class SistemaInterno {

    fun entra(admin : Autenticavel, senha: String){
       if(admin.autentica(senha)){
           println("Bem vindo ao bytebank...autenticou")
       }else{
           println("Erro na autenticação")
       }
    }
}