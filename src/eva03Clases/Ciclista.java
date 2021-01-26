package eva03Clases;

import Enumeradores.TipoDeBicicleta;
import Interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private TipoDeBicicleta tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta bici) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = bici;

	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}
