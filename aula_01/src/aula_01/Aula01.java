package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {
	
	public static void main(String [] args) {
		
		//Formatação dos Números decimais
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		/* Leitura de dados via teclado */
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		
		System.out.println("Digite o primeiro numero: ");
		
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + df.format ((numero1 + numero2)));
		System.out.println("Subtração: " + df.format((numero1 - numero2)));
		System.out.println("Multiplicação: " + df.format((numero1 * numero2)));
		
		if (numero2 !=0) {
			System.out.println("Divisão: " + df.format((numero1 / numero2)));
		}else {
			System.out.println("Não existe Divisão por zero!");
		}
		
		System.out.println("Potência: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("Raíz Quadrada: " + df.format(Math.sqrt(numero1)));
		
		System.out.println("Nome: "+ nome);
		
		leia.close();
		
	}

}
