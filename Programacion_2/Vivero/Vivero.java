package Vivero;

import java.util.ArrayList;

import Vivero.Filtros.Filtro;

public class Vivero {
	private ArrayList<Planta> plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	
	public void addPlantas(Planta p) {
		plantas.add(p);
	}
	
	
	public ArrayList<Planta> getPlantas() {
		ArrayList<Planta> copia = new ArrayList<>();
		for(Planta p:plantas) {
			copia.add(p);
		}
		return copia;
	}	
	
	
	public ArrayList<Planta> plantasFiltradas(Filtro filtroAnd){
		ArrayList<Planta> resultados = new ArrayList<>();
		for(int p=0; p<plantas.size(); p++) {
			Planta plant = this.plantas.get(p);
			if(filtroAnd.cumple(plant)) {
				resultados.add(plant);
			}
		}
		return resultados;
	}
}
