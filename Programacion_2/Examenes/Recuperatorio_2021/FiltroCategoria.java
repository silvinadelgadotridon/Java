
public class FiltroCategoria extends Filtro{
	private String categoriaBuscada;
	
	
	public FiltroCategoria(String categoriaBuscada) {
		this.categoriaBuscada = categoriaBuscada;
	}


	@Override
	public boolean cumple(Bazar b) {
		return b.tieneCategoria(categoriaBuscada);
	}

}
