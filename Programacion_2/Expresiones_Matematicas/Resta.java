package Expresiones_Matematicas;

public class Resta extends ExpresionBinaria{
	
	public Resta(Expresion e1, Expresion e2){
		super(e1, e2);
		this.operador = new String("-");
	}
	
	@Override
	public double getValor() {
		return e1.getValor() - e2.getValor();
	}
}
