package Default;
import java.util.ArrayList;
import Condiciones.Condicion;
public class GrupoAnimales extends Pyme {
	
	private ArrayList<Pyme> animales;
	
	public GrupoAnimales() {
		this.animales = new ArrayList<>();
	}
	
	//----------Getters-------//
	public ArrayList<Pyme> getAnimales() {
		return animales;
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

	
	public void agregar(Pyme p) {
		animales.add(p);
	}
	
	public boolean sePuedeVender(Condicion c) {
		return c.cumple(this);
	}
	
	
	//busca por toda la estructura y devuelve un array list con todos los animales
	//que cumplen la condicion
	public ArrayList<Animal> buscar(Condicion c) {
		ArrayList<Animal> aux = new ArrayList<>();
		for (int i = 0; (i < animales.size()); i++) {
			aux.addAll(animales.get(i).buscar(c));
			
		}
		return aux;
	}
	
	//pregunta si contiene ese animal y lo elimina
	//o lo busca en la estructura
	public void eliminar(Animal a) {
		if(this.animales.contains(a)) {
			this.animales.remove(a);
		}else {
			for (int i = 0; i < animales.size(); i++) {
				this.animales.get(i).eliminar(a);
			}
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animales == null) ? 0 : animales.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoAnimales other = (GrupoAnimales) obj;
		if (animales == null) {
			if (other.animales != null)
				return false;
		} else if (!animales.equals(other.animales))
			return false;
		return true;
	}
	
	
	

}
