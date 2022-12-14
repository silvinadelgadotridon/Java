
public class FiltroNot extends Filtro {
	private Filtro fNot;
	
	
	public FiltroNot(Filtro fNot) {
		this.fNot = fNot;
	}


	@Override
	public boolean cumple(Bazar b) {
		return !fNot.cumple(b);
	}

}


