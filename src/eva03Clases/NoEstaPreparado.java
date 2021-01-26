package eva03Clases;

public class NoEstaPreparado extends Exception {

	public NoEstaPreparado() {
		super("No esta preparado");
	}
	
	public NoEstaPreparado(String mensaje) {
		super(mensaje);
	}
	
}
