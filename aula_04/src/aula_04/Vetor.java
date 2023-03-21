package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int vetorInteiros [] = {4, 5, 7, 6, 10, 1, 3, 2, 9, 8};
		
		float [] vetorFloat = new float [5];
		
		/*System.out.println("Digite um número: ");
	    numero = scanner.nextInt();
		
		for(int contador = 0; contador < vetorInteiros.length; contador ++) {
			//length devolve o tamanho do vetor ao invés de colocar nuemro 10
			//teste posicao do vetor = numero que foi digitado
			if(vetorInteiros[contador] == numero)
			System.out.println("Posição [" + contador + "] = " + vetorInteiros[contador]);
		}*/
		for(int contador = 0; contador < vetorFloat.length; contador ++) {
			System.out.println("Digite um valor para a posição[" + contador + "]: ");
			vetorFloat[contador] = scanner.nextFloat();
		}
		for(int contador = 0; contador < vetorFloat.length; contador ++) {
			System.out.println("Posição [" + contador + "] = " + vetorFloat[contador]);
		}
		//exemplifica a amostra dos numero na tela for it
		//
		for (float vfloat : vetorFloat) {
			System.out.println(vfloat);
		}
		//coloca em ordem os numeros do vetor 
		Arrays.sort(vetorInteiros);
		
		for (int vInt : vetorInteiros) {
			System.out.println(vInt);
		}
        scanner.close();
	}

}
