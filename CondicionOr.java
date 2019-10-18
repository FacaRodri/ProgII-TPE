
public class CondicionOr extends Condicion {
	
	Condicion c1;
	Condicion c2;
	
	public CondicionOr(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(Pyme p1) {
		return c1.cumple(p1) || c2.cumple(p1);
	}

	

}
