package Prefi_2021;

import java.util.ArrayList;
import java.util.Collections;

import Prefi_2021.Filtros.Filtro;

public class PlayListSponsoreada extends PlayList {
	private Video videoSponsoreado;
	
	public PlayListSponsoreada(String titulo, int demora, Video videoSponsoreado) {
		super(titulo, demora);
		this.videoSponsoreado =videoSponsoreado ;
	}

	public Video getVideoSponsoreado() {
		return videoSponsoreado;
	}

	public void setVideoSponsoreado(Video videoSponsoreado) {
		this.videoSponsoreado = videoSponsoreado;
	}
	
	@Override
	public ArrayList<Video> buscar(Filtro f) {
		ArrayList<Video> resultado = super.buscar(f);
		resultado.add(0,this.videoSponsoreado);
		return resultado;
	}

}
