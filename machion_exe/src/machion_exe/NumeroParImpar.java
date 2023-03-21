package machion_exe;

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro");
		int numero =leia.nextInt();
		
		if(numero%2 == 0) {
			System.out.println(numero+ " é par!");
		}
		else {
			System.out.println(numero+ " é ímpar!");
		}
		leia.close();	
	}

}
