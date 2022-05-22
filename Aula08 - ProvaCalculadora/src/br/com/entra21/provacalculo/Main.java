package br.com.entra21.provacalculo;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in); // Scanner static para o projeto main

	public static void main(String[] args) {

		final byte opcao;
		System.out.println("---------Calculadora----------"); // Menu
		System.out.println("| 1)Adição    3)Multiplicação|");
		System.out.println("| 2)Subtração 4)Divisão      |");
		System.out.println("------------------------------");
		System.out.println("Indique uma operação matemática!");
		opcao = input.nextByte();

		switch (opcao) { // as opcoes do menu serão separadas aqui
		case 1:
			Adição();
			break;
		case 2:
			Subtração();

			break;
		case 3:
			Multiplicação();
			break;
		case 4:
			Divisão();
			break;

		default:
			System.out.println("Informe um numero correspondente: do 1 ao 4 ;D");
			main(null);

		}

	}

	

	

	public static void Adição() {
		float numeroA, numeroB;
		System.out.println("Adição: "); 
		numeroA = input.nextFloat();
		System.out.println("+");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

	}

	private static void Subtração() {
		float numeroA, numeroB;
		System.out.println("Subtração: "); 
		numeroA = input.nextFloat();
		System.out.println("-");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

	}
	
	
	private static void Multiplicação() {
		float numeroA, numeroB;
		System.out.println("Multiplicação: "); 
		numeroA = input.nextFloat();
		System.out.println("x");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" x "+numeroB+ " = " +(numeroA / numeroB));
		main(null);
	}
	
	private static void Divisão() {
		float numeroA, numeroB;
		System.out.println("Divisão: "); 
		numeroA = input.nextFloat();
		System.out.println("/");
		numeroB = input.nextFloat();
		System.out.println(numeroA+" / "+numeroB+ " = " +(numeroA / numeroB));
		main(null);

		
	}
}
