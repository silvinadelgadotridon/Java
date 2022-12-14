import java.util.ArrayList;

public class Producto extends Bazar {
	private double precio;
	private double peso;
	private ArrayList<String> categorias;
	
	public Producto(String nombre, double precio, double peso) {
		super(nombre);
		this.precio = precio;
		this.peso = peso;
		this.categorias = new ArrayList<>();
	}
	
	
	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public double contarProducto() {
		return 1;
	}


	@Override
	public ArrayList<String> getCategoria() {
		return new ArrayList<String>(categorias);
	}
	
	public void addCategoria(String c) {
		if(!categorias.contains(c)) {
			categorias.add(c);
		}
	}


	@Override
	public ArrayList<Bazar> buscar(Filtro f) {
		ArrayList<Bazar> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}


	@Override
	public Bazar copiaRestringida(Filtro f) {
		if(f.cumple(this)) {
			Producto copia = new Producto(this.getNombre(), this.getPrecio(), this.getPeso());
			for(String s: categorias) {
				copia.addCategoria(s);
			}
			return copia;
		}
		return null;	
	}


	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", peso=" + peso + ", categorias=" + categorias + "]";
	}

	
}
