package br.com.alura.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
): FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha), Autenticavel {


    override val bonificacao: Double
        get() {
            println("Bonificação diretor")
            return (salario * 0.1 ) + salario + plr
        }




    override fun toString(): String {
        return "br.com.alura.modelo.Diretor(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}