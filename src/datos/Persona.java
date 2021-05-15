package datos;

public class Persona {
	private int idPersona;
	private long dni;
	private String apellido;
	private String nombre;
	
	public Persona() {
	}

	public Persona(long dni, String apellido, String nombre) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre
				+ "]";
	}
	
	
	

}
