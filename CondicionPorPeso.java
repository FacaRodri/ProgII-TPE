
public class CondicionPorPeso extends Condicion {

	public int topePeso;
	
	public CondicionPorPeso(int p) {
		this.topePeso = p;
	}
	
	public boolean cumple(Pyme p) {
		return p.getPesoPromedio() > topePeso;
	}

}
