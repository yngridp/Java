package aula_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exe1_ArrayList {

    public static void main(String[] args) {
        
        Scanner leia =new Scanner(System.in);
        
        ArrayList<String> listaCor = new ArrayList<>();
        
        
        System.out.print("Digite a 1� cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 2� cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 3� cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 4� cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 5� cor: ");
        listaCor.add(leia.next());
        
        System.out.println(listaCor);
        
        listaCor.sort(Comparator.naturalOrder()); 
        System.out.println("Lista de cores ordenadas: " + listaCor);
        
    }

}