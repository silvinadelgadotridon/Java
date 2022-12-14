package Prefi_2021;

import java.util.ArrayList;
import java.util.Collections;

import Prefi_2021.Filtros.Filtro;

public class PlayList extends SitioVideos {
	private ArrayList<SitioVideos> elementos;
	private int demora;

	public PlayList(String titulo, int demora) {
		super(titulo);
		this.demora = demora;
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(SitioVideos e) {
		if(!elementos.contains(e)) {
			elementos.add(e);
		}
	}
	
	public int getDemora() {
		return demora;
	}

	public void setDemora(int demora) {
		this.demora = demora;
	}

	public ArrayList<SitioVideos> getElementos(){
		return new ArrayList<>(elementos);
	}

	@Override
	public ArrayList<Video> buscar(Filtro f) {
		ArrayList<Video> resultado = new ArrayList<>();
			for(SitioVideos s: elementos) {
				resultado.addAll(s.buscar(f));
			}
			Collections.sort(resultado);
			return resultado;
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for(SitioVideos s: elementos) {
			ArrayList<String> resultadoAux = s.getPalabrasClave();
			for(String st: resultadoAux)
				if(!resultado.contains(st)) {
					resultado.add(st);
			}
		}
		return resultado;
	}

	@Override
	public int contarVideos() {
		int cont = 0;
		for(SitioVideos s: elementos) {
			cont += s.contarVideos();
		}
		return cont;
	}

	@Override
	public int duracion() {
		int duracTotal = 0;
		for(SitioVideos s:elementos) {
			duracTotal+= s.duracion();
		}
		return duracTotal+this.demora;
	}

	@Override
	public String toString() {
		return "PlayList [elementos=" + elementos + ", demora=" + demora + "]";
	}
	
	
}
