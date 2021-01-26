package eva03Clases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento evento) {
		this.tipo=evento;
		this.numeroDeInscripcion=0;
		participantes = new HashMap<Integer,Deportista>();
	}
	
	public Integer agregarParticipante(Deportista deportista) {
		 participantes.putIfAbsent(this.numeroDeInscripcion++, deportista);
		 return this.numeroDeInscripcion;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	
	
}
