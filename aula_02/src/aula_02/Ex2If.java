package aula_02;

import java.util.Scanner;

public class Ex2If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero inteiro:");
		num=leia.nextInt();
		
		if(num%2==0 && num>0)
			System.out.println("O n�mero "+num+" � par e positivo!");
		else if(num%2==0 && num<0)
			System.out.println("O n�mero "+num+" � par e negativo!");
		else if(num%2!=0 && num>0)
			System.out.println("O n�mero  "+num+" � �mpar e positivo!");
		else if(num%2!=0 && num<0)
			System.out.println("O n�mero "+num+" � �mpar e negativo!");
		
		leia.close();		
	}

}
