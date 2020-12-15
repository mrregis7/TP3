package br.edu.infnet.modelo;
//Classe Filha
public class Bebida extends Produto {
	private float medida;
	private String marca;

	//Construtor da m�e
	public Bebida(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}
	
	//StringBuilder
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMedida());
		sb.append(";");
		sb.append(this.getMarca());
		return sb.toString();
		
	}
	
	
	//M�todo da m�e
	//No m�todo abstrato, crie uma regra de neg�cio que utilize atributos da filha e da m�e.
	@Override
	public float calcularValorVenda() { //5 (getvalor) + 2 (se for producao propria)+(medida * 0.02)
		
		float valorProducaoPropria = 0;
		if(this.isProducaoPropia()) {
			valorProducaoPropria = 2;
		}
		
		
		return this.getValor() + valorProducaoPropria + this.getMedida() * 0.02f;
	}
	

	//Getters
	public float getMedida() {
		return medida;
	}

	public String getMarca() {
		return marca;
	}

	



}
