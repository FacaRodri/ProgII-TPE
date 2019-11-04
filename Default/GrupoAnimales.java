package Default;
import java.util.ArrayList;
import Condiciones.Condicion;
public class GrupoAnimales extends Pyme {
	
	private ArrayList<Pyme> animales;
	
	public GrupoAnimales() {
		this.animales = new ArrayList<>();
	}
	
	
	public ArrayList<Pyme> getAnimales() {
		return animales;
	}

	

	public void agregar(Pyme p) {
		animales.add(p);
	}

	public int getCantAnimales() {
		int suma = 0;
		for(int i = 0; i < animales.size(); i++) {
			suma =  suma + animales.get(i).getCantAnimales();
		}
		return suma;
	}
	
	public double getEdad() {
		double sumaEdad = 0;
		for (int i = 0; i < this.animales.size(); i++) {
			sumaEdad += animales.get(i).getEdad();
		}
		
		return sumaEdad/this.getCantAnimales();
	}
	
	public String getRaza() {
		String razas = "";
		for(int i = 0; i < animales.size(); i++) {
			razas = razas + " " + animales.get(i).getRaza();
		}
		
		return razas;
	}

	

	
	public double getPeso() {
		double sumaPeso = 0;
		for (int i = 0; i < this.animales.size(); i++) {
			sumaPeso += animales.get(i).getPeso();
		}
		return sumaPeso;
	}


//	public double getPesoPromedio() {
//		return this.getPeso()/ this.getCantAnimales();
//	}
	
	
	public boolean sePuedeVender(Condicion c) {
		return c.cumple(this);
	}
	

	public ArrayList<Pyme> buscar(Condicion c) {
		ArrayList<Pyme> aux = new ArrayList<>();
		for (int i = 0; (i < animales.size()); i++) {
			aux.addAll(animales.get(i).buscar(c));
			
		}
		
		return aux;
	}
	
	public void remove(Pyme p) {
		animales.remove(p);
	}
	

}
