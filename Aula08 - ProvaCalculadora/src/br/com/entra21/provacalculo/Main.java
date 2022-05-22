package br.com.entra21.provacalculo;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in); // Scanner static para o projeto main

	public static void main(String[] args) {

		final byte opcao;
		System.out.println("---------Calculadora----------"); // Menu
		System.out.println("| 1)Adi��o    3)Multiplica��o|");
		System.out.println("| 2)Subtra��o 4)Divis�o      |");
		System.out.println("------------------------------");
		System.out.println("Indique uma opera��o matem�tica!");
		opcao = input.nextByte();

		switch (opcao) { // as opcoes do menu ser�o separadas aqui
		case 1:
			Adi��o();
			break;
		case 2:
			Subtra��o();

			break;
		case 3:
			Multiplica��o();
			break;
		case 4:
			Divis�o();
			break;

		default:
			System.out.println("Informe um numero correspondente: do 1 ao 4 ;D");
			main(null);

		}

	}

	

	

	public static void Adi��o() {
		float numeroA, numeroB;
		System.out.println("Adi��o: "); 
		numeroA = input.nextFloat();
		System.out.println("+");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

	}

	private static void Subtra��o() {
		float numeroA, numeroB;
		System.out.println("Subtra��o: "); 
		numeroA = input.nextFloat();
		System.out.println("-");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

	}
	
	
	private static void Multiplica��o() {
		float numeroA, numeroB;
		System.out.println("Multiplica��o: "); 
		numeroA = input.nextFloat();
		System.out.println("x");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" x "+numeroB+ " = " +(numeroA / numeroB));
		main(null);
	}
	
	private static void Divis�o() {
		float numeroA, numeroB;
		System.out.println("Divis�o: "); 
		numeroA = input.nextFloat();
		System.out.println("/");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

		
	}
}
