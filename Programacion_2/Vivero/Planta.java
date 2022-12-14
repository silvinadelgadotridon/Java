package Vivero;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico, clasificacionSup, familia,
	clase, tipo;
	private ArrayList<String> nombresVulgares;
	private int requerimRiego, requerimSol;
	public static final int MINIMO = 1;
	public static final int MAXIMO =10;
	
	
	public Planta(String nombreCientifico, String clasificacionSup, String familia, String clase, String tipo,
			int requerimRiego, int requerimSol) {
		this.nombreCientifico = nombreCientifico;
		this.clasificacionSup = clasificacionSup;
		this.familia = familia;
		this.clase = clase;
		this.tipo = tipo;
		this.requerimRiego = requerimRiego;
		this.requerimSol = requerimSol;
		this.nombresVulgares = new ArrayList<>();
	}
	
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	
	public String getClasificacionSup() {
		return clasificacionSup;
	}
	public void setClasificacionSup(String clasificacionSup) {
		this.clasificacionSup = clasificacionSup;
	}
	
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getRequerimRiego() {
		return requerimRiego;
	}
	public void setRequerimRiego(int requerimRiego) {
		if((requerimRiego>=MINIMO) && (requerimRiego<=MAXIMO)) {
			this.requerimRiego = requerimRiego;
		}
	}
	
	public int getRequerimSol() {
		return requerimSol;
	}
	public void setRequerimSol(int requerimSol) {
		if((requerimSol>=MINIMO) && (requerimSol<=MAXIMO)) {
			this.requerimSol = requerimSol;
		}
	}
	
	public void addNombresVulgares(String nV) {
		if((nV!=null)&&(!nombresVulgares.contains(nV))){
			nombresVulgares.add(nV);
		}
	}
	
	public boolean esNombreVulgar(String nv) {
		for(int i=0; i<nombresVulgares.size();i++) {
			if(nombresVulgares.get(i).equalsIgnoreCase(nv)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	 public String toString() {
	    return "[ Nombre cientifico: " + getNombreCientifico() + ", clasificación superior: " + getClasificacionSup() + 
	    		", familia: " + getFamilia() + ", clase: " + getClase() + ", requerimiento de riego: " + getRequerimRiego() + 
	    		", Requerimiento de luz solar: " + getRequerimSol() + ", nombres vulgares: " + this.nombresVulgares + "] \n";
	  }
	
	
}
