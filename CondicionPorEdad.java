
public class CondicionPorEdad extends Condicion {
	
	public int topeEdad = 0;
	
	public CondicionPorEdad(int e) {
		this.topeEdad = e;
	}
	
	public boolean cumple(Pyme p) {
		return p.getEdad() > topeEdad;
	}
	
	

}
