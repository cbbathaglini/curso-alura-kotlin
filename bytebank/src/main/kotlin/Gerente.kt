class Gerente  (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            println("Bonificação gerente")
            return (salario * 0.1 ) + salario
        }
}