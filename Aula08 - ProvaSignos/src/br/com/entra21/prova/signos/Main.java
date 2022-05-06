package br.com.entra21.prova.signos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, signo;
		byte mes;
		final byte dia;
		System.out.println("Qual o seu nome?");
		nome = entrada.nextLine();

		System.out.println(nome + ", qual dia você faz aniversario?");
		dia = entrada.nextByte();
		Meses();
		mes = entrada.nextByte();

		switch (mes) {

		case 1:
			if (mes == 1 && dia >= 21 || mes ==2 && dia<=18) { 
				System.out.println("Seu signo é: Aquario" ); //mostra seu signo com base no mes e o dia.
			}else {
				
			}
			
			break;
		
		case 2: 
			if (mes == 2 && dia >= 19 || mes==3 && dia<=20 ) {
				System.out.println("Seu signo é: Peixes");
			}else {
				
			}
			
		break;
		
		case 3: 
			if (mes == 3 && dia >=21 || mes == 4 && dia <=20 ) {
				System.out.println("Seu signo é: Aríes");
			}else {
				
			}
		case 4: if(mes == 4 && dia >=21 || mes ==5 && dia <=20) {
			System.out.println("Seu signo é Touro ");
		}else {
			
		}
		break;
		
		
		case 5: if(mes == 5 && dia >=21 || mes == 6 && dia <=20) {
			System.out.println("Seu signo é Gemeos");
			}else {
				
			}
		break;
		
		case 6: if(mes == 6 && dia >=21 || mes == 7 && dia <=22) {
			System.out.println("Seu signo é Cancer");
			}else {
				
			}
		break;
		
		case 7: if(mes == 7 && dia >=23 || mes == 8 && dia <=22) {
			System.out.println("Seu signo é Leão");
			}else {
				
			}
		break;
			
		case 8:
			if(mes == 8 && dia >=23 || mes == 9 && dia <=22) {
				System.out.println("Seu signo é Virgem");
				}else {
					
				}
			break; 
			
		case 9: if(mes == 9 && dia >=23 || mes == 10 && dia <=22) {
			System.out.println("Seu signo é Libra");
			}else {
				
			}
		break;
		case 10: if(mes == 10 && dia >=23 || mes == 11 && dia <=21) {
			System.out.println("Seu signo é Escorpião");
			}else {
				
			}
		break;
		case 11: if(mes == 11 && dia >=22 || mes == 12 && dia <=21) {
			System.out.println("Seu signo é Sagitario");
			}else {
				
			}
		break;
		
		case 12: if(mes == 12 && dia >=22 || mes == 1 && dia <=20) {
			System.out.println("Seu signo é Capricórnio");
			}else {
				
			}
		break;
		
		
			
		
			
			
		
		
	
		

			
			
			
		}

	}

	public static void Meses() {


		System.out.println("Informe em qual mês você faz aniversário");
		System.out.println("1 = Janeiro");
		System.out.println("2 = Fevereiro");
		System.out.println("3 = Março");
		System.out.println("4 = Abril");
		System.out.println("5 = Maio");
		System.out.println("6 = Junho");
		System.out.println("7 = Julho");
		System.out.println("8 = Agosto");
		System.out.println("9 = Setembro");
		System.out.println("10 = Outubro");
		System.out.println("11 = Novembro");
		System.out.println("12 = Dezembro");

	}
	
		
		
		
	
}
