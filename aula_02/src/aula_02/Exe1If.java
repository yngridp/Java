package aula_02;

import java.util.Scanner;

public class Exe1If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,resultado;
		
		System.out.println("Digite o primeiro valor:");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor:");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor:");
		c = leia.nextInt();
		
		resultado= (a+b);
		System.out.println("Resultado de A+B é:"+resultado);
		
		if(a+b>c)
			System.out.println("A soma de A+B é maior que C.");
		else if(a+b<c)
			System.out.println("A soma de A+B é menor que C.");
		else if (a+b==c)
			System.out.println("A soma de A+B é igual a C.");
		
		leia.close();
		
	}

}
