programa
	{	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real peso, altura, imc

	escreva("Digite seu peso, em kg: ")
	leia(peso)

	escreva("Digite sua alturac, em m: ")
	leia(altura)

	imc = peso / (altura * altura)
	imc = mat.arredondar(imc, 1)
	escreva("Seu IMC é: ", imc)

	se (imc < 18.5)
	{escreva("\nVocê está abaixo do peso ideal.")
	}senao se (imc < 24.9){
	escreva("\nVocê está no peso ideal.")
	}senao se (imc < 29.9){
	escreva("\nVocê está acima do peso ideal.")
	}senao se (imc < 34.9){
	escreva("\nVocê está com Obesidade I.")
	}senao se (imc < 39.9){
	escreva("\nVocê está com Obesidade II.")
	}senao se (imc >= 40){
	escreva("\nVocê está com Obesidade III.")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */