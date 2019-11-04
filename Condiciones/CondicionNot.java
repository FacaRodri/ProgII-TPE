package Condiciones;
import Default.Pyme;

public class CondicionNot {
	private Condicion c;
	
	public CondicionNot(Condicion c) {
		this.c=c;
	}
	
	public boolean cumple(Pyme p) {
		return (!(this.c.cumple(p)));
	}

}
