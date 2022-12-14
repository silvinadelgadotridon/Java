
public class FiltroPrecioMenor extends Filtro{
	private double precioMenor;
	
	
	public FiltroPrecioMenor(double precioMenor) {
		this.precioMenor = precioMenor;
	}


	@Override
	public boolean cumple(Bazar b) {
		return (b.getPrecio()<precioMenor);
	}
	
}
