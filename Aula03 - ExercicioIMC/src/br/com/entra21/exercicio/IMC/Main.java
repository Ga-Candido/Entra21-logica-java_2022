package br.com.entra21.exercicio.IMC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner informa��o = new Scanner(System.in);
	
	float altura,peso,IMC;
	
	System.out.println("Qual sua altura ?");
	altura = informa��o.nextFloat();
	
	System.out.println("Quanto voc� pesa? ") ;
	peso = informa��o.nextFloat();
	
	altura = (altura*altura);
	IMC = (peso/altura);
	
	System.out.println("Seu IMC �: "+IMC);
	
	
	
	
	
	
	
		
	}

}
