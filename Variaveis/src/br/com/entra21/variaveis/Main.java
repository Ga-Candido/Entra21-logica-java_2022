package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		byte idade;
		idade = 19;

		byte outraIdade = 19;

		short ano = 2022;

		short anoPassado;

		anoPassado = 2021;

		System.out.println("Minha idade é " + (idade + outraIdade));
		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil = 2120600;

		System.out.println("No Brasil em " + ano + " temos exatamente " + habitantesBrasil + " habitantes. ");

		long habitantesTerra1500;
		habitantesTerra1500 = 790000000;

		double habitantesAtualmente = 7900000000.00;

		float peso = 70.5f, altura = 1.75f;

		System.out.println("Meu peso é " + peso);
		System.out.println("Minha altura é " + altura);

		/*char letra = 'R';

		boolean intervaloAntesdasOito = false;
		boolean intervaloAgora = true; */

		String nomeCompleto = "Gabriel Candido de Sousa";

		String nome = "Gabriel";
		byte minhaIdade;
		float minhaAltura = 1.75f, salario = 0f;

		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Por favor qual é o seu nome");
		nome = entrada.next();

		System.out.println("Informe sua idade");
		minhaIdade = entrada.nextByte();

		System.out.println("Informe agora sua altura");
		altura = entrada.nextFloat();

		System.out.println("Infome seu salario");
		salario = entrada.nextFloat();

		System.out.println(
				"Bem vindo" + nome + "agora consigo interagir com humanos já sei que vc tem " + minhaIdade + "anos.");
		
		System.out.println("O " + nome + " que tem " + minhaAltura + "cm disse que ganha" + salario + " será mesmo?");
		

		nome = JOptionPane.showInputDialog("Informe novamente o seu nome completo");
		
		JOptionPane.showMessageDialog(null, " legal agora eu aprendi o seu nome " +nome);
		
		
		
		
		
		

		
		
		
		

	}

}
