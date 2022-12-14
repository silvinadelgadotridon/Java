package Composite.Filtros;

import Composite.ProdAbstracto;

public class FiltroCategoria extends Filtro{
	private String categoriaDada;

	public FiltroCategoria(String categoriaDada) {
		this.categoriaDada = categoriaDada;
	}
	
	//le pregunto al elemento directamente si tiene una categoria
	//haciendo el método tieneCategoria. NO HAGO EL CONTAINS ACA
	//PORQUE ESTOY DELEGANDO MAL RESPONSABILIDADES
	@Override
	public boolean cumple(ProdAbstracto pa) {
		return (pa.tieneCategoria(this.categoriaDada));
	}
}
