package br.edu.infnet.modelo;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

//Classe mãe
//Não vou instancia-la então abstract; cada método abstract vai obrigar que a filha implemente o método e não a mãe.
public abstract class Produto {
	private String descricao;
	private float valor;
	private boolean producaoPropria;
	
	public Produto(String descricao, float valor, boolean producaoPropria) {
		this.descricao = descricao;
		this.valor = valor;
		this.producaoPropria = producaoPropria;
	}

	
	//Crie um método abstrato que retorne alguma informação (retorno diferente de void)
	public abstract float calcularValorVenda();
	
	//Vamos implementar o toString colocando todos os campos separados por ";". Use o StringBuilder para realizar esta implementação.
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getDescricao());
			sb.append(";");
			sb.append(this.getValor());
			sb.append(";");
			sb.append(this.isProducaoPropia());
			
			return sb.toString();
			
		}

		
	public String getDescricao() {
		return descricao;
	}


	public float getValor() {
		return valor;
	}


	public boolean isProducaoPropia() {
		return producaoPropria;
	}

	
	
	
	
	
	
}
