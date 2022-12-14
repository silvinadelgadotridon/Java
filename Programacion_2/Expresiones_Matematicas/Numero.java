package Expresiones_Matematicas;

import java.util.ArrayList;

public class Numero extends Expresion{
	private double valor;
	
	
	public Numero(double valor) {
		super();
		this.valor = valor;
	}


	@Override
	public double getValor() {
		return this.valor;
	}
	

	public ArrayList<Numero> getNumeros(){
		ArrayList<Numero> numeros = new ArrayList<>();
		numeros.add(this);
		return numeros;
	}


	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}


	@Override
	protected ArrayList<String> getOperadores() {
		return new ArrayList<>();
	}
		

}
