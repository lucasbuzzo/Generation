//Faça um programa em que o usuario digite o diametro de um círculo e calcule a area e o perimetro dele

import java.util.Scanner

fun main(){
    val leitura = Scanner(System.`in`)

    print("Digite o diâmetro do círculo, em cm: ")
    val diametro = leitura.nextDouble()
    val raio = diametro/2

    println("A área do círculo é ${3.14 * (raio * raio)}cm")
    println("O perímetro do círculo é ${2 * 3.14 * raio}cm")
}