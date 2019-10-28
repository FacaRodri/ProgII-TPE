package Condiciones;
import Default.Pyme;

public class CondicionPorRaza extends Condicion {
	
	String raza;
	
	public CondicionPorRaza(String r) {
		this.raza = r;
	}
	
	public boolean cumple(Pyme p) {
		return this.raza == p.getRaza();
	}

}
