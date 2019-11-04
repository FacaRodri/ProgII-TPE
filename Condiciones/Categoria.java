package Condiciones;
import Default.Animal;

public class Categoria {
	
	Condicion criterio;
	String nombreCategoria;
	
	public Categoria(Condicion c, String n) {
		this.criterio = c;
		this.nombreCategoria = n;
	}
	
	public boolean pertenece(Animal a) {
		return criterio.cumple(a);
	}
	
	public String getNombreCategoria() {
		return this.nombreCategoria;
	}

}
