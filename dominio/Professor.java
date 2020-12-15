package dominio;

import negocio.Funcionario;

public class Professor extends Funcionario {
		private float bonus;
		private float desconto;

		public Professor(){
			super();
		}
	
		public Professor(String nome, int idade){
			super(nome, idade);
		}
	


		public Professor(String nome, int idade, float salario, float bonus, float desconto) {
			super(nome, idade, salario);
			this.bonus = bonus;
			this.desconto = desconto;
		}

		public float calcularSalarioLiquido() {
			return this.getSalario() + this.bonus - this.desconto;
		}
			
		public void exibir() {
			System.out.println("Funcionário: " + this.toString());
		}
		
		@Override
		public String toString() {
			
			float salarioLiquido = calcularSalarioLiquido();
			
			String situacao = obterSituacao(salarioLiquido);
	
			return String.format("%s | %10.2f | %10.2f :: Salário Líquido R$%10.2f (%s)",
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