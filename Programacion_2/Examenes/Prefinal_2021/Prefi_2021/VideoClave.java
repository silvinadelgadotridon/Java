package Prefi_2021;

public class VideoClave extends Video {
	
	
	
	public VideoClave(String titulo, int duracion, int cantVisualizaciones, int cantMeGusta, int cantNoMeGusta,
			int anio, Usuario autor) {
		super(titulo, duracion, cantVisualizaciones, cantMeGusta, cantNoMeGusta, anio, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean tienePalabraClave(String s) {
		return true;
	}

}
