package br.com.alura.teste

import br.com.alura.modelo.BancoDeNomes
import br.com.alura.modelo.Pedido

fun testesCollection1(){
    val nomesCol : Collection<String> = listOf("Alex","Fran","Gui","Maria", "Fran")
    val nomesIt : Iterable<String> = listOf("Alex","Fran","Gui","Maria", "Fran")

    println("NomesCol: "+ nomesCol)
    println("NomesIt: "+ nomesIt)

    println("\n-------- nome in nomesIt -------->")
    for (nome in nomesIt){
        println(nome)
    }

    println("\n-------- nome in nomesIt.iterator() -------->")
    for (nome in nomesIt.iterator()){
        println(nome)
    }

    println("Tem Alex? ${nomesIt.contains("Alex")}")

    println("Tamanho coleção? ${nomesCol.size}")
    println("Tamanho iterable? Não tem")

    val nomesMutCol : MutableCollection<String> = mutableListOf("Alex","Fran","Gui","Maria", "Fran")
    val nomesMutIt : MutableIterable<String> = mutableListOf("Alex","Fran","Gui","Maria", "Fran")


    //tipos de coleção
    val banco = BancoDeNomes()
    //banco.nomes.add("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)

    //copiando coleções
    val nomesSalvos : MutableCollection<String> = banco.nomes as MutableCollection<String>
    nomesSalvos.add("Paulo") //shallow copy

    println(nomesSalvos)

    // Erro lançado ao colocar:
    //     val nomes: Collection<String> get() = dados.toList()
    //     em BancoDeNomes class
    //  Exception in thread "main" java.lang.ClassCastException: kotlin.collections.EmptyList cannot be cast to kotlin.collections.MutableCollection
    //	at br.com.alura.teste.TestesCollectionKt.testesCollection1(testesCollection.kt:38)
    //	at MainKt.main(main.kt:27)
    //	at MainKt.main(main.kt)



}

fun testesCollection2(){
    //devolvendo elementos com distinct
    val assistiramCursoAndroid : List<String> = listOf("Alex","Fran","Gui","Maria", "Fran")
    val assistiramCursoKotlin : List<String> = listOf("Fran","Maria","Fran","Michele")
    //val assistiramAmbos : MutableList<String> = mutableListOf<String>()
    val assistiramAmbos : List<String> = assistiramCursoAndroid + assistiramCursoKotlin
    println("Android + Kotlin: ${assistiramAmbos}")
    println("Android + Kotlin (distinct): ${assistiramAmbos.distinct()}")

    //utilizando set
    val assistiramCursoAndroidSet : Set<String> = setOf("Alex","Fran","Gui","Maria", "Fran")
    val assistiramCursoKotlinSet : Set<String> = setOf("Fran","Maria","Fran","Michele")

    println("--- SET ---")
    println("Android: ${assistiramCursoAndroidSet}")

    val assistiramAmbosSet : Set<String> = assistiramCursoAndroidSet + assistiramCursoKotlinSet
    println("Assistiram ambos: ${assistiramAmbosSet}")
    // println("Assistiram ambos: ${assistiramAmbosSet[0]}") --> erro
    println("\nUnion: " + assistiramCursoAndroidSet.union(assistiramCursoKotlinSet))
    println(assistiramCursoAndroidSet union assistiramCursoKotlinSet)

    println("\nSubtract: " + assistiramCursoAndroidSet.subtract(assistiramCursoKotlinSet))
    println(assistiramCursoAndroidSet subtract assistiramCursoKotlinSet)

    println("\nIntersect: " + assistiramCursoAndroidSet.intersect(assistiramCursoKotlinSet))
    println(assistiramCursoAndroidSet intersect assistiramCursoKotlinSet)

    val assistiramList : MutableList<String> = assistiramAmbos.toMutableList()
    assistiramList.add("Marcos")
    println("Lista ${assistiramList}")
    println("Lista --> Set ${assistiramList.toSet()}")

}

