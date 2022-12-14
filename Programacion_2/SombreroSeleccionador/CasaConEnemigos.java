package SombreroSeleccionador;

import java.util.ArrayList;


public class CasaConEnemigos extends CasaHogwarts {
	private CasaHogwarts casaEnemiga;
	
	

	public CasaConEnemigos(int cantAlumnos,String nombreCasa, CasaHogwarts casaEnemiga) {
		super(cantAlumnos, nombreCasa);
		this.casaEnemiga = casaEnemiga;
	}



	@Override
	public boolean cumpleRequisitos(Alumno a) {
		if(super.cumpleRequisitos(a)&&(!casaEnemiga.cumpleRequisitos(a))) {
			return true;
		}
		return false;
		
	}
	
	
	
	
}
