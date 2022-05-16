programa
{
	
	funcao inicio()
	{
		/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total
		do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto
		o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer
		um valor negativo.*/
		
		real num = 0.0, soma = 0.0, media = 0.0, total = 0.0

		enquanto(num >= 0){
			escreva("Digite um valor: ")
			leia(num)
			soma = (soma + num)
			media = (soma/total)
			total++
		}
		escreva("\nSoma: ", soma, "\nMédia: ", media, "\nTotal de valores lidos: ", total, "\n")
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 11, 7, 3}-{soma, 11, 18, 4}-{media, 11, 30, 5}-{total, 11, 43, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */