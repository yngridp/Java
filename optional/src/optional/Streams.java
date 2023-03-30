package optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		for(int n : numeros)
			System.out.println(n);
		
		List<Integer> numerosStream = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
		
		System.out.println(numerosStream);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(numerosPares);
		
		List<Integer> numerosDescrescente = numeros.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(numerosDescrescente);
		
		long contaPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.count();
		
		System.out.println(contaPares);
	}

}
