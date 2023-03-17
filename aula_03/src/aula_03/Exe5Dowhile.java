package aula_03;

import java.util.Scanner;

public class Exe5Dowhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0 , soma=0 ;
		
		//pelo menos uma vez letra um numero
		do {
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		if(numero >0)
			//soma o numero anteior com com seguinte se forem positivos(apenas numeros >0
			//soma=soma +numero (outra forma de fazer
			soma += numero;
		
		//enquanto o numero for diferente de 0
		}while(numero !=0);
       System.out.println("Soma dos números positivos:" +soma);
	}

}
