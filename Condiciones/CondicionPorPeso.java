package Condiciones;
import Default.Pyme;

public class CondicionPorPeso extends Condicion {
	
	private double peso;
	
	public CondicionPorPeso(double p) {
		this.peso = p;
	}
	
	public boolean cumple(Pyme p) {
		return p.getPeso() > this.peso;
	}
		
}
