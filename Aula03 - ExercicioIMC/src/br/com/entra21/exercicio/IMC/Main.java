package br.com.entra21.exercicio.IMC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner informação = new Scanner(System.in);
	
	float altura,peso,IMC;
	
	System.out.println("Qual sua altura ?");
	altura = informação.nextFloat();
	
	System.out.println("Quanto você pesa? ") ;
	peso = informação.nextFloat();
	
	altura = (altura*altura);
	IMC = (peso/altura);
	
	System.out.println("Seu IMC é: "+IMC);
	
	
	
	
	
	
	
		
	}

}