fun testesCollection3(){
    val pedidos: Map<Int, Double> = mapOf<Int,Double>(Pair(1, 20.0), Pair(2, 45.87), 3 to 23.78, 4 to 91.34)
    println("Pedidos: ${pedidos}")

    println("pedido 0: ${pedidos[0]}")
    println("pedido 1: ${pedidos[1]}")

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for(p: Map.Entry<Int,Double> in pedidos){
        println("Nº do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }


    //comportamentos de escrita do Map
    val pedidosMut: MutableMap<Int, Double> = mutableMapOf<Int,Double>(Pair(1, 20.0), Pair(2, 45.87), 3 to 23.78, 4 to 91.34)
    println("Pedidos: ${pedidos}")

    println("pedido 0: ${pedidos[0]}")
    println("pedido 1: ${pedidos[1]}")

    val pedidoMut = pedidos[1]
    pedidoMut?.let {
        println("pedido $it")
    }

    for(pedidoAux: Map.Entry<Int,Double> in pedidos){
        println("Nº do pedido: ${pedidoAux.key}")
        println("Valor do pedido: ${pedidoAux.value}")
    }

    pedidosMut[4] = 89.34
    pedidosMut.put(5,34.67)
    pedidosMut.putIfAbsent(6,324.67) // se não houver no índice 6 então insere, senão não muda
    println("PedidosMut: ${pedidosMut}")


}

fun testesCollection4(){
    val pedidos: Map<Int, Double?> = mapOf<Int,Double?>(Pair(1, 20.0), Pair(2, 45.87), 3 to 23.78, 4 to 91.34, 5 to null)
    println("Pedidos: ${pedidos}")

    val valorPedido = pedidos.getValue(5)
    println("ValorPedido: ${valorPedido}")

    //getOrElse: maior flexibilidade
    pedidos.getOrElse(1,{
        println("Não encontrou com indíce 1")
    })

    pedidos.getOrElse(5,{
        println("Não encontrou com indíce 5")
    })

    println("Pedido 1: ${pedidos.getOrDefault(1,-1)}")
    println("Pedido 5: ${pedidos.getOrDefault(5,-1)}")

    println("\nChaves: ${pedidos.keys}")
    for(numerosDePedido in pedidos.keys){
        print("${numerosDePedido}\t")
    }
    println()

    println("\nValues: ${pedidos.values}")
    for(valorDoPedido in pedidos.values){
        print("${valorDoPedido}\t")
    }
    println()

    pedidos.filter { (numero,valor) ->
        true
    }

    val pedidosAux: Map<Int, Double> = mapOf<Int,Double>(Pair(1, 20.0), Pair(2, 45.87), 3 to 23.78, 4 to 91.34, 5 to 210.8, 6 to 342.76)
    val pedidosFiltrados = pedidosAux.filter { (numero,valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("Pedidos filtrados: ${pedidosFiltrados}")

    val pedidosFiltradosValor = pedidosAux.filterValues { valor ->
        valor > 100.0
    }
    println("Pedidos filtrados (valor): ${pedidosFiltradosValor}")

    val pedidosFiltradosChave = pedidosAux.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Pedidos filtrados (chave): ${pedidosFiltradosChave}")


    //escrita específica de Map
    //println(pedidos + Pair(7, 92.5))
    println("pedidos + mapOf(7 to 92.5, 8 to 43.21): ${pedidos + mapOf(7 to 92.5, 8 to 43.21)}")
    println("pedidos - 6: ${pedidos - 6}") // 6 representa o valor que se quer tirar


    val pedidosTestaRemocao: Map<Int, Double> = mapOf<Int,Double>(Pair(1, 20.0), Pair(2, 45.87), 3 to 20.00, 4 to 91.34, 5 to 210.8, 6 to 342.76)
    //não foi ---------------------------------------------
//    pedidosTestaRemocao.keys.remove(2)
//    pedidosTestaRemocao.values.remove(20.0)
//
//    pedidosTestaRemocao -= 2
//    println("PedidosTestaRemocao: $pedidosTestaRemocao")
    //-----------------------------------------------------

}

fun testesCollection5(){
    //utilizando associação
    val pedidos = listOf(
        Pedido(numero = 1, valor = 30.60),
        Pedido(numero = 2, valor = 78.98),
        Pedido(numero = 3, valor = 267.67),
        Pedido(numero = 4, valor = 232.60),
        Pedido(numero = 5, valor = 30.53),
        Pedido(numero = 6, valor = 45.62)
    )
    println("Lista de pedidos: ${pedidos}")

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido:Pedido ->
        //Pair(pedido.numero,pedido)
        pedido.numero to pedido
    }
    println("Lista de pedidos mapeados: ${pedidosMapeados}")

    //frete grátis? acima de R$ 50,00
    val pedidoFreteGratis : Map<Pedido, Boolean> = pedidos.associateWith { pedido : Pedido ->
        pedido.valor >  50
    }
    println("Lista de pedidos com frete grátis: ${pedidoFreteGratis}")


    //utilizando o agrupamento
    //possibilidade falha
//    val mapa : Map<Boolean,Pedido> = pedidos.associateBy { pedido: Pedido ->
//        pedido.valor > 50.0
//    }
//    println("Mapa: ${mapa}")


    val pedidosFretesGratisAgrupados : Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido : Pedido ->
        pedido.valor >  50.0
    }
    println("PedidosFretesGratisAgrupados: ${pedidosFretesGratisAgrupados}")
    println("PedidosFretesGratisAgrupados: ${pedidosFretesGratisAgrupados[true]}")


    val  nomes = listOf(
        "Alex", "Fran", "Gui", "Michele", "Aria" ,"Felipe", "Natalia"
    )

    val agenda : Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println("Agenda: ${agenda}")
    println("Agenda['M']: ${agenda['M']}")

}