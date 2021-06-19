import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaPoupanca
import br.com.alura.modelo.Endereco

fun criarContas(){

    val carine = Cliente(nome = "Carine", cpf = "786.666.334-98", senha = "1234")
    val contaCah = ContaPoupanca(carine, 4859)
//    contaCah.titular = "Carine"
//    contaCah.numero = 1000
    contaCah.depositar(300.0)
    println(contaCah)

    val alex = Cliente(nome = "Alex", cpf = "456.275.789-52", senha = "6985",
        endereco = Endereco(
            logradouro = "Rua xxx",
            numero = 1023,
            bairro = "Bairro yyy",
            cidade = "Cidade eeee",
            estado = "Estado uuuu",
            cep= "91280200-00",
            complemento = "complemento tttt"
        )
    )
    val contaAlex = ContaPoupanca(alex,1001)
    val contaAlexOrdem = ContaPoupanca(numero = 1001, titular = alex) // pode mudar a ordem
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1001
    contaAlex.depositar(450.0)
    println(contaAlex)

    val contaCa = ContaPoupanca(carine,2443)
}