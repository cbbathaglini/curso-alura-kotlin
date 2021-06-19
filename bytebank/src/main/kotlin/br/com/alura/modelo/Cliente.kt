package br.com.alura.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: String,
): Autenticavel {
    override fun autentica(senha: String): Boolean {
        println("Autentica cliente...")
        if(this.senha == senha){
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco, senha='$senha')"
    }


}