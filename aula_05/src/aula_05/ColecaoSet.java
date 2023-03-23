package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// estrutura de dados não ordenados (único) sem repetição
public class ColecaoSet {

    public static void main(String[] args) {
        
        Set<String> setFrutas = new HashSet<String>();
        
        setFrutas.add("Abacate");
        setFrutas.add("Banana");
        setFrutas.add("Jaboticaba");
        setFrutas.add("Kiwi");
        setFrutas.add("Maçã");
        setFrutas.add("Morango");
        setFrutas.add("Pêra");
        setFrutas.add("Jaboticaba");
        setFrutas.add("Kiwi");
        setFrutas.add("KIWI");
        
        //percorre os objetos da lista (iterator)
        Iterator<String> isetFrutas = setFrutas.iterator();

        while (isetFrutas.hasNext()) {
            System.out.println(isetFrutas.next());
            
        }

        /*for(var fruta : setFrutas)
            System.out.println(fruta.hashCode());*/
        
        System.out.println("Existe a fruta manga?" + setFrutas.contains("manga"));
        
        
        setFrutas.remove("Kiwi");
        
        //atualizar a lista depois da alteração
        for(String fruta : setFrutas)
            System.out.println(fruta);
    }

}
//ctrl+shift+O importa tudo que precisa
//hashset não possui ordenação e classificacao de informaçoes, serve para nao ter dados repetidos
		//para isso teria que usar linkedset ou outro