package Default;
import java.util.ArrayList;

import Condiciones.Condicion;
import Condiciones.CondicionAnd;
import Condiciones.CondicionOr;
import Condiciones.CondicionPorPromedioEdad;
import Condiciones.CondicionPorPromedioPeso;
import Condiciones.CondicionPorRaza;

public class main {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(1, 10, 590, "aberdeen angus", "m");
		Animal a2 = new Animal(2, 10, 243, "lechero", "f");
		Animal a3 = new Animal(3, 10, 123, "qsy", "m");
		Animal a4 = new Animal(1, 10, 239, "asdasd", "f");
		Animal a5 = new Animal(1, 10, 450, "lechero", "m");
		Animal a6 = new Animal(1, 10, 500, "droga", "f");
		GrupoAnimales nose = new GrupoAnimales();
		GrupoAnimales nose2 = new GrupoAnimales();
		Condicion c1 = new CondicionPorPromedioPeso(358);
		Condicion c2 = new CondicionPorPromedioEdad(9);
		Condicion c3 = new CondicionOr(c1, c2);
		Condicion c4 = new CondicionAnd(c1, c2);
		Condicion c5 = new CondicionPorRaza("lechero");
		Camion camion = new Camion(2, c5);
		
		nose.agregar(a1);
		nose.agregar(a2);
		nose.agregar(a3);
		nose2.agregar(a4);
		nose2.agregar(a5);
		nose2.agregar(a6);
		nose.agregar(nose2);
	
		
		
		
		nose.cargarAnimal(camion);
		
		
		System.out.println(nose.getAnimales());
		System.out.println(nose.getRaza());
		System.out.println(nose.getPeso());
		System.out.println(nose.getCantAnimales());
		System.out.println(nose.getPesoPromedio());
		System.out.println(nose.sePuedeVender(c1));
		System.out.println(nose.sePuedeVender(c2));
		System.out.println(nose.sePuedeVender(c3));
		System.out.println(nose.sePuedeVender(c4));
		
		
		
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println(nose2.getAnimales());
		System.out.println(nose2.getRaza());
		System.out.println(nose2.getPeso());
		System.out.println(nose2.getCantAnimales());
		System.out.println(nose2.getPesoPromedio());
		System.out.println(nose2.sePuedeVender(c1));
		System.out.println(nose2.sePuedeVender(c2));
		System.out.println(nose2.sePuedeVender(c3));
		System.out.println(nose2.sePuedeVender(c4));
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println(camion.getCargamento());
		System.out.println(camion.getRazasDelCargamento());
		
		
	
//		
//		ArrayList<Pyme> aux = new ArrayList<>();
//		aux = nose2.sePuedeCargar(camion);
//		for (int i = 0; i <aux.size(); i++) {
//			System.out.println(aux.get(i).getRaza());
//		}
//		
		
		
		

	}

}
