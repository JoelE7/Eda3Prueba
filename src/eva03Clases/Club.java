package eva03Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Enumeradores.TipoDeEvento;
import Interfaces.ICiclista;
import Interfaces.ICorredor;
import Interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		socios = new TreeSet<Deportista>();
		competencias = new HashMap<String, Evento>();
	}

	public Boolean agregarDeportista(Deportista deportista) {
		return socios.add(deportista);

	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento evento, String nombreDelEvento) {
		competencias.putIfAbsent(nombreDelEvento, new Evento(evento));

	}

	public Integer inscribirEnEvento(String Nombre, Deportista deportista) throws NoEstaPreparado {
		Integer numeroDeInscripcion = 0;
		Evento deseado = competencias.get(Nombre);

		switch (deseado.getTipo()) {
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
		case CARRERA_5K:
			if (deportista instanceof ICorredor) {
				numeroDeInscripcion = deseado.agregarParticipante(deportista);
			} else {
				throw new NoEstaPreparado("No esta preparado para correr");
			}
			break;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
		case CARRERA_NATACION_EN_PICINA:
		case DUATLON:
			if(deportista instanceof INadador) {
				numeroDeInscripcion = deseado.agregarParticipante(deportista);
			}else {
				throw new NoEstaPreparado("No esta preparado para nadar");
			}
			break;
		case TRIATLON_IRONMAN:
		case TRIATLON_MEDIO:
		case TRIATLON_OLIMPICO:
		case TRIATLON_SHORT:
			if(deportista instanceof ICorredor && deportista instanceof ICiclista) {
				numeroDeInscripcion = deseado.agregarParticipante(deportista);
			}else {
				throw new NoEstaPreparado("No esta preparado");
			}
			break;
		default:
			break;
		}
		return numeroDeInscripcion;
	}

}
