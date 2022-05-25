package ex05heranca

class Cachorro(nome: String, idade: Int) : Animal(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("Au au.")
    }

    override fun mobilidade() {
        super.mobilidade()
        println("Correndo como um cachorro...")
    }
}