package br.com.entra21.operador.relacional;

public class Main {

	public static void main(String[] args) {
				
		byte  numeroA,numeroB;
		boolean resultado;
		
		numeroA = 1;
		numeroB= 2;
		 
		
		resultado = (numeroA > numeroB);
		System.out.println("Este número " +numeroA+ " é maior que o numero " +numeroB+ "? "+resultado);
		resultado = (numeroA >= numeroB);
		System.out.println("Este número " +numeroA+ " é maior ou igual que o numero " +numeroB+ "? "+resultado);
		resultado = (numeroA < numeroB);
		System.out.println("Este número " +numeroA+ " é menor que o numero " +numeroB+ "? "+resultado);
		
		resultado = (numeroA <= numeroB);
		System.out.println("Este número " +numeroA+ " é menor ou igual que o numero " +numeroB+ "? "+resultado);
		


	}

}
