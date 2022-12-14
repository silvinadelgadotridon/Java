package Composite;

import java.util.ArrayList;
import Composite.Filtros.Filtro;


public abstract class ProdAbstracto {
	protected String nombre;
	
	public ProdAbstracto(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre() {
		this.nombre = nombre;
	}
	
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract int contarProductos();
	public abstract ArrayList<String> getCategorias();
	public abstract ArrayList<ProdAbstracto> buscar(Filtro f);
	public abstract ProdAbstracto copia(Filtro f);
	public abstract Producto prodMenorPeso();
	
	
	public boolean tieneCategoria(String categoria) {
		return this.getCategorias().contains(categoria);
	}
	
}
