import java.lang.Math.sqrt
import kotlin.math.pow

//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

fun main(){
    print("Digite um número: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){
        println("O número $num é par e sua raíz quadrada é: ${
            "%.2f".format(sqrt(num))
        }")
    }else println("o numero $num é impar e ele elevado ao quadrado é> " +
    "%.2f".format(num.pow(2)))
}