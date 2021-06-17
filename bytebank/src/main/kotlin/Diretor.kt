class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }

    override fun toString(): String {
        return "Diretor(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}