package testes;

import dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
//		adm1.setIdade(42);
//		adm1.setSalario(1000);
		prof1.setBonus(500);
		prof1.setDesconto(200);
		prof1.exibir();

		new Professor("lucas", 22, 10000, 5000, 2000).exibir();

		Professor prof3 = new Professor("carla", 21);
		prof3.setSalario(20000);
		prof3.setBonus(6000);
		prof3.setDesconto(3000);
		prof3.exibir();
	}
}