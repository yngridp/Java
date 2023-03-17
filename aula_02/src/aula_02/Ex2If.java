package aula_02;

import java.util.Scanner;

public class Ex2If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro:");
		num=leia.nextInt();
		
		if(num%2==0 && num>0)
			System.out.println("O número "+num+" é par e positivo!");
		else if(num%2==0 && num<0)
			System.out.println("O número "+num+" é par e negativo!");
		else if(num%2!=0 && num>0)
			System.out.println("O número  "+num+" é ímpar e positivo!");
		else if(num%2!=0 && num<0)
			System.out.println("O número "+num+" é ímpar e negativo!");
		
		leia.close();		
	}

}
