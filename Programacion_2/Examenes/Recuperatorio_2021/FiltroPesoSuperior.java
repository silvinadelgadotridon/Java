
public class FiltroPesoSuperior extends Filtro{
	private double pesoMinimo;

	@Override
	public boolean cumple(Bazar b) {
		return b.getPeso()>pesoMinimo;
	}
		
}
