package Expresiones_Matematicas;

import java.util.ArrayList;

public abstract class ExpresionBinaria extends Expresion {
	protected String operador;
	protected Expresion e1;
	protected Expresion e2;
	
	
	
	public ExpresionBinaria(Expresion e1, Expresion e2) {
		this.e1 = e1;
		this.e2 = e2;
		
	}
	
	public String toString() {
		return e1.getValor() + this.operador + e2.getValor();
	}

	public abstract double getValor();
		
	public ArrayList<Numero> getNumeros(){
		ArrayList<Numero> copia = new ArrayList<>();
		copia.addAll(e1.getNumeros());
		copia.addAll(e2.getNumeros());
		
		return copia;
		
	}
	
	public ArrayList<String> getOperadores() {
		ArrayList<String> resultado = new ArrayList<>();
		resultado.addAll(e1.getOperadores());
		resultado.addAll(e2.getOperadores());
		resultado.add(operador);
		return resultado;
	}
}
