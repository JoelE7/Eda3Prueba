package eva03Clases;

import Enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista {

	private TipoDeBicicleta tipoDeBicicleta;
	private String distanciaPreferida;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipoDeBicicleta;

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

	
}
