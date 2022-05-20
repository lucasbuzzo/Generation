/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

fun main(){

    val produtos = mutableListOf<String>()
    while(true){
        println("Escolha uma opção:\n")
        println("1 - Adicionar produtos;")
        println("2 - Remover produtos;")
        println("3 - Atualizar produtos;")
        println("4 - Listar produtos;")
        println("5 - Encerrar programa;\n")

        print("Opção: ")

        when(readln().toInt()){
            1 -> {
                println("Digite o nome do produto: ")
                val prod = readln()

                if(prod != ""){
                    produtos.add(prod)
                }else{
                    println("O nome do produto não pode ser vazio\n")
                }
            }
            2 -> {
                println("Digite o produto a ser deletado: ")
                val prod = readln()
                if(produtos.contains(prod)){
                    produtos.remove(prod)
                    println("Produto removido com sucesso.")
                }else{
                    println("Produto não existe na lista.\n")
                }
            }
            3 -> {
                println("Lista de Produtos\n")

                produtos.forEach{
                    println(it)
                }
                println("\nDigite um produto a ser atualizado: ")
                val prod = readln()
                if(produtos.contains(prod)){
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()

                    produtos[index] = valor

                    println("Produto atualizado com sucesso.")
                }else{
                    println("Produto não existe na lista.\n")
                }
            }
            4 -> {
                println("Lista de Produtos\n")
                produtos.forEach{
                    println(it)
                }
                println()
            }
            5 -> break

            else -> println("Valor inválido.\n")
        }
    }
}