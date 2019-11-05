package Default;
import java.util.ArrayList;

import Condiciones.Condicion;

public class Camion {
	
	private int capacidad;
	private ArrayList<Animal> cargamento;
	private Condicion c;
	
	
	
	public Camion(int cap, Condicion c) {
		this.c = c;
		this.capacidad = cap;
		this.cargamento = new ArrayList<>();
	}
	
	public Condicion getCondicion() {
		return this.c;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public ArrayList<Animal> getCargamento(){
		return this.cargamento;
	}
	
	//Toma el arreglo devuelto por a.buscar(c) y lo guarda en un arreglo auxiliar
	//llena el cargamento segun la capacidad
	//limpia del grupo de animales los que ya estan cargados
	public ArrayList<Animal> completar(GrupoAnimales a){//SISTEMA
		ArrayList<Animal> aux = a.buscar(c);
		if (aux.size() >= capacidad) {
			for (int i = 0 ; i < aux.size() && i < capacidad;i++) {
				this.cargamento.add(aux.get(i));
			}
			this.limpiar(a);
			return cargamento;
			
		}else {
			return null;
		}
		
	}
	
	//recorre el cargamento y elimina del grupo de animales cada posicion del cargamento
	public void limpiar(GrupoAnimales a) {
		for (int i = 0; i < this.cargamento.size(); i++) {
			a.eliminar(this.cargamento.get(i));
		}
	}
	
	
	

}
