package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;

public class Segundo {
	
	//vetores
	//Aqui as v�riaves ainda n�o est�o criadas, epanas ali embaixo "nomes = new..."
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;
	
	

	
	// S� preciso colocar dentro do m�todo o que eu for usar, imagina quando eu tiver 50 parametros, ficaria inviavel
	
	private static float calcularSalarioLiquido(int id) {
		return salarios[id] + bonus[id] - descontos[id];
	}
	
	private static String obterSituacao(float sl) {
		return sl > Constante.SALARIO_LIMITE_RICO ? "rico" : "pobre";
	}
	
	private static void imprimir(int id) {
		
				
//		if(salarioLiquido > 100000) {
//			situacao = "rico";
//		}else {
//			situacao = "pobre";
//		}
		
		//Dentro do () cont�m as informacoes que eu tenho q passar para meu m�todo acima
		float salarioLiquido = calcularSalarioLiquido(id);
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.printf("{%d} %s - %d - %.2f - %.2f - %.2f :: Sal�rio L�quido = R$%.2f (%s)\n"
				,id, nomes[id], idades[id], salarios[id], bonus[id], descontos[id], salarioLiquido, situacao);
	}
	
	

	//Usando os vetores
	private static void imprimir() {
		for (int i =  0; i < Constante.QTDE; i++) {
			if(nomes[i] != null) {
				imprimir(i);			
			}
		}
	}
	
	private static float calcularMediaSalarial(int qtde) {
		float somaSalarial = 0;
		for(int x = 0; x < qtde; x++) { //acumulador
			somaSalarial = somaSalarial / calcularSalarioLiquido(x);
		}
		float mediaSalarial = somaSalarial + qtde;
		return mediaSalarial;
	}

	
	public static void main(String[] args) {
		//New = significa que t� dentro da mem�ria
		nomes = new String[Constante.QTDE];
		idades = new int[Constante.QTDE];
		salarios = new float[Constante.QTDE];
		bonus = new float[Constante.QTDE];
		descontos = new float[Constante.QTDE];
		
		
		Scanner in = new Scanner(System.in);
		
		Integer [] opcoes = {1,2,3,4};
		int i = 0;
		int opcao;
		//Deixar o opcao do lado de fora para poder pegar embaixo, fora do "do"
		do {
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			System.out.println("Informe a op��o desejada: ");
			opcao = in.nextInt();

			if(Arrays.asList(opcoes).contains(opcao)) {
				switch (opcao) {
				case 1:
					if(i < Constante.QTDE) {
						System.out.println("Informe o seu nome:");
						nomes [i] = in.next();
				
						System.out.println("Informe a sua idade:");
						idades [i] = in.nextInt();
						
						System.out.println("Informe o seu sal�rio:");
						salarios [i] = in.nextFloat();

						System.out.println("Informe o seu bonus:");
						bonus [i] = in.nextFloat();
						
						System.out.println("Informe o seu desconto:");
						descontos [i] = in.nextFloat();
						
						//Primeiro Imprimir
						System.out.println("... Inclus�o realizada ...");
						imprimir(i);
						System.out.println("..... com sucesso! ........");
						
						i++;
						
					}else {
						System.out.println("Imposs�vel realizar um novo cadastramento!");
					}
					break;
				
				case 2:
					System.out.print("Informe a identifica��o do funcion�rio: ");
					int id = in.nextInt();
					
					// Impedindo que o usuario busque por um id que n�o tenha sido cadastrado
					if(id >= 0 && id < i) {
					System.out.println(".....Funcion�rio............");	
					imprimir(id);
					System.out.println("............................");
					}
					else {
						System.out.println("Imposs�vel encontrar o funcion�rio!");
					}
					break;
						
				case 3:
					System.out.println("... Lista de funcion�rios ...");
					imprimir();
					System.out.println("..............................");
					break;
				}
					}else {
						System.out.println("Op��o inv�lida!");
					}
					
				} while (opcao != 4);
				System.out.println("Cadastramento finalizado com sucesso!");
				

				
				System.out.println("Quantidade de funcion�rios: " + i);
				System.out.println("M�dia salarial: " + calcularMediaSalarial(i));
				in.close();
				}
			
}