package Prefi_2021;

import java.util.ArrayList;

import Prefi_2021.Filtros.Filtro;

public class Video extends SitioVideos implements Comparable<Video>{
	protected Usuario autor;
	private int duracion;
	private int cantVisualizaciones;
	private int cantMeGusta;
	private int cantNoMeGusta;
	private int anio;
	private ArrayList<String> palabrasClave;
	
	public Video(String titulo, int duracion, int cantVisualizaciones, int cantMeGusta,
			int cantNoMeGusta, int anio, Usuario autor) {
		super(titulo);
		this.duracion = duracion;
		this.cantVisualizaciones = cantVisualizaciones;
		this.cantMeGusta = cantMeGusta;
		this.cantNoMeGusta = cantNoMeGusta;
		this.anio = anio;
		this.palabrasClave = new ArrayList<>();
	}

	@Override
	public int duracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantVisualizaciones() {
		return cantVisualizaciones;
	}

	public void setCantVisualizaciones(int cantVisualizaciones) {
		this.cantVisualizaciones = cantVisualizaciones;
	}

	public int getCantMeGusta() {
		return cantMeGusta;
	}

	public void setCantMeGusta(int cantMeGusta) {
		this.cantMeGusta = cantMeGusta;
	}

	public int getCantNoMeGusta() {
		return cantNoMeGusta;
	}

	public void setCantNoMeGusta(int cantNoMeGusta) {
		this.cantNoMeGusta = cantNoMeGusta;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void addpalabraClave(String cat) {
		if(!palabrasClave.contains(cat)) {
			palabrasClave.add(cat);
		}
	}
	
	public boolean tienePalabraClave(String p){
		return palabrasClave.contains(p);
	}
	
	@Override
	public ArrayList<String> getPalabrasClave(){
		return new ArrayList<String>(palabrasClave);
	}

	public Usuario getAutor() {
		return autor;
	}


	public void setAutor(Usuario autor) {
		this.autor = autor;
	}


	@Override
	public ArrayList<Video> buscar(Filtro f) {
		ArrayList<Video> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}


	@Override
	public int compareTo(Video o) {
		 return this.getAutor().compareTo(o.getAutor());
		}


	@Override
	public int contarVideos() {
		return 1;
	}

	@Override
	public String toString() {
		return "Video [autor=" + autor + ", duracion=" + duracion + ", cantVisualizaciones=" + cantVisualizaciones
				+ ", cantMeGusta=" + cantMeGusta + ", cantNoMeGusta=" + cantNoMeGusta + ", anio=" + anio
				+ ", palabrasClave=" + palabrasClave + "]";
	}

	
	
}
