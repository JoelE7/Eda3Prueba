package eva03Clases;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre=nombre;
		socios = new TreeSet<Deportista>();
	}

	public Boolean agregarDeportista(Deportista deportista) {
		return socios.add(deportista);
		
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}
	
	
	
	
}
