package testes;

//Ctrl Shift O
import dominio.Aluno;

public class ProgramadorTeste {
	
	public static void main(String[] args) {
		
		//recebe o valor como parametro
		Aluno p1 = new Aluno();
		p1.setIdade(42);
		p1.setSalario(1000);
		p1.setFullstack(true);
		p1.setLinguagem("java");
		System.out.println("Programador " + p1);
		
		Aluno p2 = new Aluno("Andressa", 20);
		p2.setSalario(2000);
		p2.setFullstack(false);
		p2.setLinguagem("JAVA");
		System.out.println("Programador " + p2);
		
		Aluno p3 = new Aluno("Carla", 21, 3000, true, "Python");
		System.out.println("Programador " + p3);
	}

}
