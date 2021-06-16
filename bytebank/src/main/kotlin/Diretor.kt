class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: String
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario * 0.3
    }

    override fun toString(): String {
        return "Diretor(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}