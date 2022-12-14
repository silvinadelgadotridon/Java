package Prefi_2021;

import Prefi_2021.Filtros.FiltroAnio;

public class main {
	public static void main(String[] args) {
		FiltroAnio f = new FiltroAnio(2017);
		
		Usuario u1 = new Usuario("Pepe", 2010, "pepe@gmail.com");
		Usuario u2 = new Usuario("Pepa", 2019, "pepa@gmail.com");
		
		Video v1 = new Video("lalaland", 123, 25, 2, 6, 2017, u1);
		Video v2 = new Video("lalaland", 123, 25, 2, 6, 2017, u2);
		Video v3 = new Video("Bohemian Rhapsody", 110, 120, 100, 6, 2018, u2);
		Video v4 = new Video("Avengers", 150, 120, 100, 6, 2021, u2);
		
		v1.addpalabraClave("Comedia musical");
		v1.addpalabraClave("Romance");
		
		v2.addpalabraClave("Comedia musical");
		v2.addpalabraClave("Romance");
		
		v3.addpalabraClave("Musica");
		v3.addpalabraClave("Biografia");
		
		v1.addpalabraClave("Acción");
		v1.addpalabraClave("Ciencia Ficción");
		
		PlayList pl1 = new PlayList("Las mejores", 5);
		PlayList pl2 = new PlayList("Popurri", 5);
		
		pl1.addElemento(v3);
		pl1.addElemento(v4);
		
		pl2.addElemento(pl1);
		pl2.addElemento(v1);
		pl2.addElemento(v2);
		
		System.out.println(pl2.buscar(f));
	}
	
}
