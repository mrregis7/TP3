// mae e filha
// m�es n�o sabem quem sao suas filhas, mas as filhas levam a marca da m�e
// Pra dizer que Administrativo � filha de Funcionario, usamos: extends
// Tudo que � IGUAL, fica na m�e, de diferente fica na filha

//uso o this quando quero referenciar a minha classe l� em cima com o MESMO nome

//Criar um m�todo de impress�o chamado exibir() e chame o metodo "toString" dentro dele
package dominio;

import negocio.Funcionario;

public class Administrativo extends Funcionario {
		private float bonus;
		private float desconto;

		public Administrativo(){
			super();
		}
	
		public Administrativo(String nome, int idade){
			super(nome, idade);
		}
	
		public Administrativo(String nome, int idade, float salario, float bonus, float desconto) {
			super(nome, idade, salario);
			this.bonus = bonus;
			this.desconto = desconto;
		}
	
		public float calcularSalarioLiquido() {
			return this.getSalario() + this.bonus - this.desconto;
		}
			
		public void exibir() {
			System.out.println("Funcion�rio: " + this.toString());
		}
		
		@Override
		public String toString() {
			
			float salarioLiquido = calcularSalarioLiquido();
			
			String situacao = obterSituacao(salarioLiquido);
	
			return String.format("%s | %10.2f | %10.2f :: Sal�rio L�quido R$%10.2f (%s)",
					super.toString(), 
					this.bonus, 
					this.desconto,
					salarioLiquido,
					situacao
					);
		}
	
		public float getBonus() {
			return bonus;
		}
	
		public void setBonus(float bonus) {
			this.bonus = bonus;
		}
	
		public float getDesconto() {
			return desconto;
		}
	
		public void setDesconto(float desconto) {
			this.desconto = desconto;
		}
}