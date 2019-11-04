package Default;
import java.util.ArrayList;
import Condiciones.Categoria;


public class Ministerio {
	
	private ArrayList<Categoria> categorias = new ArrayList<>();
	
	public ArrayList<Categoria> categorizar(Animal a){
		ArrayList<Categoria> aux = new ArrayList<>();
		
		for (int i = 0; i < categorias.size(); i++) {
			if(categorias.get(i).pertenece(a)) {
				aux.add(categorias.get(i));
			}
		}
		
		return aux;
	}

}
