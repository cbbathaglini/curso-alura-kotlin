class Auxiliar  (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            println("Bonificação auxiliar")
            return (salario * 0.05 ) + salario
        }
}