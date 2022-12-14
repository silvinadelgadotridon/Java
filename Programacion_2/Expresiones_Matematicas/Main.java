package Expresiones_Matematicas;

public class Main {
	public static void main(String[] args) {
		Numero n1 = new Numero (2);
		Numero n2 = new Numero (3);
		Numero n3 = new Numero (5);
		
		Expresion e1 = new Suma (n1, n2);
		Expresion e2 = new Multiplicacion (e1, n3);
		
		System.out.println(e2.getValor());
		
		System.out.println(e2.getNumeros());
		
		System.out.println(e2.getOperadores());
		
	}
}
