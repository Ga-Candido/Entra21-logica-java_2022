package br.com.entra21.exercicioswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		byte estaçao;
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Qual a sua estação do ano preferida? "
				+ "digite conforme o numero correspondente");
		System.out.println("1 = Primavera");	
		System.out.println("2 = Outono");	
		System.out.println("3 = Inverno");	
		System.out.println("4 = Verão");
		System.out.println("5 = nenhuma = nenhuma");
		estaçao = entrada.nextByte();
	
	switch(estaçao) {
	case 1:
		System.out.println("Primavera é Linda, e quente >.<");
		break;
	case 2:
		System.out.println("As folhas caem no Outono");
		break;
	case 3:
		System.out.println("LERY GO");
		break;
		default:
			System.out.println("ERRO");
			break;	
	}
		
System.out.println("------------------------------------------------");



String estacao;
		Scanner Input = new Scanner (System.in);
			
		System.out.println("Qual a sua estação do ano preferida?");
	System.out.println("Primavera");	
	System.out.println("Outono");	
	System.out.println("Inverno");	
	System.out.println("Verão");
	System.out.println("nenhuma = nenhuma");
	estacao = Input.next();
	
	switch (estacao) {
	
	case "Primavera":
		System.out.println("Primavera é Linda, e quente >.<");
		break;
	case "Outono":
		System.out.println(" as folhas caem");
		break;
	case "Inverno":
		System.out.println("O inverno é frio * ");
		break;
	case "Verão":
		System.out.println("Nessa estação use protetor, o sol queima.");
		break;
		default:
			System.out.println("Opção Invalida");
			break;
			
	}
	
	String escolha;
	Scanner Entrada = new Scanner (System.in);
	System.out.println("Escolha sua cor favorita entre as opções: \nVerde\nAmarelo\nAzul\nVermelho");
	escolha = Entrada.nextLine();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}

}
