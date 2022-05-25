package ex05heranca

class Cavalo(nome: String, idade: Int) : Animal(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("*Sons de cavalo*")
    }

    override fun mobilidade() {
        super.mobilidade()
        println("Pocotó pocotó pocotó...")
    }
}