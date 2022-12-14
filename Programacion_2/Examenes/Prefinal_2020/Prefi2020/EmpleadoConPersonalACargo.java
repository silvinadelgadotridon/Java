package Prefi2020;

import java.util.ArrayList;
import java.util.Collections;

public class EmpleadoConPersonalACargo extends EmpleadoAbstracto{
	private double sueldoFijo;
	private int aniosantiguedad;
	protected ArrayList<EmpleadoAbstracto> prog;
	
	public EmpleadoConPersonalACargo(String nombre, String apellido, 
									int edad,int aniosantiguedad, double sueldoFijo) {
		super(nombre, apellido, edad);
		this.aniosantiguedad = aniosantiguedad;
		this.sueldoFijo = sueldoFijo;
		this.prog = new ArrayList<EmpleadoAbstracto>();
		
	}

	public void addEmpleado(EmpleadoAbstracto ea) {
		if(!prog.contains(ea)) {
			prog.add(ea);
		}
	}
	
	
	@Override
	public ArrayList<String> getEspecialidad(){
		ArrayList<String> resultado = new ArrayList<>();
		for(EmpleadoAbstracto p:prog) {
			ArrayList<String> aux = p.getEspecialidad();
			for(String s: aux) {
				if(!resultado.contains(s)) {
					resultado.add(s);
				}
			}
		}
		return resultado;
	}


	@Override
	public double getSueldo() {
		double suma = 0;
		for(EmpleadoAbstracto e: prog) {
			suma += e.getSueldo();
			
		}
		return suma+ this.getSueldoFijo();
	}




	public int getAniosantiguedad() {
		return aniosantiguedad;
	}


	public void setAniosantiguedad(int aniosantiguedad) {
		this.aniosantiguedad = aniosantiguedad;
	}




	public double getSueldoFijo() {
		return sueldoFijo;
	}


	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}




	@Override
	public ArrayList<EmpleadoAbstracto> listarEmpleados() {
		ArrayList<EmpleadoAbstracto> lista = new ArrayList<>();
		for(EmpleadoAbstracto e: prog) {
			lista.addAll(e.listarEmpleados());
			
		}
		lista.add(this);
		Collections.sort(lista);
		
		return lista;
		
	}
	
	@Override
	public int contarEmpleados() {
		return this.listarEmpleados().size() - 1;

	}
	
	
}
