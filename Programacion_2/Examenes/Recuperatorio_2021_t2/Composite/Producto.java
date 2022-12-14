package Composite;
import java.util.ArrayList;
import Composite.Filtros.Filtro;

public class Producto extends ProdAbstracto{
	private double precio, peso;
	private ArrayList<String> categorias;
		
	
	public Producto(String nombre, double precio, double peso) {
		super(nombre);
		this.precio = precio;
		this.peso = peso;
		this.categorias = new  ArrayList<>();
	}
	
	public void addCategoria(String cat) {
		if(!categorias.contains(cat)) {
			categorias.add(cat); 
		}
		
	}
	
	@Override
	public ArrayList<String> getCategorias(){
		return new ArrayList<>(categorias);
	}
	
	
	@Override
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public int contarProductos() {
		return 1;
	}
	
	@Override
	public ArrayList<ProdAbstracto> buscar(Filtro f){
		ArrayList<ProdAbstracto> elementos= new ArrayList<>();
		if(f.cumple(this)) {
			elementos.add(this);
		}
		return elementos;
	}
	
	@Override
	public ProdAbstracto copia(Filtro f){
		//pregunto si mi ProductoAbstracto cumple con la condicion
		if(f.cumple(this)) {
			//genero una copia instanciando a Producto
			Producto copia = new Producto(this.getNombre(), this.precio, this.peso);
			//como categorias no se pasa como parámetro, recorro el ArrayList y las agrego en copia
			for(String c:categorias) {
				copia.addCategoria(c);
			}
			return copia; 	
		}
		return null;
	}
	
	
	@Override
	public Producto prodMenorPeso() {
		return this;
	}
	
}
