package testes;

import dominio.Escola;
import exceptions.NomeIncompletoException;

public class EscolaTeste {

	public static void main(String[] args) {

		try {
			Escola e1 = new Escola();
			e1.setNome("Maria ÁLVARES");
			e1.setFaturamento(-100);
			System.out.println(">>> " + e1.getNome() + " - " + e1.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Escola e2 = new Escola();
			e2.setNome("Elberth Lins Costa de Moraes");
			e2.setFaturamento(200);
			System.out.println(">>> " + e2.getNome()  + " - " + e2.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Escola e3 = new Escola();
			e3.setFaturamento(1000);
			System.out.println(">>> " + e3.getNome()  + " - " + e3.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Escola e4 = new Escola();
			e4.setNome("Matheuzinho");
			e4.setFaturamento(-500);
			System.out.println(">>> " + e4.getNome()  + " - " + e4.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
