/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

fun main(){
    val rods = Lista03Ex01ClasseCliente(
        "Rodrigo",
        "432.457.078-78",
        1
    )
    println("${rods.nome} tem ${rods.comprasAnteriores} registradas nesse cadastro.")
    rods.comprar()
    rods.comprar()
    rods.comprar()
    rods.comprar()
    rods.comprar()
}
