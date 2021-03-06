package dominio;

import negocio.Funcionario;

public class Aluno extends Funcionario {
	private boolean fullStack;
	private String linguagem;
	private float av1;
	private float av2;
	
	public Aluno() {
		this.setNome("javeiro");
	}

	public Aluno(String nome, int idade) {
		this();
		this.setNome(nome);
		this.setIdade(idade);
	}

	public Aluno(String nome, int idade, float salario, boolean fullStack, String linguagem, float av1, float av2) {
		this(nome, idade);
		this.setSalario(salario);
		this.fullStack = fullStack;
		this.linguagem = linguagem;
		this.av1 = av1;
		this.av2 = av2;
	}

	public float calcularSalarioLiquido(){
		
		float salarioFullStack = this.fullStack ? 1500 : 500; 
		
		float salarioLinguagem = "java".equalsIgnoreCase(this.linguagem) ? 2000 : 750; 

		return this.getSalario() + salarioFullStack + salarioLinguagem;
	}
	
	@Override
	public String toString() {

		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);

		return String.format("%s | %-3s | %-6s | %2f | %2f  :: Sal�rio l�quido = %10.2f (%s)", 				
				super.toString(), 
				this.fullStack ? "sim" : "n�o", 
				this.linguagem,
				this.av1,
				this.av2,
				salarioLiquido,
				situacao);
	}

	public boolean isFullStack() {
		return fullStack;
	}

	public void setFullStack(boolean fullStack) {
		this.fullStack = fullStack;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public void setAv1(float av1) {
		this.av1 = av1 ;
		
	}
	
	public void setAv2(float av2) {
		this.av2 = av2 ;
		
	}
}