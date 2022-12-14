import java.util.ArrayList;

public abstract class Bazar {
	private String nombre;
	
	public Bazar(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract double contarProducto();
	public abstract ArrayList<String> getCategoria();
	public abstract ArrayList<Bazar> buscar(Filtro f);
	public abstract Bazar copiaRestringida(Filtro f);
	
	public boolean tieneCategoria(String s) {
		return this.getCategoria().contains(s);
	}
}
