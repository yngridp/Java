package aula_01;

import java.util.Scanner;

public class Excercicio1 {

	public static void main(String[] args) {
    
		Scanner leia= new Scanner(System.in);
		
		float salario, abono, novosalario;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		System.out.println("Seu novo salário é: " + (salario+abono));
		novosalario = leia.nextFloat();
		
		leia.close();
		

	}

}
