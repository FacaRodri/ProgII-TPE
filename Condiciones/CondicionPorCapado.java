package Condiciones;
import Default.Animal;
import Default.Pyme;

public class CondicionPorCapado extends Condicion {
	
	private boolean capado;
	
	public CondicionPorCapado(boolean a) {
		this.capado = a;
	}
	
	public boolean cumple(Pyme p) {
		return ((Animal)p).getCapado() == this.capado;
	}

}
