class Analista( // open: dar a possibilidade de qq classe fazer a herança
    nome: String,
    cpf: String,
    salario: Double
    //val tipo: Int //0 - funcionário, 1- gerente, 2 - diretor, etc
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            println("Bonificação analista")
            return (salario * 0.1 )
        }

    override fun toString(): String {
        return "Analista(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}