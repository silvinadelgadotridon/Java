package Vivero.Filtros;

import Vivero.Planta;

public class FiltroTipo extends Filtro{
	  private String tipoBuscado;

	  public FiltroTipo(String tipoBuscado){
	    this.tipoBuscado = tipoBuscado;
	  }

	  @Override
	  public boolean cumple(Planta p) {
	    return p.getTipo().equalsIgnoreCase(this.tipoBuscado);
	  }

}
