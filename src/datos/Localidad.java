package datos;

public class Localidad extends Lugar{
	private int idLocalidad;
	private String codPostal;
	private boolean cumplirCuarentena;
	
	public Localidad() {
	}

	

	public Localidad(String codPostal, boolean cumplirCuarentena) {
		super();
		this.codPostal = codPostal;
		this.cumplirCuarentena = cumplirCuarentena;
	}



	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public boolean isCumplirCuarentena() {
		return cumplirCuarentena;
	}

	public void setCumplirCuarentena(boolean cumplirCuarentena) {
		this.cumplirCuarentena = cumplirCuarentena;
	}

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", codPostal=" + codPostal + ", cumplirCuarentena="
				+ cumplirCuarentena + "]";
	}
	
	
	
}
