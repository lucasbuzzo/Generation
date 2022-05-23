class Lista03Ex01ClasseCliente(
    var nome: String,
    var cpf: String,
    var comprasAnteriores: Int
){
    fun comprar(){
        comprasAnteriores++
        println("$comprasAnteriores compras registradas nesse cadastro.")
    }
}