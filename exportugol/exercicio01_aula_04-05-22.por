programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Programa que marca quantos quilos excedentes de tomate tem, e quanto tem que pagar de multa.
		real pesoTomate, excessoTomate, multa

		excessoTomate = 0.0
		multa = 0.0

		escreva("Digite o peso dos tomates, em kg: ")
		leia(pesoTomate)

		se(pesoTomate>50){
			excessoTomate = pesoTomate - 50
		}

		multa = excessoTomate * 4
		multa = mat.arredondar(multa, 2)
		excessoTomate = mat.arredondar(excessoTomate, 2)

		escreva("\nMulta: R$", multa)
		escreva("\nExcesso de tomates: ", excessoTomate, "kg\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */