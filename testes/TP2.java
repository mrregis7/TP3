package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;
import dominio.Professor;
import dominio.Aluno;
import negocio.Funcionario;

public class TP2 {
	                                          //funcionarios[x] ou funcionarios[id] funcionarios[i] 
	private static Funcionario[] funcionarios;//adm | prog | prog | adm | adm | null | null
											  //0   | 1    | 2    | 3   | 4	  | 5    | 6
	private static void imprimir(int id) {
		System.out.println(funcionarios[id].toString());
	}
	
	private static void imprimir() {
		for (int i = 0; i < Constante.QTDE; i++) {
			if(funcionarios[i] != null) {
				imprimir(i);
			}
		}
	}
		
	private static float calcularMediaSalarial(int qtde) {
		float somaSalarial = 0;
		for(int x = 0; x < qtde; x++) {
			somaSalarial = somaSalarial + funcionarios[x].calcularSalarioLiquido();
		}		
		float mediaSalarial = somaSalarial / qtde;

		return mediaSalarial;
	}

	public static void main(String[] args) {
		funcionarios = new Funcionario[Constante.QTDE];
		
		Scanner in = new Scanner(System.in);
				
		int i = 0;
		int opcao;
		do {
			System.out.println("[1] Cadastrar Professor");
			System.out.println("[2] Cadastrar Aluno");
			System.out.println("[3] Consultar um");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair");
			System.out.print("Informe a opção desejada: ");
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {
				
				switch (opcao) {
				case 1://administrativo
					if(i < Constante.QTDE) {
						
						Professor prof = new Professor();
						
						System.out.println("Informe o seu nome:");
						prof.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						prof.setIdade(in.nextInt());
						
						System.out.println("Informe o seu salário:");
						prof.setSalario(in.nextFloat());
						
						System.out.println("Informe o seu bônus:");
						prof.setBonus(in.nextFloat());

						System.out.println("Informe o seu desconto:");
						prof.setDesconto(in.nextFloat());

						funcionarios[i] = prof;
						
						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossível realizar um novo cadastramento!");
					}					
					break;

				case 2: //programador
					if(i < Constante.QTDE) {
						
						Aluno aln = new Aluno();
						
						System.out.println("Informe o seu nome:");
						aln.setNome(in.next());
						
						System.out.println("Informe a sua idade:");
						aln.setIdade(in.nextInt());
						
						System.out.println("Informe o seu salário:");
						aln.setSalario(in.nextFloat());
						
						System.out.println("Informe sua nota da AV1:");
						aln.setAv1(in.nextFloat());
						
						System.out.println("Informe sua nota da AV2:");
						aln.setAv2(in.nextFloat());
						
						System.out.println("Informe se é fullstack:");
						aln.setFullStack(in.nextBoolean());

						System.out.println("Informe a sua linguagem:");
						aln.setLinguagem(in.next());

						funcionarios[i] = aln;
						
						System.out.println("... Inclusão realizada ...");
						imprimir(i);
						System.out.println("...... com sucesso! ......");
						
						i++;
					}else {
						System.out.println("Impossível realizar um novo cadastramento!");
					}					
					break;
					
				case 3:
					System.out.print("Informe a identificação do docente/discente: ");
					int id = in.nextInt();
	
					if(id >= 0 && id < i) {
						System.out.println("... docente/discente: ...");
						imprimir(id);
						System.out.println(".............................");
					}else {
						System.out.println("Impossível encontrar o docente/discente!");
					}
					break;
					
				case 4:
					System.out.println("... Lista de docente/discente ...");
					imprimir();
					System.out.println(".............................");
					break;
				}
			}else {
				System.out.println("Opção inválida!!!");
			}
		} while (opcao != 5);
		
		System.out.println("Cadastramento finalizado com sucesso!!!");		
		System.out.println("Quantidade de docente/discente: " + i);
		System.out.println("Média salarial: " + calcularMediaSalarial(i));
		
		in.close();
	}
}