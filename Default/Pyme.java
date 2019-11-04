package Default;
import java.util.ArrayList;

import Condiciones.Condicion;
public abstract class Pyme {
	
	public abstract int getCantAnimales();
	public abstract String getRaza();
	public abstract double getEdad();
	public abstract double getPeso();
//	public abstract boolean sePuedeVender(Condicion c);
	public abstract ArrayList<Pyme> buscar(Condicion c);
	public double getPesoPromedio() {
		return this.getPeso()/ this.getCantAnimales();
	}
}
