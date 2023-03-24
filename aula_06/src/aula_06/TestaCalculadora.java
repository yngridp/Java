package aula_06;

import java.util.Scanner;

import aula_06.calculos.Calculos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		
		int opcao;
		double numero1, numero2;
		
		while(true) {
		
			System.out.println("1-Soma");
			System.out.println("2-Subtra��o");
			System.out.println("3-Multiplica��o");
			System.out.println("4-Divis�o");			
			System.out.println("Qual a opera��o?");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				sobre();
				leia.close();
				System.exit(0);
			}
			
			System.out.println("Digite o 1� numero");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o 2� numero");
			numero2 = leia.nextDouble();
			
			switch(opcao) {
				case 1 :
					System.out.println("Soma: " + calc.soma(numero1, numero2));
					break;
				case 2 :
					System.out.println("Subtra��o: " + calc.subtracao(numero1, numero2));
					break;
				case 3 :
					System.out.println("Miltiplica��o: " + calc.multiplicacao(numero1, numero2));
					break;
				case 4 :
					System.out.println("Divis�o: " + calc.divisao(numero1, numero2));
					break;
				default :
					System.out.println("Op��o inv�lida!");
			}
		}
		
	}

	public static void sobre() {
		System.out.println("Calculadora com M�todos");
		System.out.println("Yngrid");
	}
}

