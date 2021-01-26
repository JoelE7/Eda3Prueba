package eva03Clases;

public abstract class Deportista implements Comparable<Deportista> {

	protected Integer numeroDeSocio;
	protected String nombre;

	public Deportista(Integer numeroDeSocio, String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeSocio == null) ? 0 : numeroDeSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		if (numeroDeSocio == null) {
			if (other.numeroDeSocio != null)
				return false;
		} else if (!numeroDeSocio.equals(other.numeroDeSocio))
			return false;
		return true;
	}

	@Override
	public int compareTo(Deportista o) {
		return numeroDeSocio-o.numeroDeSocio;
	}
	
	

}
