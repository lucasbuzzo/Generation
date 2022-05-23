class Lista03Ex02ClasseAviao(
    var turbina: Int,
    var asas: Int,
    var cor: String,
    var trempouso: Boolean,
    var modelo: String,
){
    var voando = false
    var luzes = false

    fun voar(){
        if(voando){
            println("O avião já está no ar.")
        }else{
            voando = true
            println("O avião vai voar.")
        }
    }
    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar.")
        }else{
            println("O avião já está no chão.")
        }
    }
    fun luzesOnOff(){
        if(luzes){
            luzes = false
            println("Luzes estão desligadas.")
        }else{
            luzes = true
            println("Luzes estão ligadas.")
        }
    }

}