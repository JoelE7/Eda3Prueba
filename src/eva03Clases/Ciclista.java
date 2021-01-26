package eva03Clases;

import Enumeradores.TipoDeBicicleta;

public class Ciclista extends Deportista{

	private TipoDeBicicleta tipoDeBicicleta;
	
	public Ciclista(Integer numeroDeSocio, String nombre,TipoDeBicicleta bici) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta=bici;
		
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	

	
	
	
}
