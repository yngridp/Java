package optional;

import java.util.Optional;

public class Optional001 {// classe optinal // princial funçao evitar eero no codigo , quando o objeto é nulo, ccehca se exta vaizo ou nao se esta vazio é nulo

		public static void main(String[] args) {
	        
			String[] palavras = new String[10];
			
			palavras[5] = "Turma 62";
			
			Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
			
			if (checaNulo.isPresent()) {// achou alguma coisa
				String palavra = palavras[5].toLowerCase();// toLowerCase converte tudo p letra minuscula metodo da classe String
				System.out.println(palavra);
			}else
				System.out.println("A palavra é nula!");// caso contrario mensagem nulo // impede de dar o erro por causa do objeto ser nulo
	        
			System.out.println("Optional está vazio? " + Optional.empty());
		}
	}

