package aula_03;

import java.util.Scanner;

public class Exe2For {

	public static void main(String[] args) {
			
		     Scanner leia  = new Scanner(System.in);
		     
		     int num,contPar = 0, impar=0 ;
		     
		    
		     for (int i = 0; i < 10; i++) {

		            System.out.printf("Digite o %dº número (maior ou igual a 0 e menor que 100): ", i + 1);
		            num = leia.nextInt(); 
		            if (num % 2 == 0)
		                contPar++;
		                else if(num %2 !=0)
		                	impar ++;
	}
		     System.out.println("Total de numero pares:" + contPar);
		     System.out.println("Total de numero ímpares:" + impar);
}
}