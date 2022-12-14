package Prefi2020;

import java.util.ArrayList;

public class EmpleadoConPersonalACargoHumilde extends EmpleadoConPersonalACargo {
	private int cantDeEspecialidades;
	
	public EmpleadoConPersonalACargoHumilde(String nombre, String apellido, int edad,
			int aniosantiguedad, int cantDeEspecialidades, int sueldoFijo) {
		super(nombre, apellido, edad, aniosantiguedad, sueldoFijo);
		this.cantDeEspecialidades = cantDeEspecialidades;
		
	}

	@Override
	public ArrayList<String> getEspecialidad(){
		ArrayList<String> resultado = new ArrayList<>();
		ArrayList<String> aux =super.getEspecialidad();
		for(int i = 0; i<this.cantDeEspecialidades; i++) {
			resultado.add(aux.get(i));
		}
		return resultado;
	}

	public int getCantDeEspecialidades() {
		return cantDeEspecialidades;
	}

	public void setCantDeEspecialidades(int cantDeEspecialidades) {
		this.cantDeEspecialidades = cantDeEspecialidades;
	}
	
	
}
