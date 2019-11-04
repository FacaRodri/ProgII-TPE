package Condiciones;
import Default.Pyme;

public class CondicionPorPromedioPeso extends Condicion {

	public int topePeso;
	
	public CondicionPorPromedioPeso(int p) {
		this.topePeso = p;
	}
	
	public boolean cumple(Pyme p) {
		return p.getPesoPromedio() >= topePeso;
	}

}
