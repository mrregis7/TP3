package testes;
// Como não tem mais todos os dados, não vamos mais usar. Os filhos vão trabalhar
import dominio.Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		
		Funcionario func1 = new Funcionario();
		func1.nome = "matheus";
		func1.idade = 22;
		func1.salario = 200000;
		func1.bonus = 500;
		func1.desconto = 200;
		func1.exibir();
		//System.out.println("Funcionario: " + func1); //func1 é o objeto que estou passando
		
		//como aqui eu ja tenho todas as informacoes, não preciso usar a variavel como os outros casos
		new Funcionario("lucas",22,1000,5000,2000).exibir();

		
		Funcionario func2 = new Funcionario("carla",21);
		//func2.nome = "israel";
		//func2.idade = 22;
		func2.salario = 200000;
		func2.bonus = 500;
		func2.desconto = 200;
		func2.exibir();
		//System.out.println("Funcionario: " + func2);
	}
	
	

}
