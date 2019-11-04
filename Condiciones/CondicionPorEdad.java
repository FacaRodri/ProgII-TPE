package Condiciones;
import Default.Pyme;
public class CondicionPorEdad extends Condicion{
	private double meses;
	
	public CondicionPorEdad(double m) {
		this.meses = m;
	}

	public boolean cumple(Pyme p) {
		return p.getEdad() >= this.meses;
	}
}
