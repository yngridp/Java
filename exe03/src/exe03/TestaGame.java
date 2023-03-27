package exe03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		//g1 nome do objeto
		//criando objetos
		//localdate tem que criar um objeto pois é uma classe
		LocalDate data =  LocalDate.of(2020, 05, 10);
		Produto g1 = new Produto(1, "Valorant",1 , "Riot games",data,1200.of );
		
        g1.visualizar();
	}

}
