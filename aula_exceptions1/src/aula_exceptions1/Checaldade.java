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
			//try catch te da a op�ao de errro e conserto
			//lan�a a exece�ao e para o progroma
			//throw manda uma exe�ao com codigo 400 e no front end manda uma mensagem definida
			throw new ArithmeticException("A pessoa n�o est� apta a dirigir!");
	
	}

}
