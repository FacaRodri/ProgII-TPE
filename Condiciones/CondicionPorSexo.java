package Condiciones;
import Default.Pyme;
import Default.Animal;

public class CondicionPorSexo extends Condicion {
	
	private String sexo;
	
	public CondicionPorSexo(String s) {
		this.sexo = s;
	}
	
	public boolean cumple(Pyme p) {
		return ((Animal)p).getSexo().equals( this.sexo);
	}
}
