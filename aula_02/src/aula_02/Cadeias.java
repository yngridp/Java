package aula_02;

public class Cadeias {

	public static void main(String[] args) {
		
		String s1 ="Generation Brasil";
		String s2 ="GENERATION BRASIL";
		String s3 ="Generation Brasil";
		//metodos da string
		System.out.println(s1 == s3);
		
		//equals ver� se � s1 � exatamente igual a s3,considerando letras maiusculas ou minisculas
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s2));
		
		//tanto faz se � mmai�sculos ou minusculos, campara��o se as letras s�o iguais
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//deixar a string totalmente maiuscula
		System.out.println(s1.toUpperCase());
		
		//string toda com letra minuscula
		System.out.println(s1.toLowerCase());
		
		//mostrara as letras que eu quiser da palavra
		System.out.println(s1.substring(0,10));
		
		//n�o existe essa palavra na minha string especifica, compara com texto ou com outras variaveis
		System.out.println(s1.contains("Baranguariquati"));
		
		

		

	}

}
