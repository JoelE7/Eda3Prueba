package eva03Clases;

public abstract class Deportista {

	protected Integer numeroDeSocio;
	protected String nombre;

	public Deportista(Integer numeroDeSocio, String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
