package br.com.entra21.exercico.revisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		final float altura;
		String nome;
		
		System.out.println("Exercicios de Revis�o-01");
		System.out.println("Ol�, qual seu nome?");
		nome = input.next();
		

		System.out.println("Ol� "+nome+ "tudo bem? ");
		System.out.println("Por gentileza,informe sua altura.");
		altura = input.nextFloat();
		
		if (altura<1.50) {
			System.out.println( nome+ " sua altura � " +altura+ "m," 
					+" portanto n�o podera  ir ao brinquedo, a altura min�ma desejada � 1.50m");	
		}else if (altura >=1.50) {
			System.out.println(nome+ ", sua entrada est� liberada, pode prosseguir!");
			
		} else {
			
		}
		System.out.println("Exercicios de Revis�o-02");
		
		String opcao;
		Scanner  entrada = new Scanner(System.in);
		System.out.println("Escolha uma op��o");
		System.out.println("Brasil\nEua\nChina");
		opcao = entrada.nextLine();
		
		opcao =opcao.toLowerCase();
		
		switch (opcao) {
		case "brasil":
			System.out.println("BRASILLL ZIL ZIL");
			break;
			
		case "eua":
			System.out.println("Pra gringo � mais caro");
			break;
			
		case "china":
		System.out.println(" made in China");
		break;
		
		default:
			System.out.println("Op��o inv�lida");
			break;
			
		
		

		}
		
		
		
		
		
		
		
			
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
