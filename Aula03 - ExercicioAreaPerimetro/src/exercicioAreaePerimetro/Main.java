package exercicioAreaePerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Fa�a um progama que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro");
		System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura");
		System.out.println("O per�metro � obtido ao somar todos os vertices do ret�ngulo.");
		//criar variaveis
		float base,altura,area,perimetro; //boas praticas de nomenclatura
		
		Scanner entrada = new Scanner(System.in);
		
		// definir valores e variaveis
		
		System.out.println("informe a base do retangulo");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura do retangulo");
		altura = entrada.nextFloat();
		
		//momento de processamentos...
		area = base * altura;
		perimetro = base * 2 + altura * 2;
		
		System.out.println("Area � "+base+ " x " +altura+ ".");
		System.out.println("Perimetro � "+base+ " + " +base+ " + " +altura+ " + " +altura );
		System.out.println();
		
		
		
		
		
	}

}
