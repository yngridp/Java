package aula_02;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigoProduto, quantidade;
        float v1=10,v2=15,v3=18,v4=12,v5=8,v6=13;

        System.out.println("Código do Produto\t Produto \t Preço Unitário");
        System.out.println("\t1\t\t Hot Dog \t R$" + v1);
        System.out.println("\t2\t\t X-salada \t R$" + v2);
        System.out.println("\t3\t\t X-bacon \t R$" + v3);
        System.out.println("\t4\t\t Bauru \t\t R$" + v4);
        System.out.println("\t5\t\t Refrigerante \t R$" + v5);
        System.out.println("\t6\t\t Suco \t\t R$" + v6);
        

        System.out.println("Digite o código do produto: ");
        codigoProduto= leia.nextInt(); 
        if(codigoProduto >6) {
        	System.out.println("Código Inválido");
            System.exit(0);
	}
        System.out.println("Digite a quantidade: ");
        quantidade= leia.nextInt();
        


        switch(codigoProduto) {
            case 1:
                System.out.println("Produto Cachorro Quente: \nValor Total:R$ " + v1* quantidade);
            break;
            case 2:
                System.out.println("Produto X-Salada: \nValor Total:R$ " + v2* quantidade);
            break;
            case 3:
                System.out.println("Produto X-Bacon: \nValor Total:R$ " + v3* quantidade);
            break;
            case 4:
                System.out.println("Produto Bauru: \nValor Total:R$ " + v4* quantidade);
            break;
            case 5:
                System.out.println("Produto Refrigente : \nValor Total:R$ " + v5* quantidade);
            break;
            case 6:
                System.out.println("Produto Suco de laranja : \nValor Total:R$ " + v6* quantidade);
            break;
            
	}
        leia.close();
}

	}
