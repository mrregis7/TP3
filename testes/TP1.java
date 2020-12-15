package testes;

import java.util.Arrays;
import java.util.Scanner;

public class TP1 {
	
	//vetores
	//Aqui as váriaves ainda não estão criadas, epanas ali embaixo "nomes = new..."
	private static String[] nome;
	private static float[] av1;
	private static float[] av2;
	private static final int QTDE = 3;

	
	//
	private static float calcularNotas(int id) {
		return av1[id] + av2[id];
	}
	
	
	public static String obterSituacao(int i) {
		String situacao = null;

		if (calcularMediaNotas(i) < 4) { 
			situacao = "Reprovado";
		}else if (calcularMediaNotas(i) > 7){
			situacao = "Aprovado";
		}
		return situacao;
	}

	
	
	private static void imprimir(int id) {
		
		
		//Dentro do () contém as informacoes que eu tenho q passar para meu método acima
		float somaNotas = calcularNotas(id);
		
		
		float media = calcularMediaNotas(id);
		
		System.out.printf("{%d} Nome do aluno:%s\n - Nota da AV1: %.2f\n - Nota da AV2:%.2f\n - Soma das Notas: %.2f\n - Situação:\n  - Média final: %.2f\n"
				,id, nome[id], av1[id], av2[id], somaNotas, media);
	}



	//Usando os vetores
	private static void imprimir() {
		for (int i =  0; i < QTDE; i++) {
			if(nome[i] != null) {
				imprimir(i);			
			}
		}
	}
	
	private static float calcularMediaNotas(int i) {
		float mediaNotas = calcularNotas(i) / 2;
		return mediaNotas;
	}


	
	public static void main(String[] args) {
		
		nome = new String[QTDE];
		av1 = new float[QTDE];
		av2 = new float[QTDE];
		
		
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
			System.out.println("Informe a opção desejada: ");
			opcao = in.nextInt();

			if(Arrays.asList(opcoes).contains(opcao)) {
				switch (opcao) {
				case 1:
					if(i < QTDE) {
						System.out.println("Informe o seu nome:");
						nome [i] = in.next();
						
						System.out.println("Informe a nota da AV1:");
						av1 [i] = in.nextFloat();

						System.out.println("Informe a nota da AV2");
						av2 [i] = in.nextFloat();
						
						//Primeiro Imprimir
						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("..... com sucesso! ........");
						
						i++;
						
					}else {
						System.out.println("Impossível realizar um novo cadastramento!");
					}
					break;
				
				case 2:
					System.out.print("Informe a identificação do funcionário: ");
					int id = in.nextInt();
					
					// Impedindo que o usuario busque por um id que não tenha sido cadastrado
					if(id >= 0 && id < i) {
					System.out.println(".....Aluno............");	
					imprimir(id);
					System.out.println("............................");
					}
					else {
						System.out.println("Impossível encontrar o Aluno!");
					}
					break;
						
				case 3:
					System.out.println("... Lista dos alunos e suas respectivas notas ...");
					imprimir();
					System.out.println("..............................");
					break;
				}
					}else {
						System.out.println("Opção inválida!");
					}
					
				} while (opcao != 4);
				System.out.println("Cadastramento finalizado com sucesso!");
				

				
				System.out.println("Quantidade de Aluno: " + i);
				System.out.println("Média notas: " + calcularMediaNotas(i));
				in.close();
				}
	
}
