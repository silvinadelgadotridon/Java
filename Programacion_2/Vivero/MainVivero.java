package Vivero;

import Vivero.Filtros.FiltroAnd;
import Vivero.Filtros.FiltroContieneEnClasificacion;
import Vivero.Filtros.FiltroContieneEnNombreCientifico;
import Vivero.Filtros.FiltroContieneEnNombreVulgar;
import Vivero.Filtros.FiltroNivelRiegoMaximo;
import Vivero.Filtros.FiltroNivelRiegoMinimo;
import Vivero.Filtros.FiltroNivelSolMaximo;
import Vivero.Filtros.FiltroNivelSolMinimo;
import Vivero.Filtros.FiltroTipo;

public class MainVivero {
	public static void main(String[] args) {
		Planta p1 = new Planta("Fraxinus Pennsylvanica MARSHAL", "Oleeae", 
					"Oleaceae","Magnoliopsida", "exterior",2, 7);
		p1.addNombresVulgares("fresno americano");
		p1.addNombresVulgares("fresno verde");
		
		
		Planta p2 = new Planta("Epipremnum aureum (Linden & André) G.S.Bunting", "Epipremnum", 
				"Araceae","Monocotyledoneae", "interior",3, 4);
		p2.addNombresVulgares("potus");
		p2.addNombresVulgares("potos");
		p2.addNombresVulgares("pothos");
		
		
		Planta p3 = new Planta(" Dracaena trifasciata; Prain ", "Dracaena", 
				"Asparagaceae"," Asparagaceae", "interior",2, 4);
		p3.addNombresVulgares("lengua de suegra");
		p3.addNombresVulgares("Espada de San Jorge");
		p3.addNombresVulgares("Cola de serpiente");
		
		
		Vivero vivero = new Vivero();	
		vivero.addPlantas(p1);
		vivero.addPlantas(p2);
		vivero.addPlantas(p3);
		/*
		//Todas las plantas
		System.out.println(vivero.getPlantas());
		
		//Plantas cuyo nombre científico incluya la palabra “auereum”
		System.out.println(vivero.plantasFiltradas(new FiltroContieneEnNombreCientifico("auereum")));
		
		//Plantas a las que se conozca vulgarmente como “lengua de suegra”
		System.out.println(vivero.plantasFiltradas(new FiltroContieneEnNombreVulgar("lengua de suegra")));
		
		//Todas las plantas cuya clasificación sea “Crassula”
		System.out.println(vivero.plantasFiltradas(new FiltroContieneEnClasificacion("Crassula")));
		*/
		//Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
		System.out.println(vivero.plantasFiltradas(new FiltroAnd(new FiltroNivelSolMinimo(5), new FiltroNivelRiegoMaximo(3))));
		
		//s las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
		System.out.println(vivero.plantasFiltradas(new FiltroAnd(new FiltroNivelSolMaximo(4), new FiltroNivelRiegoMinimo(4))));
		
		// Todas las plantas de interior que necesiten poco riego (inferior a 3)
		System.out.println(vivero.plantasFiltradas(new FiltroAnd(new FiltroTipo("interior"), new FiltroNivelRiegoMaximo(3))));
				
		
	}
}
