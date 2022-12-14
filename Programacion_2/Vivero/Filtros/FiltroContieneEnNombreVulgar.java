package Vivero.Filtros;

import Vivero.Planta;

public class FiltroContieneEnNombreVulgar extends Filtro{
	public String stringBuscada;
	
	public FiltroContieneEnNombreVulgar(String stringBuscada) {
		this.stringBuscada = stringBuscada;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return p.esNombreVulgar(stringBuscada);
	}

}
