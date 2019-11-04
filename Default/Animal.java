package Default;
import java.util.ArrayList;

import Condiciones.Condicion;

public class Animal extends Pyme {
	
	//Attributes
	private  static int id=0;
	private int edad;
	private double peso;
	private String raza;
	private String sexo;
	private Boolean capado;
	private int ternerosParidos;
	
	//Constructor
	public Animal(int id, int edad, double peso, String raza, String sexo) {
		this.id = this.id++;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		  
	}

	
	public int getCantAnimales() {
		return 1;
	}
	
	public String getRaza() {
		return this.raza;
	}


	public double getEdad() {
		return this.edad;
	}


	public double getPeso() {
		return this.peso;
	}
	
//	public double getPesoPromedio() {
//		return this.peso;
//	}
	
//	public boolean sePuedeVender(Condicion c) {
//		return c.cumple(this);
//	}
//	
	public ArrayList<Pyme> buscar(Condicion c) {
		ArrayList<Pyme> aux = new ArrayList<>();
		if (c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	


}
