package eva03Clases;

import Interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombre,Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.cantidadDeKilometrosEntrenados=0;
		
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

}
