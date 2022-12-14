package SombreroSeleccionador;

import java.util.ArrayList;


public class Alumno {
	private String nombre;
	private ArrayList<String> cualidadesAlumno;
	private ArrayList<Alumno> familiares;
	private CasaHogwarts casa;
	
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		cualidadesAlumno = new ArrayList <>();
		familiares = new ArrayList<> ();
		casa = null;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addCualidades(String c){
		cualidadesAlumno.add(c);
	}
	
	public boolean tieneCasa() {
		if(this.casa!= null){
			return  true;
		}
		return false;
	}
	
	public ArrayList<String> getCualidades(){
		ArrayList<String> copia = new ArrayList<>(cualidadesAlumno);
		return copia; 
	}
	
	public void addFamiliares(Alumno f) {
		familiares.add(f);
	}
	
	public ArrayList<Alumno> getFamiliares(){
		ArrayList<Alumno> copia = new ArrayList<>(familiares);
		return copia;
	}
}
