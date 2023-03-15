package aula_01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
    
		Scanner leia= new Scanner(System.in);
		
		float  nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeria nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("Seu média é: " + (nota1+nota2+nota3+nota4)/ 4);
		media = leia.nextFloat();
		
		leia.close();
	}
}