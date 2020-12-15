package br.edu.infnet.modelo;
//Classe Filha
public class Sobremesa extends Produto {

	public Sobremesa(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}

	@Override
	public float calcularValorVenda() {
		return 0;
	}

	
}
