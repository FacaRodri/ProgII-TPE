package Condiciones;
import Default.Animal;

public class Categoria {
	
	Condicion criterio;
	String nombreCategoria;
	
	public Categoria(String n, Condicion c) {
		this.nombreCategoria = n;
		this.criterio = c;
	}
	
	public boolean pertenece(Animal a) {
		return criterio.cumple(a);
	}
	
	@Override
	public String toString() {
	     return "Pertenece a la Categoria: " + nombreCategoria;
	}

}
