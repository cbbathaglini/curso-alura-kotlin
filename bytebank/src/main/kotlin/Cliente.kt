class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String,
):Autenticavel {
    override fun autentica(senha: String): Boolean {
        println("Autentica cliente...")
        if(this.senha == senha){
            return true
        }
        return false
    }


}