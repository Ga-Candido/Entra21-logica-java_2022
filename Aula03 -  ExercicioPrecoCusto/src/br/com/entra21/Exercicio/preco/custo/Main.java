package br.com.entra21.Exercicio.preco.custo;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.
		Aumentar um valor percentual é obtido matematicamente ao somar no valor do produto  com o resultado do calculo
		produto X (65 /100)

		ou seja aumento=produto+ produto X (60/100)*/
		
		String nomeProduto;
		float precoCusto,precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Qual é o preco de custo do produto " +nomeProduto+ "?");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto = (precoCusto *60/100);
		precoVenda = precoCusto *100f;
		
		System.out.println("O preço de venda é "+precoVenda);
	
		
		
	
		
		

				

	}

}
