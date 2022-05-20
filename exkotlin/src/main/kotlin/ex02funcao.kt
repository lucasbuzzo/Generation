//Calculadora simples utilizando funções

fun main(){

    print("Digite o primeiro valor: ")
    val num1 = readln().toInt()
    print("Digite outro valor: ")
    val num2 = readln().toInt()
    print("Escolha uma operação:\n1 para soma\n2 para subtração\n" +
            "3 para multiplicação\n4 para divisão:\n")
    when (readln().toInt()) {
        1 -> {
            print("$num1 + $num2 = ${somadoida(num1, num2)}")
        }
        2 -> {
            print("$num1 - $num2 = ${subdoida(num1, num2)}")
        }
        3 -> {
            print("$num1 * $num2 = ${multdoida(num1, num2)}")
        }
        4 -> {
            print("$num1 / $num2 = ${divdoida(num1, num2)}")
        }
    }

}fun somadoida(n1: Int, n2: Int): Int{
    return n1 + n2
}fun subdoida(n1: Int, n2: Int): Int {
    return n1 - n2
}fun multdoida(n1: Int, n2: Int): Int {
    return n1 * n2
}fun divdoida(n1: Int, n2: Int): Int {
    return n1 / n2
}