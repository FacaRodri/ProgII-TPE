
public class main {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(1, 10, 10, "lechero", "m");
		Animal a2 = new Animal(2, 10, 10, "lechera", "f");
		Animal a3 = new Animal(3, 10, 10, "qsy", "m");
		GrupoAnimales nose = new GrupoAnimales();
		Condicion c1 = new CondicionPorPeso(9);
		Condicion c2 = new CondicionPorEdad(9);
		Condicion c3 = new CondicionOr(c1, c2);
		Condicion c4 = new CondicionAnd(c1, c2);
		
		nose.agregar(a1);
		nose.agregar(a2);
		nose.agregar(a3);
		
		
		
		System.out.println(nose.getPeso());
		System.out.println(nose.getCantAnimales());
		System.out.println(nose.getPesoPromedio());
		System.out.println(nose.sePuedeVender(c1));
		System.out.println(nose.sePuedeVender(c2));
		System.out.println(nose.sePuedeVender(c3));
		System.out.println(nose.sePuedeVender(c4));
		
		
		

	}

}
