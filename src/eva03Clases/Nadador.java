package eva03Clases;

public class Nadador extends Deportista{

	private String estiloPreferido;
	
	public Nadador(Integer numeroDeSocio, String nombre,String estiloPreferido) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido=estiloPreferido;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	
	

}
