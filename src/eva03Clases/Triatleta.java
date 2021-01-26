package eva03Clases;

import Enumeradores.TipoDeBicicleta;
import Interfaces.ICiclista;
import Interfaces.ICorredor;


public class Triatleta extends Deportista implements ICiclista,ICorredor {

	private TipoDeBicicleta tipoDeBicicleta;
	private String distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipoDeBicicleta;
		this.cantidadDeKilometrosEntrenados=0;

	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

}
