package aula_exceptions1;

import java.util.Scanner;

public class Checaldade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		
	}

	public static void validarIdade(int idade){
		
		if(idade > 18)
			System.out.println("A Pessoa pode dirigir!!");
		else
			//try catch te da a opçao de errro e conserto
			//lança a execeçao e para o progroma
			//throw manda uma exeçao com codigo 400 e no front end manda uma mensagem definida
			throw new ArithmeticException("A pessoa não está apta a dirigir!");
	
	}

}
