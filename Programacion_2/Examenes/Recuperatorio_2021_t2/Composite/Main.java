package Composite;

import Composite.Filtros.Filtro;
import Composite.Filtros.FiltroCategoria;
import Composite.Filtros.FiltroPesoSuperior;
import Composite.Filtros.FiltroNot;
import Composite.Filtros.FiltroPrecioInferior;

public class Main {


	public static void main(String[] args) {
		Filtro catAdorno = new FiltroCategoria("adorno");
		Filtro pesoSup = new FiltroPesoSuperior(400);
		Filtro mayorIgual = new FiltroNot(new FiltroPrecioInferior(300));
		
		
		Producto p1 = new Producto("Producto1", 25.5, 250);
		Producto p2 = new Producto("Producto2", 123, 100);
		Producto p3 = new Producto("Producto2", 13, 10);
		
		p1.copia(catAdorno);

		Combo c1 = new Combo("Combo1", 1.4, 50, catAdorno);
		c1.addElemento(p1);
		c1.addElemento(p3);
		
		Combo c2 = new Combo("Combo1", 1.4, 50, pesoSup);
		c2.addElemento(p2);
		c2.addElemento(c1);
		
		System.out.println(c2.getPrecio());

	}


}
