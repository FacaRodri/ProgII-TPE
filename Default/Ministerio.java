package Default;
import java.util.ArrayList;
import Condiciones.Categoria;


public class Ministerio {
	
	private ArrayList<Categoria> categorias = new ArrayList<>();
	
	public void addCategoria(Categoria c) {
		categorias.add(c);
	}
	
	private ArrayList<Categoria> categorizar(Animal a){
		ArrayList<Categoria> aux = new ArrayList<>();
		
		for (int i = 0; i < categorias.size(); i++) {
			if(categorias.get(i).pertenece(a)) {
				aux.add(categorias.get(i));
			}
		}
		
		return aux;
	}
	
	
	public void getCategorias(Animal a) {
		ArrayList<Categoria> aux = this.categorizar(a);
		int idAnimal = a.getId();
		for (int i = 0; i < aux.size(); i++) {
			System.out.println(idAnimal + " " + aux.get(i).toString());
		}
	}
	
	

}
