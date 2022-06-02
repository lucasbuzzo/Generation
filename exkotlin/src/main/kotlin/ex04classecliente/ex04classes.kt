package ex04classecliente

fun main(){

    print("Digite seu nome: ")
    val nome = readln()
    print("Digite seu endereço: ")
    val endereco = readln()
    print("Digite seu telefone: ")
    val telefone = readln()

    try {
        val cliente = Ex04ClasseCliente(nome, endereco, telefone)

        while (true){
            println("\n***Menu***\n")
            println("1 - Adicionar compras")
            println("2 - Remover compras")
            println("3 - Listar compras")
            println("4 - Sair\n")

            print("Opção: ")
            val opc = readln().toInt()

            when(opc){

                1 -> {
                    println("Digite um item para adicionar no carrinho: ")
                    val compra = readln()
                    cliente.addCompra(compra)
                }
                2 -> {
                    println("Digite um item para ser removido: ")
                    val compra = readln()
                    cliente.removeCompra(compra)
                }
                3 -> {
                    cliente.listCompras()
                }
                4 -> break

                else -> println("Valor inválido.")
            }
        }
    }catch (e: Exception){
        println(e.message)
    }
}