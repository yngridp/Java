package machion_exe;

import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.print("digite o primeiro valor:");
		v1 = scanner.nextDouble();
		System.out.print("digite o segundo valor:");
		v2 = scanner.nextDouble();
		System.out.print("digite o terceiro valor:");
		v3 = scanner.nextDouble();
		
		if(v1>= v2 && v1 >=v3) {
			System.out.print( v1 +" é o maior!");
		}
		else if(v2 >= v3) {
			System.out.print(v2 + " é o maior!");
		}
		else {
			System.out.print(v3 + "é o maior!");
		}
		
		scanner.close();

	}

}
