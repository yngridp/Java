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
		System.out.println("Resultado de A+B �:"+resultado);
		
		if(a+b>c)
			System.out.println("A soma de A+B � maior que C.");
		else if(a+b<c)
			System.out.println("A soma de A+B � menor que C.");
		else if (a+b==c)
			System.out.println("A soma de A+B � igual a C.");
		
		leia.close();
		
	}

}
