package br.com.entra21.Exercicio.preco.custo;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.
		Aumentar um valor percentual � obtido matematicamente ao somar no valor do produto  com o resultado do calculo
		produto X (65 /100)

		ou seja aumento=produto+ produto X (60/100)*/
		
		String nomeProduto;
		float precoCusto,precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Qual � o preco de custo do produto " +nomeProduto+ "?");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto = (precoCusto *60/100);
		precoVenda = precoCusto *100f;
		
		System.out.println("O pre�o de venda � "+precoVenda);
	
		
		
	
		
		

				

	}

}
