//Faça um programa que entre com três números e coloque em ordem crescente.

fun main(){

    print("Digite o primeiro valor: ")
    val num1 = readln().toInt()
    print("Digite o segundo valor: ")
    val num2 = readln().toInt()
    print("Digite o terceiro valor: ")
    val num3 = readln().toInt()

    if(num1 <= num2 && num2 <= num3){
        println("$num1 - $num2 - $num3")
    }else if(num1 <= num3 && num3 <= num2){
        println("$num1 - $num3 - $num2")
    }else if(num2 <= num1 && num1 <= num3){
        println("$num2 - $num1 - $num3")
    }else if(num2 <= num3 && num1 <= num2){
        println("$num3 - $num1 - $num2")
    }else{
        println("$num3 - $num2 - $num1")
    }
}