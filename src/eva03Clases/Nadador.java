package eva03Clases;

import Interfaces.INadador;

public class Nadador extends Deportista implements INadador{

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
