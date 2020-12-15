package dominio;

import auxiliar.Constante;

public class Programador extends Funcionario {
	private boolean fullstack;
	private String linguagem;
	
	// Criar construtor -> Bot�o direito - Source - Generate Construtor...
	// Construtor � o lugar onde vc consegue mudar o comportamento dos objetos
	// return: sempre que dentro do m�todo eu N�O tenha o void
	// get: obter um atributo, apenas para BOOLEAN eu uso IS inves de GET
	// set: atribuir uma informa��o
	// La embaixo no toString: os 3 primeiros tinham na classe Funcionario, ent�o user super.toString pra chamar
	
	//---------------------------------------------------------------------------
	public Programador() {
		this.nome = "fantasminha";
	}
	
	public Programador(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
		this(nome,idade);
		this.salario = salario;
		this.fullstack = fullstack;
		this.linguagem = linguagem;
	}

//---------------------------------------------------------------------------------------------------------------------------------------------
	float calcularSalarioLiquido() {
		//Onde: x � igual a 1500, se for um programador full stack; ou x = 500, se n�o for full stack.
		//Onde: y � igual a 2000, se a linguagem principal for "java"; ou y = 750, se n�o for java.
		//2 JEITOS DIFERENTES ABAIXO:
		
		float x = this.fullstack ? 1500 : 500;
		//float y = java".equalsIgnoreCase(this.linguagem))
		
		//equalsIgnoreCase: pra aceitar qualquer tipo de formacao (maiuscula ou minuscula) na hora de calcular. Note que ele calculou 2500 a + Andressa
		float y = 0;
		if("java".equalsIgnoreCase(this.linguagem)) {
			y = 2000;
		}else {
			y = 750;
		}
		return  this.salario + x + y;
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	
	private String obterSituacao(float salarioLiquido) {
		if(salarioLiquido < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (salarioLiquido >= Constante.SALARIO_LIMITE_RICO) {
			return "rico";
		}else {
			return "classe m�dia";
		}
	}
	
//	if(salarioLiquido < 50000) {
//		return "pobre";
//	}else if (salarioLiquido >= 50000 && salarioLiquido < 100000) {
//		return "classe m�dia";
//	}else {
//		return "rico";
//	}
//}
	
	//---------------------------------------------------------------------------------------------------------------------------------

	//this � s� pra atriibuto (o que t� l� em cima na classe)
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		return String.format("%-15s | %03d | %10.2f | %-5s | %-6s  %10.2f (%s)" ,
				this.nome,
				this.idade, 
				this.salario, 
				this.fullstack ? "sim" : "n�o",
				this.linguagem,
				salarioLiquido,
				situacao
				);
	}

	// ATALHO: MOUSE - SOURCE - GENERATE GETTERS AND SETTERS
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

	public boolean isFullstack() {
		return fullstack;
	}

	public void setFullstack(boolean fullstack) {
		this.fullstack = fullstack;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	
}
