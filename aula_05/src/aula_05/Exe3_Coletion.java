package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe3_Coletion {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		//foco não repetir valores
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int contador = 0; contador < 10; contador ++) {
			System.out.println("Digite um número: ");
			numeros.add(leia.nextInt());
		}
		
		numeros.add(null);
		
		System.out.println("Listar os Elementos do Conjunto");
		
		for(int numero : numeros)
			System.out.println(numero);
		
		leia.close();

	}

}
