package fundamentos

fun main(){
    println(retornaNome())
    var nome = retornaNome()
    println(nome)
    dizOi("Alex", 30)
    dizOi("Melissa")
    dizOi(idade = 80, nome = "Vovó")
}

fun retornaNome() :String{
    return "Mariana"
}

fun dizOi(nome: String, idade: Int = 28){
    println("Oi ${nome}, meus parabéns pelos seus ${idade} anos")
}