package br.com.entra21.prova.signos;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	public static void Reset() { // 
		Scanner entrada = new Scanner(System.in);
		String nome, signo;
		byte mes;
		final byte DIA;
		System.out.println("Qual o seu nome?");
		nome = entrada.nextLine();
		System.out.println(nome + ", qual dia voc� faz aniversario?");
		DIA = entrada.nextByte();
		Meses();
		mes = entrada.nextByte();switch (mes) {

		case 1:
			verificarDiaMes( mes,  DIA);
			break;
		case 2:
			break;
		case 3:
			verificarDiaMes( mes,  DIA);
			break;
		case 4:
			verificarDiaMes( mes,  DIA);
			break;
		case 5:
			verificarDiaMes( mes,  DIA);
			break;
		case 6:
			verificarDiaMes( mes,  DIA);
			break;
		case 7:
			verificarDiaMes( mes,  DIA);
		case 8:
			verificarDiaMes( mes,  DIA);
			break;
		case 9:
			verificarDiaMes( mes,  DIA);
			break;
		case 10:
			verificarDiaMes( mes,  DIA);
			break;
		case 11:
			verificarDiaMes( mes,  DIA);
			break;
		case 12:
			verificarDiaMes( mes,  DIA);
			break;	
		default:
			JOptionPane.showInternalMessageDialog(null, "ERRO AO DIGITAR O M�S");
			Reset(); Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
			Reset(); Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
			Reset();Reset();
		}
	
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, signo;
		byte mes;
		final byte DIA;
		System.out.println("Qual o seu nome?");
		nome = entrada.nextLine();
		System.out.println(nome + ", qual dia voc� faz aniversario?");
		DIA = entrada.nextByte();
		Meses();
		mes = entrada.nextByte();

		switch (mes) {

		case 1:
			verificarDiaMes( mes,  DIA);
			
			break;
		case 2:
			verificarDiaMes( mes,  DIA);
			
			break;
		case 3:
			verificarDiaMes( mes,  DIA);
			break;
		case 4:
			verificarDiaMes( mes,  DIA);
			break;
		case 5:
			verificarDiaMes( mes,  DIA);
			break;
		case 6:
			verificarDiaMes( mes,  DIA);
			break;
		case 7:
			verificarDiaMes( mes,  DIA);;
			break;
		case 8:
			verificarDiaMes( mes,  DIA);;
			break;
		case 9:
			verificarDiaMes( mes,  DIA);
			break;
		case 10:
			verificarDiaMes( mes,  DIA);
			break;
		case 11:
			verificarDiaMes( mes,  DIA);
			break;
		case 12:
			verificarDiaMes( mes,  DIA);;
			break
			;
		case 13:
			SIGNOS(mes, DIA);
		default:
			JOptionPane.showInternalMessageDialog(null, "ERRO AO DIGITAR O M�S");
			Reset(); // usado para dar retorno ao progama.
			
			
			
	
		

		}

	}

	public static void verificarDiaMes(byte mes, byte DIA) {
		final byte diasLimiteMes29 = 29;
		final byte diasLimiteMes30 = 30;
		final byte diasLimiteMes31 = 31;
		
		if (mes == 2 && DIA >diasLimiteMes29) {
			System.out.println("Por favor, digite uma op��o v�lida FEVEREIRO TEM no m�ximo 29 dias.");
		} else if (mes == 4 && DIA >diasLimiteMes30) {
			System.out.println("Por favor, digite uma op��o v�lida ABRIL TEM no m�ximo 30 dias.");
		} else if (mes == 6 && DIA >diasLimiteMes30) {
			System.out.println("Por favor, digite uma op��o v�lida JUNHO TEM no m�ximo 30 dias.");
		} else if (mes == 9 && DIA >diasLimiteMes30) {
			System.out.println("Por favor, digite uma op��o v�lida SETEMBRO TEM no m�ximo 30 dias.");
		} else if (mes == 11 && DIA >diasLimiteMes30) {
			System.out.println("Por favor, digite uma op��o v�lida NOVEMBRO TEM no m�ximo 30 dias.");
		} else if (DIA >diasLimiteMes31){
			System.out.println("Por favor, digite uma op��o v�lida. Um m�s tem no m�ximo 31 dias.");
		} else {
			SIGNOS(mes,DIA);
		}
	}
	
	public static void Meses() { // fun��o criada para demonstar os meses
		System.out.println("Informe em qual m�s voc� faz anivers�rio");
		System.out.println("|1 = Janeiro   |    |7 = Julho      |");
		System.out.println("|2 = Fevereiro |    |8 = Agosto     |");
		System.out.println("|3 = Mar�o     |    |9 = Setembro   |");
		System.out.println("|4 = Abril     |    |10 = Outubro   |");
		System.out.println("|5 = Maio      |    |11 = Novembro  |");
		System.out.println("|6 = Junho     |    |12 = Dezembro  |");

	}

	public static void SIGNOS( byte mes , byte DIA) { // fun��o criada para decidir os SIGNOS.

		if (mes == 1 && DIA >= 21 || mes == 2 && DIA <= 18) {
			System.out.println("Seu signo �: Aquario"); // mostra seu signo com base no mes e o dia.
		} else if (mes == 2 && DIA >= 19 || mes == 3 && DIA <= 20) {
			System.out.println("Seu signo �: Peixes");
		} else if (mes == 3 && DIA >= 21 || mes == 4 && DIA <= 20) {
			System.out.println("Seu signo �: Ar�es");
		} else if (mes == 4 && DIA >= 21 || mes == 5 && DIA <= 20) {
			System.out.println("Seu signo � Touro ");
		} else if (mes == 5 && DIA >= 21 || mes == 6 && DIA <= 20) {
			System.out.println("Seu signo � Gemeos");
		} else if (mes == 6 && DIA >= 21 || mes == 7 && DIA <= 22) {
			System.out.println("Seu signo � Cancer");
		} else if (mes == 7 && DIA >= 23 || mes == 8 && DIA <= 22) {
			System.out.println("Seu signo � Le�o");
		} else if (mes == 8 && DIA >= 23 || mes == 9 && DIA <= 22) {
			System.out.println("Seu signo � Virgem");
		} else if (mes == 9 && DIA >= 23 || mes == 10 && DIA <= 22) {
			System.out.println("Seu signo � Libra");
		} else if (mes == 10 && DIA >= 23 || mes == 11 && DIA <= 21) {
			System.out.println("Seu signo � Escorpi�o");
		} else if (mes == 11 && DIA >= 22 || mes == 12 && DIA <= 21) {
			System.out.println("Seu signo � Sagitario");
		} else if (mes == 12 && DIA >= 22 || mes == 1 && DIA <= 20) {
			System.out.println("Seu signo � Capric�rnio");
		} else {
			
		}

	}
	
	
}

