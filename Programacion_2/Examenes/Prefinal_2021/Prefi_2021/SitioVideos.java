package Prefi_2021;

import java.util.ArrayList;

import Prefi_2021.Filtros.Filtro;

public abstract class SitioVideos{
	protected String titulo;

	public SitioVideos(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public abstract ArrayList<Video> buscar(Filtro f);
	public abstract ArrayList<String> getPalabrasClave();
	public abstract int contarVideos();
	public abstract int duracion();
	
	/*como controlo si en el ArrayList de SitioVideos de la
	 * clase PlayList no agregue elementos repetidos,
	 * redefino el equals porque sino controla solo que no se 
	 * agreguen los mismos objetos, no su contenido
	 */
	
	@Override
	public boolean equals(Object o) {
		try {
			SitioVideos sv = (SitioVideos) o;
			return (this.getTitulo().equals(sv.getTitulo()));
		}
		catch(Exception e) {
			return false;
		}
	}
}
