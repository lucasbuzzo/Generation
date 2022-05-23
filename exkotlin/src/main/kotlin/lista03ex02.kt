/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

fun main(){
    val aviao = Lista03Ex02ClasseAviao(
        2,
        2,
        "Vermelho",
        true,
        "Gol",
    )
    aviao.pousar()
    aviao.luzesOnOff()
    aviao.luzesOnOff()
    aviao.luzesOnOff()
    aviao.voar()
    aviao.voar()
    aviao.pousar()
}