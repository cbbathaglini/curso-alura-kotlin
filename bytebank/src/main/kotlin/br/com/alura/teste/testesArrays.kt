package br.com.alura.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testesArrays(){
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33

    val maiorIdade = if(idade1 > idade2 && idade1 > idade3){
        idade1
    }else if(idade2 > idade1 && idade2 > idade3){
        idade2
    }else{
        idade3
    }

    println("Maior idade: "+ maiorIdade)


    // iterando array
    val idades = IntArray(5)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    idades[4] = 55

    var maiorIdadeArr : Int = 0
    for(idade in idades){
        if(idade >= maiorIdadeArr){
            maiorIdadeArr = idade
        }
    }
    println("Maior idade: "+ maiorIdadeArr)


    // iterando array Of
    val idadesArrayOf = intArrayOf(25,19,33,20,55)
    var maiorIdadeArrOf : Int = 0
    for(idade in idades){
        if(idade >= maiorIdadeArrOf){
            maiorIdadeArrOf = idade
        }
    }
    println("Maior idade: "+ maiorIdadeArrOf)


    // iterando array com for each
    var maiorIdadeForEach : Int = 0
    idades.forEach { idade ->
        if(idade >= maiorIdadeForEach){
            maiorIdadeForEach = idade
        }
    }
    println("Maior idade: "+ maiorIdadeArrOf)

    var menorIdadeForEach : Int = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade <= menorIdadeForEach){
            menorIdadeForEach = idade
        }
    }
    println("Menor idade: "+ menorIdadeForEach)
}

fun testesSalariosArrays(){

    //teste 1
    val salarios1: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.76, 8970.9, 10000.0)
    var i:Int = 0
    val aumento = 1.1; //aumento de 10%
    salarios1.forEach { salario -> // salário é imutável
        salarios1[i++] = salario * aumento

    }
    println("Array de salários: "+ salarios1.contentToString())

    //teste 2
    val salarios2: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.76, 8970.9, 10000.0)
    for(indice in salarios2.indices){
        salarios2[indice] = salarios2[indice] * aumento
    }
    println("Array de salários: "+ salarios2.contentToString())


    //teste 3
    val salarios3: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.76, 8970.9, 10000.0)
    salarios3.forEachIndexed{ indice, salario ->
        salarios3[indice] = salario * aumento
    }
    println("Array de salários: "+ salarios3.contentToString())


}

fun testesRange(){
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        println("$s")
    }


    //teste 2
    1..10 // = val serie: IntRange = 1.rangeTo(10)
    val numerosPares = 1..10 step 2
    for(numeroPar in numerosPares){
        println("$numeroPar")
    }


    //teste 4
    val numerosPares2 = 2.until(100) step 2
    for(numeroPar in numerosPares2){
        print("$numeroPar ")
    }
    println()

    //teste 5
    val numerosParesReverso = 100 downTo 0 step 2
    for(numeroPar in numerosParesReverso){
        print("$numeroPar ")
    }
    println()

    //teste 6
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if(salario in intervalo){
        println("O salário ESTÁ no intervalo")
    }else{
        println("O salário NÃO ESTÁ no intervalo")
    }


    //teste 7
    val intervaloLetras = 'a'..'z'
    val letra = 'k'
    if(letra in intervaloLetras){
        println("A letra ESTÁ no intervalo")
    }else{
        println("A letra NÃO ESTÁ no intervalo")
    }
}

fun testesOpAgregacao(){
    //teste 1
    val idades: IntArray = intArrayOf(10,12,18,33,40,67)
    println("Maior idade: " + idades.max())
    println("Menor idade: " + idades.min())
    println("Média de idades: " + idades.average())

    //teste 2
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")


    //teste 3
    val algumMaior = idades.any { it >= 18 }
    println("Algum é maior? $algumMaior")

    //teste 4
    val maiores = idades.filter { it >= 18 }
    println("Maiores $maiores")

    //teste 5
    val busca = idades.filter { it == 18 }
    println("Busca $busca")
}

fun testesArraysObjs(){
    //teste 1
    val salarios = Array<BigDecimal>(5){ BigDecimal.ZERO} //todos inicializados com 0s
    salarios[0] = "1256.78".toBigDecimal()
    salarios[1] = "345.93".toBigDecimal()
    salarios[2] = "965.28".toBigDecimal()
    println("Salários: " +salarios.contentToString())

    //teste 2
    val salariosArrOf = bigDecimalArrayOf("1256.78","345.93","965.28") //todos inicializados com 0s
    println("Salários: " +salariosArrOf.contentToString())

    //teste 3
    val aumento = "1.1".toBigDecimal(); //aumento de 10%
    val salariosComAumento: Array<BigDecimal> = salarios.map { salario ->
        if(salario < "5000".toBigDecimal()){
            salario + "500".toBigDecimal()
        }else{
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println("Salários com aumento: " +salariosComAumento.contentToString())


    //teste 4
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial: " + gastoInicial)

    //teste 5
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial){ acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto inicial: " + gastoTotal)


    //teste 6
    val salarioOrdCresc = salarios.sorted()
    val tresUltimosSalarios = salarioOrdCresc.takeLast(3).toTypedArray()
    println("Ordenado crescentemente: " +   salarioOrdCresc)
    //println("Ordenado decrescentemente: " +   salarios.sortedArrayDescending())
    println("Três últimos: " +   tresUltimosSalarios)
    println("Média dos três últimos salários: " +   tresUltimosSalarios.media())


    //teste 7
    val media = salarios.sorted().takeLast(3).toTypedArray().media()
    println("Ordenado crescentemente: " +   salarios.sorted())
    println("Três últimos: " +   salarios.sorted().takeLast(3).toTypedArray())
    println("Média dos três últimos salários: " +   media)
}

fun bigDecimalArrayOf(vararg valores:String): Array<BigDecimal>{ //vararg = passar argumentos variáveis
    return Array<BigDecimal>(valores.size) {i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria():BigDecimal{
    return this.reduce{acumulador, bigdecimal ->
        acumulador + bigdecimal
    }
}

fun Array<BigDecimal>.media():BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}