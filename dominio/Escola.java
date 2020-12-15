package dominio;

import exceptions.NomeIncompletoException;

public class Escola {

	private String nome;
	private String nomeMeio;
	private String ultimoNome;
	private float faturamento;
	
	public void exibir() {
		System.out.println("Escola: " + this.toString());
	}
	
	@Override
	public String toString() {

		return String.format("%s - %s - %s - %.2f\n", 
				this.nome,
				this.nomeMeio,
				this.ultimoNome,
				this.faturamento
			);
	}
	
	public String getNome() throws NomeIncompletoException {

		if(this.ultimoNome == null || this.nome == null || this.nomeMeio == null) {
			throw new NomeIncompletoException("EXCEPTION: O campo nome precisa ser preenchido corretamente");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.ultimoNome.toUpperCase().charAt(0));
		sb.append("., ");
		sb.append(this.nome.toUpperCase());
		sb.append(" ");
		sb.append(this.nomeMeio.toLowerCase());

		return sb.toString();
	}
	
	public void setNome(String nome) throws NomeIncompletoException {
		
		if(nome.split(" ").length <= 1) {
			throw new NomeIncompletoException("EXCEPTION: É necessário informar um nome com pelo menos duas palavras");
		}		

		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.nomeMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) throws Exception {

		if(faturamento < 0) {
			throw new Exception("EXCEPTION: O faturamento não pode ser negativo.");
		}
		
		this.faturamento = faturamento;
	}
}