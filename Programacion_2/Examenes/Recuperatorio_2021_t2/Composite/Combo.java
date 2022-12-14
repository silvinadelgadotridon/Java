package Composite;
import java.util.ArrayList;

import Composite.Filtros.Filtro;

public class Combo extends ProdAbstracto{
	
	private double porcentajeDto;
	private double porcentajeTopeDto;
	protected ArrayList<ProdAbstracto> elementos;
	private Filtro filtro; //solo tengo condicion en combo
	public static final int CIEN = 100;
	
	public Combo(String nombre, double porcentajeDto, 
			double porcentajeTopeDto, Filtro filtro) {
		super(nombre);
		this.porcentajeDto = porcentajeDto;
		this.porcentajeTopeDto =porcentajeTopeDto;
		this.filtro = filtro;
		this.elementos = new ArrayList <>();
	}
	
	
	public double getPorcentajeDto() {
		return porcentajeDto;
	}


	public void setPorcentajeDto(double porcentajeDto) {
		this.porcentajeDto = porcentajeDto;
	}


	public double getPorcentajeTopeDto() {
		return porcentajeTopeDto;
	}


	public void setPorcentajeTopeDto(double porcentajeTopeDto) {
		this.porcentajeTopeDto = porcentajeTopeDto;
	}



	public void addElemento(ProdAbstracto pa) {
		if (filtro.cumple(pa)) {
			elementos.add(pa);
		}
	}
	
	protected double getPrecioSinDesc() {
		double precioTot = 0.0;
		for(ProdAbstracto p: elementos) {
			precioTot += p.getPrecio();
		}
		return precioTot;
	}
	
	@Override
	public double getPrecio() {
		double precioTot = this.getPrecioSinDesc();
		double descuento = (porcentajeDto/CIEN)*this.contarProductos(); 
		
		if(descuento > this.porcentajeTopeDto) {
			descuento = this.porcentajeTopeDto;
		}
		return precioTot-descuento*precioTot;
				
	}
	
	
	@Override
	public double getPeso() {
		int contador =0;
		for(ProdAbstracto p: elementos) {
			contador += p.getPeso();
		}
		return contador;
	}

	@Override
	public int contarProductos() {
		int contador =0;
		for(ProdAbstracto p: elementos) {
			contador += p.contarProductos();
		}
		return contador;
	}

	@Override
	public ArrayList<String> getCategorias() {
		//si no tengo ningun elemento, retorno una lista vacia
		ArrayList<String> copia = new ArrayList<>();
		for(ProdAbstracto p: elementos) {
			//sino, a c/elemento le pido mi lista de categorias
			ArrayList<String> catElem = p.getCategorias();
			//y si es un compuesto se calcula de esta forma
			for(String cat: catElem) {
				if(!catElem.contains(cat)) {
					copia.add(cat);
				}
			}
		}
		return copia;
	}

	@Override
	public ArrayList<ProdAbstracto> buscar(Filtro f) {
		ArrayList<ProdAbstracto> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this);
		}else {
			for(ProdAbstracto p:elementos) {
				resultado.addAll(p.buscar(f));
			}
		}
		return resultado;
	}

	@Override
	public ProdAbstracto copia(Filtro f) {
		if(f.cumple(this)) {
			ArrayList<ProdAbstracto> hijosQueCumplen = new ArrayList<>();
			for(ProdAbstracto p: elementos) {
				ProdAbstracto copiado = p.copia(f);
					if(copiado!=null) {
						hijosQueCumplen.add(copiado);
				}
			}
			if (hijosQueCumplen.isEmpty()) {
				return null;
			}else {
				Combo copiaCombo = new Combo(this.getNombre(), porcentajeDto, 
						porcentajeTopeDto, filtro);
				for(ProdAbstracto p: hijosQueCumplen) {
					copiaCombo.addElemento(p);
				}
				return copiaCombo;
			}
		}
		return null;
	}
	
	
	@Override
	public Producto prodMenorPeso() {
		double menorPeso = Double.MAX_VALUE;
		Producto productoMenorPeso = null;
		for(ProdAbstracto p:elementos) {
			Producto aux = p.prodMenorPeso();
			double temp = aux.getPeso();
			if(productoMenorPeso == null || temp<menorPeso) {
				productoMenorPeso = aux;
				menorPeso = temp;
			}
		}
		return productoMenorPeso;
	}
	
}
