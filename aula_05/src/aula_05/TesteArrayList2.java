package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteArrayList2 {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	//foco n�o repetir valores
	Set<Integer> numeros = new HashSet<Integer>();
	
	int numero;
	boolean numeroEncontrado = false;
	int vetorInteiros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	
	System.out.println("Digite um n�mero: ");
	numero = scanner.nextInt();
	
	for (int contador = 0; contador < vetorInteiros.length; contador ++) {
        if (vetorInteiros[contador] == numero) {
            System.out.println(" O N�mero " + numero + " est� localizado na posi��o: " + contador);
            numeroEncontrado = true;
        }

    }
	  if (numeroEncontrado == false) {
        System.out.println("O n�mero n�o foi encontrado!");
    }

    scanner.close();
	

}
}