package Vivero.Filtros;

import Vivero.Planta;

public class FiltroContieneEnClasificacion extends Filtro{
	public String clasifBuscada;
	
	public FiltroContieneEnClasificacion(String clasifBuscada) {
		this.clasifBuscada = clasifBuscada;
	}
	
	
	@Override
	public boolean cumple(Planta p) {
		return p.getClasificacionSup().contains(this.clasifBuscada);
	}
}
