package aula_02;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
        
		Scanner leia = new Scanner(System.in);

        int operacao;
        float v1, v2;

        System.out.println("Opera��es");
        System.out.println("1\tSoma");
        System.out.println("2\tSubtra��o");
        System.out.println("3\tMultiplicacao");
        System.out.println("4\tDivis�o");

        System.out.println("Digite o primeiro valor: ");
        v1 = leia.nextFloat();
        System.out.println("Digite o segundo valor: ");
        v2 = leia.nextFloat();
        System.out.println("Digite a Opera��o: ");
        operacao = leia.nextInt();


        switch(operacao) {
            case 1:
                System.out.println(v1 + " + " + v2 + " = " + ( v1 + v2));
            break;
            case 2:
                System.out.println(v1 + " - " + v2 + " = " + ( v1 - v2));
            break;
            case 3:
                System.out.println(v1 + " * " + v2 + " = " + ( v1 * v2));
            break;
            case 4:
                System.out.println(v1 + " / " + v2 + " = " + ( v1 / v2));
            break;
         default:
             System.out.println("Opera��o Inv�lida");

        leia.close();
	}

}
}
