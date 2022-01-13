package fundamentos

class Pessoa(var name :String, var age :Int) {
    override fun toString(): String {
        return "Pessoa: Nome: ${name}; Idade: ${age}"
    }
}

fun main(){
    var mariana = Pessoa("Mariana", 27)
    println(mariana)
}