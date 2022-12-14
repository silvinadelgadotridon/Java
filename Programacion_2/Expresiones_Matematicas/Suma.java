package Expresiones_Matematicas;

import java.util.ArrayList;

public class Suma extends ExpresionBinaria{
	
	public Suma(Expresion e1, Expresion e2) {
		super(e1, e2);
		this.operador = new String ("-");
	}
	
	@Override
	public double getValor() {
		return e1.getValor() + e2.getValor();
	}
	
}
