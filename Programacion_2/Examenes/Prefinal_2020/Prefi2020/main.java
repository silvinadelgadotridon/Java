package Prefi2020;

public class main {

	public static void main(String[] args) {
		CalculadorPorHora ch1 = new CalculadorPorHora(100, 12);
		CalculadorHorasExtra che1 = new CalculadorHorasExtra(120, ch1);
				
		Programador pr1 = new Programador("Siri","Apple", 5, 3, che1);
		
		pr1.addEspecialidades("Base de Datos");
		pr1.addEspecialidades("java");
		
		System.out.println(pr1.getSueldo());
		
		
		
		CalculadorPorHora ch2 = new CalculadorPorHora(100, 5);
		CalculadorHorasExtra che2 = new CalculadorHorasExtra(120, ch2);
		
		Programador pr2 = new Programador("Cortana","Windows", 4, 6, che2);
		
		pr2.addEspecialidades("java");
		
		System.out.println(pr2.getSueldo());
		
		
		
		CalculadorSueldoMensual ch3 = new CalculadorSueldoMensual(15000);
		CalculadorHorasExtra che3 = new CalculadorHorasExtra(120, ch3);
		
		Programador pr3 = new Programador("Alexa","Amazon", 3, 2, che3);
		
		pr3.addEspecialidades("js");
		pr3.addEspecialidades("php");
		
		System.out.println(pr3.getSueldo());
		
		
			
		EmpleadoConPersonalACargo e1 = new EmpleadoConPersonalACargo("Timoteo", "N", 25,6, 16000);
		
		e1.addEmpleado(pr1);
		e1.addEmpleado(pr2);
		e1.addEmpleado(pr3);
		
		System.out.println(e1.contarEmpleados());
		System.out.println(e1.getSueldo());
		System.out.println(e1.getEspecialidad());
		
	}

}
