package SombreroSeleccionador;

import java.util.ArrayList;

public class CasaHogwarts {
	private String nombreCasa;
	private int cantAlumnos;	
	protected ArrayList<String> cualidadesRequeridas;
	protected ArrayList<Alumno> alumnos;
	
	public CasaHogwarts(int cantAlumnos, String nombreCasa){
		this.cantAlumnos = cantAlumnos;
		this.nombreCasa = nombreCasa;
		this.cualidadesRequeridas = new ArrayList<>();
		this.alumnos = new ArrayList<>();
	}
	
	public void setCantAlumnos( int cant) {
		cantAlumnos = cant;
	}
	
	public int getCantAlumnos() {
		return this.cantAlumnos;
	}
	
	
	public void agregarAlumno(Alumno a) {
		if((!this.alumnos.contains(a))&&(this.alumnos.size()<this.cantAlumnos)
				&&(cumpleRequisitos(a))&&(!a.tieneCasa())){
			alumnos.add(a);
		}
	}
	
	public boolean cumpleRequisitos(Alumno a) {
		ArrayList<String> cualidadesA= a.getCualidades();
		for(int i =0; i<cualidadesA.size();i++) {
			if(!cualidadesA.contains(cualidadesRequeridas.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public void addCualidadesRequeridas(String cr) {
		cualidadesRequeridas.add(cr);
	}
}
