import java.util.*

//Faça um programa que receba três inteiros e diga qual deles é o maior.

fun main(){
    var leitura = Scanner(System.`in`)
    print("Digite um número: ")
    var num = leitura.nextInt()
    print("Digite outro número: ")
    var num2 = leitura.nextInt()
    print("Digite mais um número: ")
    var num3 = leitura.nextInt()
    if(num > num2 && num > num3){
        print("$num é o maior número.")
    }else if(num2 > num && num2 > num3){
        print("$num2 é o maior número.")
    }else{
        print("$num3 é o maior número.")
    }
}