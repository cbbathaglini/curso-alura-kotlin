class Gerente  (
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha),
Autenticavel{


    override val bonificacao: Double
        get() {
            println("Bonificação gerente")
            return (salario * 0.1 ) + salario
        }
}