abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

     fun autentica(senha: String): Boolean {
         println("Autentica funcionário admin...")
        if(this.senha == senha){
            return true
        }
        return false
    }
}