package Vivero.Filtros;

import Vivero.Planta;

public class FiltroContieneEnNombreCientifico extends Filtro{
	public String stringBuscada;
	
	public FiltroContieneEnNombreCientifico(String stringBuscada) {
		this.stringBuscada = stringBuscada;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return p.getNombreCientifico().contains(stringBuscada);
	}
}
