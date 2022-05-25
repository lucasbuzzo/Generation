package ex05heranca

    open class Animal(var nome: String, var idade: Int) {

        open fun emitirSom() {
            println("Emitindo som: ")
        }

        open fun mobilidade() {
            println("Se deslocando: ")
        }
    }