package aula_04;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int numero;
	        int vetorInteiros[] = { 4, 5, 7, 6, 10, 1, 3, 2, 9, 8 };
	        boolean numeroEncontrado = false;

	            System.out.println("Digite um n�mero: ");
	            numero = leia.nextInt();

	                for (int contador = 0; contador < vetorInteiros.length; contador ++) {
	                    if (vetorInteiros[contador] == numero) {
	                        System.out.println(" O N�mero " + numero + " est� localizado na posi��o: " + contador);
	                        numeroEncontrado = true;
	                    }

	                }

	                if (numeroEncontrado == false) {
	                    System.out.println("O n�mero n�o foi encontrado!");
	                }

	                leia.close();

	}

}
