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
		
		Animal a1 = new Animal(1, 10, 500, "aberdeen angus", "m");
		Animal a2 = new Animal(2, 10, 200, "lechero", "f");
		Animal a3 = new Animal(3, 10, 300, "qsy", "m");
		Animal a4 = new Animal(1, 10, 500, "asdasd", "f");
		Animal a5 = new Animal(1, 10, 500, "lechero", "m");
		Animal a6 = new Animal(1, 10, 500, "droga", "f");
		GrupoAnimales GrupoCompuesto = new GrupoAnimales();
		GrupoAnimales Grupo2 = new GrupoAnimales();
		Condicion c1 = new CondicionPorPromedioPeso(400);
		Condicion c2 = new CondicionPorPromedioEdad(9);
		Condicion c3 = new CondicionOr(c1, c2);
		Condicion c4 = new CondicionAnd(c1, c2);
		Condicion c5 = new CondicionPorRaza("lechero");
		Camion camion = new Camion(2, c5);
		
		GrupoCompuesto.agregar(a1);
		GrupoCompuesto.agregar(a2);
		GrupoCompuesto.agregar(a3);
		
		Grupo2.agregar(a4);
		Grupo2.agregar(a5);
		Grupo2.agregar(a6);
		
		GrupoCompuesto.agregar(Grupo2);
	
		
		
		
		
		System.out.println("Animales: "+GrupoCompuesto.getAnimales());
		System.out.println("Raza: "+GrupoCompuesto.getRaza());
		System.out.println("Peso total: "+GrupoCompuesto.getPeso());
		System.out.println("Cantidad animales: "+GrupoCompuesto.getCantAnimales());
		System.out.println("Peso prom: "+GrupoCompuesto.getPesoPromedio());
		System.out.println("Vender:");
		System.out.println("Peso: "+GrupoCompuesto.sePuedeVender(c1));
		System.out.println("Edad: "+GrupoCompuesto.sePuedeVender(c2));
		System.out.println("Edad o peso: "+GrupoCompuesto.sePuedeVender(c3));
		System.out.println("Edad y pso: "+GrupoCompuesto.sePuedeVender(c4));
		
//		System.out.println("     ");
//		System.out.println("----------CAMION---------");		
//		System.out.println("Camion"+GrupoCompuesto.buscar(c5));
//		camion.completar(GrupoCompuesto);
//		System.out.println("     ");
//		System.out.println("------------------------------------------------------------------------");
//		
		
		System.out.println(Grupo2.getAnimales());
		System.out.println(Grupo2.getRaza());
		System.out.println(Grupo2.getPeso());
		System.out.println(Grupo2.getCantAnimales());
		System.out.println(Grupo2.getPesoPromedio());
		System.out.println(Grupo2.sePuedeVender(c1));
		System.out.println(Grupo2.sePuedeVender(c2));
		System.out.println(Grupo2.sePuedeVender(c3));
		System.out.println(Grupo2.sePuedeVender(c4));
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println(camion.getCargamento());
		System.out.println(camion.getRazasDelCargamento());
//		System.out.println(GrupoCompuesto.getAnimales());
//		System.out.println(GrupoCompuesto.getRaza());
		
		
		

	}
	
	

}
