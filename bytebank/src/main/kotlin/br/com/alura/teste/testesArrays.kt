package br.com.alura.teste

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