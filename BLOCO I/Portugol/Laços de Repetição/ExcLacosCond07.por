programa
{	
/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
	
	funcao inicio()
	{
		real base, altura, area
		escreva("Por favor, digite o valor da base: \n ")
		leia(base)
		escreva("Por favor, digite o valor da altura: \n")
		leia(altura)

		se (base >0 e altura > 0){
			  area = base * altura
			  escreva("A área do triângulo vale: ", area)
		}senao{
			escreva("Não é possível calcular a área com os números digitados")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */