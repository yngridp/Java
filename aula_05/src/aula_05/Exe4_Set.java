package aula_05;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe4_Set {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Set<Integer> listaN = new LinkedHashSet<>();
        
        int numero;
        
        listaN.add(7);
        listaN.add(3);
        listaN.add(8);
        listaN.add(4);
        listaN.add(6);
        listaN.add(3);
        listaN.add(5);
        listaN.add(2);
        listaN.add(1);
        listaN.add(10);
        
        System.out.print("Digite um número: ");
        numero = leia.nextInt();
        if (listaN.contains(numero)) {
            System.out.println("O núemero " + numero + " foi encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
            
    }

}