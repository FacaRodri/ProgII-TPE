import java.util.ArrayList;

public class GrupoAnimales extends Pyme {
	
	private ArrayList<Pyme> animales;
	
	public GrupoAnimales() {
		this.animales = new ArrayList<>();
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

	
	//suma todas las edades y las divide por el total retornando el promedio
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
		double sumaPromedios = 0;
		for(int i = 0; i < animales.size(); i++ ) {
			sumaPromedios += animales.get(i).getPesoPromedio();
		}
		
		return sumaPromedios / this.getCantAnimales();
	}
	

}
