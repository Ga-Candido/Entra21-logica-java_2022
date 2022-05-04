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
	
	 if(IMC<17.00f) {
		 System.out.println("muito abaixo do peso");
	 }else if (IMC>17.00f || IMC<=25.00f) {
		 System.out.println("abaixo do peso");	 
	 }else if (IMC >=18.50f || IMC<=24.99) {
		 System.out.println("Peso normal");
	 }else if (IMC>=25.00f || IMC<=29.99F) {
		 System.out.println("Acima do peso");
	 }else if (IMC>=30.00f || IMC<=34.99f) {
		 System.out.println("Obesidade I");
	 }else {
		 
	 }
		
	 
		 

		 
	
		
	 
	
	 
		 
	 
	
	
	
	
	
	
	
	
		
	}

}
