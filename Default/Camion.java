package Default;
import java.util.ArrayList;

import Condiciones.Condicion;

public class Camion {
	
	private int capacidad;
	private ArrayList<Pyme> cargamento;
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
	
	public void addCargamento(ArrayList<Pyme> animales) {
		cargamento.addAll(animales);
		this.capacidad--;
	}
	
	public ArrayList<Pyme> getCargamento(){
		return this.cargamento;
	}
	
	public String getRazasDelCargamento() {
		String razas = " ";
		for(int i = 0; i < cargamento.size(); i++) {
			razas = razas + " " + cargamento.get(i).getRaza();
		}
		
		return razas;
	}
	
	
	
	
	
	

}
