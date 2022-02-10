package fundamentos

fun retornaNumeroporExtenso(numero: Int): String{
    if(numero == 5){
      return "Cinco"
    } else if (numero == 6){
        return "Seis"
    }else{
        return "Numero não mapeado"
    }
}

fun main(){
    println(retornaNumeroporExtenso(numero = 10))
}