package ex05heranca

class Preguica(nome: String, idade: Int) : Animal(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("Ai ui que soninho.")
    }

    override fun mobilidade() {
        super.mobilidade()
        println("Escalando com soninho zZzZzZ...")
    }
}