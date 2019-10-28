package Condiciones;
import Default.Pyme;

public class CondicionPorPromedioEdad extends Condicion {
	
	public int topeEdad = 0;
	
	public CondicionPorPromedioEdad(int e) {
		this.topeEdad = e;
	}
	
	public boolean cumple(Pyme p) {
		return p.getEdad() > topeEdad;
	}
	
	

}
