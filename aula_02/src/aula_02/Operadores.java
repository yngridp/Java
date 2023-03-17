package aula_02;

public class Operadores {

	public static void main(String[] args) {
		
		int n1 = 2 , n2 = 2, n3 =5;
		
		//excluisavamente apenas uma opção deve ser verdadeira
		System.out.println(n1 == n2 ^ n2 > n3);
		
		
        System.out.println("Variável n1: " + n1);
        //pre incremento, mostra n1 +1
        System.out.println("Variável n1: " + (++n1));
        
        System.out.println("Variável n1: " + n2);
        //pos incrementro, mostra apenas n2 e na promixa soma +1
        System.out.println("Variável n1: " + (n2++));
        System.out.println("Variável n1: " + n2);
        
        System.out.println("Variável n1: " + (n2+= 2));
        
        
        
	}

}
