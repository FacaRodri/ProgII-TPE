
public class main {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(1, "lechero", "m");
		Animal a2 = new Animal(2, "lechera", "f");
		Animal a3 = new Animal(3, "qsy", "m");
		GrupoAnimales nose = new GrupoAnimales();
		
		nose.agregar(a1);
		nose.agregar(a2);
		nose.agregar(a3);
		
		System.out.println(nose.getPeso());
		System.out.println(nose.getCantAnimales());
		System.out.println(nose.getPesoPromedio());
		
		

	}

}
