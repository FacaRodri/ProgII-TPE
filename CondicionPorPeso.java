
public class CondicionPorPeso extends Condicion {

	public int topePeso = 0;
	
	public CondicionPorPeso(int p) {
		this.topePeso = p;
	}
	
	public boolean cumple(Pyme p) {
		return p.getPeso() > topePeso;
	}

}
