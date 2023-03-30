package optional;

import java.util.Optional;

public class Optional001 {// classe optinal // princial fun�ao evitar eero no codigo , quando o objeto � nulo, ccehca se exta vaizo ou nao se esta vazio � nulo

		public static void main(String[] args) {
	        
			String[] palavras = new String[10];
			
			palavras[5] = "Turma 62";
			
			Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
			
			if (checaNulo.isPresent()) {// achou alguma coisa
				String palavra = palavras[5].toLowerCase();// toLowerCase converte tudo p letra minuscula metodo da classe String
				System.out.println(palavra);
			}else
				System.out.println("A palavra � nula!");// caso contrario mensagem nulo // impede de dar o erro por causa do objeto ser nulo
	        
			System.out.println("Optional est� vazio? " + Optional.empty());
		}
	}

