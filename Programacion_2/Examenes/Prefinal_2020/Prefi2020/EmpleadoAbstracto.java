package Prefi2020;

import java.util.ArrayList;

public abstract class EmpleadoAbstracto implements Comparable<EmpleadoAbstracto>{
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public EmpleadoAbstracto(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract ArrayList<String> getEspecialidad();
	public abstract double getSueldo();
	public abstract ArrayList<EmpleadoAbstracto> listarEmpleados();
	public abstract int contarEmpleados();
	
	
	public int compareTo(EmpleadoAbstracto e1) {
		int res = this.getApellido().compareTo(e1.getApellido());
		if(res == 0) {
			res = this.getNombre().compareTo(getNombre());
		}
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			EmpleadoAbstracto ea = (EmpleadoAbstracto) o;
			return this.getApellido().equals(ea.getApellido()) 
					&& this.getNombre().equals(ea.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
}

