programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Receber valores de base e altura de um triângulo e verificar se são valores válidos
		//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

		real altura, base, area
		
		escreva("Digite a altura do triângulo, em cm: ")
		leia(altura)
		escreva("Digite a base do triângulo, em cm: ")
		leia(base)

		area = (altura * base)
		area = mat.arredondar(area, 2)

		se (altura > 0 e base > 0){
			escreva("\nEsse triângulo é pica, tá? A área dele é ", area, "cm\n")
		}senao{
			escreva("\nEsse triângulo é uma bosta, nem funciona.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */