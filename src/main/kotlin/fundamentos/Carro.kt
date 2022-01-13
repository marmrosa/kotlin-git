package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro("azul", 2021, Dono("Mariana", 27))

    println(carro.cor)
    carro.cor = "Vermelho"
    println(carro.cor)
    //println(carro.dono)
    println(carro.dono.nome)
    carro.dono.nome = "Josefina"
    println(carro.dono)
}