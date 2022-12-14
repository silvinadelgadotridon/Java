package SombreroSeleccionador;

import java.util.ArrayList;

public class CasaExigente extends CasaHogwarts {
	 
	private ArrayList<Alumno> familiaresAsisten;
	
	
	public CasaExigente(int cantAlumnos, String nombreCasa) {
		super(cantAlumnos, nombreCasa);
		familiaresAsisten= new ArrayList<>();
	}
	
	@Override
	public boolean cumpleRequisitos(Alumno a) {
		if(super.cumpleRequisitos(a)) {
			ArrayList<Alumno> familiares = a.getFamiliares();
			for(int i=0; i<familiares.size();i++) {
				if(alumnos.contains(familiares.get(i))) {
					
					return true;
				}	
			}
		}
		return false;
	}
}
