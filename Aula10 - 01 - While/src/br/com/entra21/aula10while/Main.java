package br.com.entra21.aula10while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Escolha uma opção");
		System.out.println("\t0 - sair\n\t1 - while\n\t2 - do-while");

		// instanciando um objeto da classe Scanner e ja utilizando o metodo next
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "socorro":
			System.exit(0);

		case "0", "sair":
			System.out.println("Escolheu sair");
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("Opção invalida");
			main(null);
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("Vamos Aprender WHILE aqui");
		byte contagem = 1;
		while (contagem <= 10) {// condição de permanencia /// enquanto contagem for menor ou igual a 10 execute
			System.out.println("Contando" + contagem);
			contagem++;
		}
		// para fazer uma repetição com base em quantidade é gerado muito código.
		System.out.println("acabei");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Deseja iniciar uma repetição? ");
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("sim")) {
			System.out.println("Vc respondeu : " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while com base em decisão");
		main(null);
	}

	private static void aprenderDoWhile() {

		System.out.println("Vamos Aprender DO WHILE aqui");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs PITA e REPITA, PITA morreu quem ficou?");
			resposta = entrada.next();
			
		}while(resposta.equalsIgnoreCase("repita"));
		System.out.println("entendeu né? ;D");
		
		byte dia;
		do {
			System.out.println("Informe o dia do seu aniversário");
			dia=entrada.nextByte();
		}while(dia>31);//repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenha errado muito...");
			
		
		byte mes;
		byte contador = 0;
		do {
			System.out.println("Informe o dia do seu aniversário ex(1 até 31)");
			dia = entrada.nextByte();
			
			System.out.println("Informe o mes do seu mes ex(1 até 12)");
			mes = entrada.nextByte();
			contador++;
			
		}while(dia>31 || dia<0 || mes<1 || mes >12 );
		
		
		System.out.println("Seu aniversário é "+dia+"/"+mes+" erros:"+contador );
		
		
		main(null);
			
		}
		
		

		

	}


