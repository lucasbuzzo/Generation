//Solicitar a idade de várias pessoas e imprimir: total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

fun main()
{

    var idade = 0
    var totalme21 = 0
    var totalma50 = 0

    println("Para interromper a contagem do programa, insira a idade -99")

    while(idade != -99){
        print("Digite uma idade: ")
        idade = readln().toInt()
        if(idade > 50){
            totalma50++
        }
        if(idade < 21){
            totalme21++
        }
    }
    totalme21--
    println("\nO total de pessoas com menos de 21 anos é $totalme21.")
    println("O total de pessoas com mais de 50 anos é $totalma50.")
}