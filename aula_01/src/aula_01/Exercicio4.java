package aula_01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
    
		Scanner leia= new Scanner(System.in);
		
		float  n1, n2, n3, n4;
		
		System.out.print("Digite o primeiro valor: ");
        n1 = leia.nextFloat();

        System.out.print("Digite o segundo valor: ");
        n2 = leia.nextFloat();

        System.out.print("Digite o terceiro valor: ");
        n3 = leia.nextFloat();

        System.out.print("Digite o quarto valor: ");
        n4 = leia.nextFloat();


        System.out.println("Diferença: " + ((n1*n2 )- (n3*n4)));

        leia.close();
        
	}
}