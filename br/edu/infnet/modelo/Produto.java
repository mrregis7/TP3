package br.edu.infnet.modelo;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

//Classe m�e
//N�o vou instancia-la ent�o abstract; cada m�todo abstract vai obrigar que a filha implemente o m�todo e n�o a m�e.
public abstract class Produto {
	private String descricao;
	private float valor;
	private boolean producaoPropria;
	
	public Produto(String descricao, float valor, boolean producaoPropria) {
		this.descricao = descricao;
		this.valor = valor;
		this.producaoPropria = producaoPropria;
	}

	
	//Crie um m�todo abstrato que retorne alguma informa��o (retorno diferente de void)
	public abstract float calcularValorVenda();
	
	//Vamos implementar o toString colocando todos os campos separados por ";". Use o StringBuilder para realizar esta implementa��o.
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
