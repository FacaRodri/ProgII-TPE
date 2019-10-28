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
	
	public String getRaza() {
		String razas = "";
		for(int i = 0; i < animales.size(); i++) {
			razas = razas + " " + animales.get(i).getRaza();
		}
		
		return razas;
	}

	
	public double getEdad() {
		double sumaEdad = 0;
		for (int i = 0; i < this.animales.size(); i++) {
			sumaEdad += animales.get(i).getEdad();
		}

		return sumaEdad/this.getCantAnimales();
	}

	
	public double getPeso() {
		double sumaPeso = 0;
		for (int i = 0; i < this.animales.size(); i++) {
			sumaPeso += animales.get(i).getPeso();
		}
		return sumaPeso;
	}


	public double getPesoPromedio() {
		return this.getPeso()/ this.getCantAnimales();
	}
	
	
	public boolean sePuedeVender(Condicion c) {
		for (int i = 0; i < animales.size(); i++) {
			if (!animales.get(i).sePuedeVender(c)) {
				return false;
			}
		}
		return true;
	}
	

	public ArrayList<Pyme> cargarAnimal(Camion c) {
		ArrayList<Pyme> aux = new ArrayList<>();
		int contador = 0;
		for (int i = 0; i <	animales.size(); i++) {
				if((animales.get(i).cargarAnimal(c) != null ) && (contador < c.getCapacidad())) {
					aux.addAll(animales.get(i).cargarAnimal(c));
					contador++;
					animales.remove(animales.get(i));
				}
		}
		c.addCargamento(aux);
		return c.getCargamento();
	}
	

}
