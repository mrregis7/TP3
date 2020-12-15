

package negocio;

//private	25%: a classe
//padrão 	50%: as classes do pacote
//protected 75%: as classes do pacote + as classes filhas
//public 	100%: todas as classes

//super() : chama a mãe quando tm uma info igual

//Abstract Quando coloca o abstract, a mãe fala pra sí: eu não sei calcular tal coisa, preciso
//que vc veja com as minhas filhas. E adicionando o abstract em um método como calcularSalarioLiquido, é preciso definir tb na class. Ele ent'ao
//pegará de TODAS as filhas

//Na herança sempre pergunte: X FAZ PARTE DE Y? Exemplo: estagiario faz parte de funcionario? Se sim, então relaciona.

//toString: quando chamamos o toString de outra classe, ele vai na mãe que tb tem, mas dps volta para a outra classe que vc deseja, isso ocorre pois
//nessa situação ele sempre prioriza a filha

//uso o this quando quero referenciar a minha classe lá em cima com o MESMO nome
//para chamar um outro contrutor tem que ser a primeira linha
//vou chamar a linha de cima

import auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float salario;

	public Funcionario(){
		this.nome = "fantasma";
		this.idade = Constante.MAIOR_IDADE;
		this.salario = Constante.SALARIO_MINIMO;
	}
	
	public Funcionario(String nome, int idade){
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
	}
	
	public abstract float calcularSalarioLiquido();

	public String obterStringSalarioPorFuncionario(){

		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.calcularSalarioLiquido());
		sb.append("\r");
		
		return sb.toString();
	}
	
	protected String obterSituacao(float salarioLiquido) {

		if(salarioLiquido < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (salarioLiquido >= Constante.SALARIO_LIMITE_POBRE) {
			return "rico";
		}else {
			return "classe média";
		}
	}

	public void exibir() {
		System.out.println("Funcionário: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		return String.format("%-10s | %03d | %10.2f",
				this.nome, 
				this.idade, 
				this.salario
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}

