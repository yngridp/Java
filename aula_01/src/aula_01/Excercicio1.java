package aula_01;

import java.util.Scanner;

public class Excercicio1 {

	public static void main(String[] args) {
    
		Scanner leia= new Scanner(System.in);
		
		float salario, abono, novosalario;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite seu sal�rio: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		System.out.println("Seu novo sal�rio �: " + (salario+abono));
		novosalario = leia.nextFloat();
		
		leia.close();
		

	}

}
