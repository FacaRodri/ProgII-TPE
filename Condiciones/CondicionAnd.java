package Condiciones;
import Default.Pyme;

public class CondicionAnd extends Condicion{
	
	Condicion c1;
	Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(Pyme p) {
		return c1.cumple(p) && c2.cumple(p);
	}

}
