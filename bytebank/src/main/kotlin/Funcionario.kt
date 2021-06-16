open class Funcionario( // open: dar a possibilidade de qq classe fazer a herança
    val nome: String,
    val cpf: String,
    val salario: Double,
    //val tipo: Int //0 - funcionário, 1- gerente, 2 - diretor, etc
){

    open fun bonificacao(): Double{
        return salario * 0.1
    }

//    outra opção:
//    open val bonificacao: Double
//       get() {
//          return salario * 0.1
//       }

    // outra opção:
    //open val bonificacao: Double get() = salario * 0.1



//
//    fun autenticacao(senha: Int){
//        if(tipo == 2){
//
//        }
//    }

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}