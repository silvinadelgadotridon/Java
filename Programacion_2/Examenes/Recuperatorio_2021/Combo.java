import java.util.ArrayList;

public class Combo extends Bazar {
	protected ArrayList<Bazar> elementos;
	private double descuentoProducto;
	private double topeDescuento;
	public static final int CIEN = 100;
	
	
	public Combo(String nombre, double descuentoProducto, double topeDescuento) {
		super(nombre);
		this.descuentoProducto = descuentoProducto;
		this.topeDescuento = topeDescuento;
		this.elementos = new ArrayList<>();
	}
	
	
	public void addElemento(Bazar e) {
			elementos.add(e);
	}
	
	
	
	public double getDescuentoProducto() {
		return descuentoProducto;
	}


	public void setDescuentoProducto(double descuento) {
		this.descuentoProducto = descuento;
	}


	public double getTopeDescuento() {
		return topeDescuento;
	}


	public void setTopeDescuento(double topeDescuento) {
		this.topeDescuento = topeDescuento;
	}


	@Override
	public double getPrecio() {
		double precioT = 0;
		double descuento = 0;
		for(Bazar b:elementos) {
			descuento += this.descuentoProducto* b.contarProducto();
			precioT += b.getPrecio();
		}
		if(descuento >this.topeDescuento) {
			descuento = this.topeDescuento;
		}
		
		return precioT - precioT* descuento/CIEN;
	}

	
	
	@Override
	public double getPeso() {
		double suma = 0;
		for(Bazar b: elementos) {
			suma += b.getPeso();
		}
		return suma;
	}


	@Override
	public double contarProducto() {
		int suma = 0;
		for(Bazar b: elementos) {
			suma+= b.contarProducto();
		}
		return suma;
	}


	@Override
	public ArrayList<String> getCategoria() {
		ArrayList<String> cat = new ArrayList<String>();
		for(Bazar b:elementos) {
			ArrayList<String> categoria = b.getCategoria();
			for(String s: categoria) {
				if(!cat.contains(s)) {
					cat.add(s);
				}
			}
		}
		return cat;
	}
	
	
	@Override
	public boolean equals(Object o) {
		try {
			Producto p = (Producto) o;
			return (p.getCategoria().equals(o));
		}
		catch(Exception e){
			return false;
		}
	}
	
	@Override
	public ArrayList<Bazar> buscar(Filtro f) {
		ArrayList<Bazar> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this);
		}else {
			for(Bazar b: elementos) {
				resultado.addAll(b.buscar(f));
			}
		}
		return resultado;
	}


	@Override
	public Bazar copiaRestringida(Filtro f) {
		ArrayList<Bazar> hijos = new ArrayList<>();
		if(f.cumple(this)) {
			hijos.add(this);
			for(Bazar b: hijos) {
				Combo copia = new Combo(this.getNombre(), 
						this.getDescuentoProducto(), this.getTopeDescuento());
				for(Bazar s: elementos) {
					copia.addElemento(s.copiaRestringida(f));
				}
				return copia;
			}	
		}	
		return null;	
	}


	@Override
	public String toString() {
		return "Combo [elementos=" + elementos + ", descuentoProducto=" + descuentoProducto + ", topeDescuento="
				+ topeDescuento + "]";
	}
	
	
}
