package fundamentos

fun main(){
    //parOuImpar(9)
    //parOuImpar(8)
    resultadoNota(3)
    resultadoNota(6)
    resultadoNota(9)

    println(parOuImpar(9))
    println(parOuImpar(8))
}

fun parOuImpar(numero: Int): String{
    return if (numero% 2 == 0){
        "Par"
    }else{
        "Impar"
    }
}

//nota => 7 - aprovado
//nota >= 6 - em recuperacao
//nota < 6 - reprovado

fun resultadoNota(nota: Int){
    if(nota >= 7){
        println("Aprovado")
    }else if(nota >= 6){
        println("Em recuperação")
    }else{
        println("Reprovado")
    }
}