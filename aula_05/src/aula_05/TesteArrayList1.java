package aula_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TesteArrayList1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList();
		
		for(int contador = 0; contador <=3; contador ++) {
			System.out.println("Digite a cor:");
			cores.add(scanner.nextLine());
		}
		System.out.println(cores);
		
		cores.sort(null);
		System.out.println("Cores ordenadas:" + cores);
		
		
		
			
	}
}