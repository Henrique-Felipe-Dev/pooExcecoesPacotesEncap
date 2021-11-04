package seres

class Pessoas (private var nome: String, private var idade: Int,
               private var altura: Double){

    fun alterarNome(valor: String){
        nome = valor
    }

    fun mostrarNome(){
        println(nome)
    }

}
