package fundamentos

fun main(){
//    print1a10()
//    print10a1()
//    printPar10()
//    printRange(15,20)
    whileMenorQue10()
    doWhileMenorQue10()
}

fun whileMenorQue10(){
    var x = 10
    // primeiro faz a verificação depois printa
    while (x < 10){
        println(x)
        x++
    }
}

fun doWhileMenorQue10(){
    var x = 11
    //primeiro executa e depois verifica
    do{
        println(x)
        x++
    }while (x < 10)
}

fun print1a10(){
    for(numero in 1..10){
        println(numero)
    }
}

fun print10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}

fun printPar10(){
    for(numero in 2..10 step 2){
        println(numero)
    }
}

fun printRange(inicio: Int, fim: Int){
    for (numero in inicio..fim step 3){
        println(numero)
    }
}