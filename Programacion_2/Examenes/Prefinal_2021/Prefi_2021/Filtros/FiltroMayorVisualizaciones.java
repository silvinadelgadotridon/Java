package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroMayorVisualizaciones extends Filtro {
	private int cantMinima;
	
	
	public FiltroMayorVisualizaciones(int cantMinima) {
		this.cantMinima = cantMinima;
	}


	@Override
	public boolean cumple(Video v) {
		return (v.getCantVisualizaciones()>this.cantMinima);
	}

}
