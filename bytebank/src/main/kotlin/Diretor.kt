class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            println("Bonificação diretor")
            return (salario * 0.1 ) + salario + plr
        }


    override fun toString(): String {
        return "Diretor(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}