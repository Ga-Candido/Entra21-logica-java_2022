package br.com.entra21.aula11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;
		do {
			System.out.println("\nEscolha uma das opções:");
			System.out.println(" 0 - \"Sair");
			System.out.println(" 1 - Calculando a soma: ");
			System.out.println(" 2 - Repetir 20 vezes");
			System.out.println(" 3 - Entre 20 pessoas exibir a soma de todas as pessoas");
			System.out.println(" 4 - Repetir 20 e quebrar linha");
			System.out.println(" 5 - Entre 10 pessoal qual é o maior");
			System.out.println(" 6 - Escreva um algoritmo que leia 20 numeros do usario e exiba quantos numeros são pares");	
			System.out.println(" 7 ");
			System.out.println(" 8 ");
			System.out.println(" 9 ");

			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculandoSoma();
				break;

			case 2:
				runRepeat20();
				break;

			case 3:
				sumAge();
				break;
				
			case 4:
				maioresDeIdade();
				break;
				
			case 5:
				exibirMaisNovo();
				break;
			case 8: 
				Exercicio();
			case 9:
				mediaAlunos();

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Obrigada por usar o progama lista de exercicios!");

	}

	private static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 13; counter++) {
			System.out.println(
					" Soma = soma + counter, " + soma + " = " + soma + " + " + counter + "==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}

	}

	private static void runRepeat20() {

		for (byte cont = 1; cont <= 20; cont++) {

			System.out.print("Eu gosto de algoritmos " + (cont % 5 == 0 ? "\n" : ""));

			/*
			 * if (cont % 5 == 0) {
			 *
			 * System.out.print("\n");
			 *
			 * }
			 */

		}

	}

	private static void sumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);
		for (byte count = 1; count <= 5; count++) {
			System.out.println("no momento a soma esta em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

		}
		System.out.println("A soma total das idades foi: " + sumAge);

	}

	private static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, cont;
		Scanner input = new Scanner(System.in);
		for (cont = 1; cont <= 20; cont++) {
			System.out.println("Informe a idade da pessoa " + cont);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println(" A ultima pessoa informada era de maior.");

			}

		}
		System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner (System.in);
		byte quantidade,contador=0;
		float nota,soma=0f;
		System.out.println("Quantas notas deseja capturar?");
		quantidade = input.nextByte();
		String resposta;
		
		do {
			contador++;
			System.out.println("Informe uma nota");
			nota=input.nextFloat();
			if(contador>=quantidade) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if(resposta.equals("sim")) {
					contador--;
					
				}
				
			}
			soma = soma + nota;
		}while(contador<=quantidade);
		System.out.println("Soma ="+soma);
		
	}

	private static void Exercicio() {
		
		
	}
}

