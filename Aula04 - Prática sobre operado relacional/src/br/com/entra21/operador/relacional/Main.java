package br.com.entra21.operador.relacional;

public class Main {

	public static void main(String[] args) {
				
		byte  numeroA,numeroB;
		boolean resultado;
		
		numeroA = 1;
		numeroB= 2;
		 
		
		resultado = (numeroA > numeroB);
		System.out.println("Este n�mero " +numeroA+ " � maior que o numero " +numeroB+ "? "+resultado);
		resultado = (numeroA >= numeroB);
		System.out.println("Este n�mero " +numeroA+ " � maior ou igual que o numero " +numeroB+ "? "+resultado);
		resultado = (numeroA < numeroB);
		System.out.println("Este n�mero " +numeroA+ " � menor que o numero " +numeroB+ "? "+resultado);
		
		resultado = (numeroA <= numeroB);
		System.out.println("Este n�mero " +numeroA+ " � menor ou igual que o numero " +numeroB+ "? "+resultado);
		


	}

}
