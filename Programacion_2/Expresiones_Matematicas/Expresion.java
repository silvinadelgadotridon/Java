package Expresiones_Matematicas;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Expresion {
		
	public abstract double getValor();

	protected abstract ArrayList<Numero> getNumeros();

	protected abstract ArrayList<String> getOperadores();
	
	
	
}
