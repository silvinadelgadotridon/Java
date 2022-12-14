import java.util.ArrayList;

public class ComboPagaUno extends Combo {
	
	public ComboPagaUno(String nombre, double descuentoProducto, double topeDescuento) {
		super(nombre, descuentoProducto, topeDescuento);
	}

	
	@Override
	public double getPrecio() {
		double precioMayor = 0;
		for(Bazar b: elementos) {
			if(b.getPrecio()>precioMayor) {
				precioMayor = b.getPrecio();
				System.out.println(precioMayor);
			}
		}
		return precioMayor;
	}
}
