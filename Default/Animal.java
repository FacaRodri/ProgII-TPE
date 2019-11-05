package Default;
import java.util.ArrayList;

import Condiciones.Condicion;

public class Animal extends Pyme {
	
	//Attributes
	private int id;
	private int edad;
	private double peso;
	private String raza;
	private String sexo;
	private Boolean capado;
	private int ternerosParidos;
	
	//Constructor
	public Animal(int id, int edad, double peso, String raza, String sexo) {
		this.id = id;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		  
	}
	
	//----------Getters + Setters-------//
	public int getId() {
		return id;
	}


	public String getSexo() {
		return sexo;
	}

	public Boolean getCapado() {
		return capado;
	}

	public void setCapado(Boolean capado) {
		this.capado = capado;
	}

	public int getTernerosParidos() {
		return ternerosParidos;
	}

	public void setTernerosParidos(int ternerosParidos) {
		this.ternerosParidos = ternerosParidos;
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
	
	
	//----------Metodos-------//
	
	//devuelve un animal dentro de un array list si cumple la condicion dada el camion
	public ArrayList<Animal> buscar(Condicion c) {
		ArrayList<Animal> aux = new ArrayList<>();
		if (c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	//este metodo es abstracto para que cuando el camion este lleno
	//no se rompa al eliminar en Binding dinamico (ver GrupoAnimales)
	public void eliminar(Animal a) {
		
	}


	
	//Redefinimos el equals 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capado == null) ? 0 : capado.hashCode());
		result = prime * result + edad;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((raza == null) ? 0 : raza.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ternerosParidos;
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
		Animal other = (Animal) obj;
		if (capado == null) {
			if (other.capado != null)
				return false;
		} else if (!capado.equals(other.capado))
			return false;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (raza == null) {
			if (other.raza != null)
				return false;
		} else if (!raza.equals(other.raza))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (ternerosParidos != other.ternerosParidos)
			return false;
		return true;
	}
	
	
	


}
