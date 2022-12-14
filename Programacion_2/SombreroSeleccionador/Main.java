package SombreroSeleccionador;

public class Main {

	public static void main(String[] args) {
		Alumno a = new Alumno("Harry");
		a.addCualidades("leal");
		a.addCualidades("coraje");
		a.addCualidades("valentía");
		
		CasaHogwarts huff = new CasaHogwarts(2, "hufflepuff");
		huff.addCualidadesRequeridas("justo");
		huff.addCualidadesRequeridas("leal");
		huff.addCualidadesRequeridas("trabajador");
		
		System.out.println(huff.cumpleRequisitos(a));
		
		
		CasaHogwarts gry = new CasaHogwarts(2, "gryffindor");
		gry.addCualidadesRequeridas("leal");
		gry.addCualidadesRequeridas("coraje");
		gry.addCualidadesRequeridas("valentía");
		
		System.out.println(gry.cumpleRequisitos(a));
		
		CasaConEnemigos sly = new CasaConEnemigos(1,"slythering", 
								new CasaHogwarts(1, "gryffindor"));
		
		sly.addCualidadesRequeridas("ambicioso");
		sly.addCualidadesRequeridas("inteligente");
		
		System.out.println(sly.cumpleRequisitos(a));
		
	}

}
