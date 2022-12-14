package Prefi2020;

import java.util.ArrayList;

public class Programador extends EmpleadoAbstracto {
	ArrayList<String> especialidades;
	private int horasExtra;
	protected CalculadorDeSueldo cs;
	
	public Programador(String nombre, String apellido, int edad, int horasExtra, CalculadorDeSueldo cs ) {
		super(nombre, apellido, edad);
		this.horasExtra = horasExtra;
		this.especialidades = new ArrayList<>();	
		this.cs = cs;
	}
	
	public void addEspecialidades(String s) {
		if(!especialidades.contains(s)) {
			especialidades.add(s);
		}
	}
	
	@Override
	public ArrayList<String> getEspecialidad() {
		return new ArrayList<String>(especialidades);
	}
	

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	
	@Override
	public double getSueldo() {
		return cs.calcularSueldo(this);
	}


	@Override
	public ArrayList<EmpleadoAbstracto> listarEmpleados() {
		ArrayList<EmpleadoAbstracto> lista = new ArrayList<>();
		lista.add(this);
		return lista;
	}

	@Override
	public int contarEmpleados() {
		return 1;
	}
	
}
