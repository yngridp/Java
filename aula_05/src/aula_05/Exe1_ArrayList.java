package aula_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exe1_ArrayList {

    public static void main(String[] args) {
        
        Scanner leia =new Scanner(System.in);
        
        ArrayList<String> listaCor = new ArrayList<>();
        
        
        System.out.print("Digite a 1º cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 2º cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 3º cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 4º cor: ");
        listaCor.add(leia.next());
        System.out.print("Digite a 5º cor: ");
        listaCor.add(leia.next());
        
        System.out.println(listaCor);
        
        listaCor.sort(Comparator.naturalOrder()); 
        System.out.println("Lista de cores ordenadas: " + listaCor);
        
    }

}