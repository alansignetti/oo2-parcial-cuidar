package datos;

public abstract class Lugar {
	
	protected int idLugar;
	protected String lugar;
	
	public Lugar() {
	}

	public Lugar(String lugar) {
		super();
		this.lugar = lugar;
	}

	public int getIdLugar() {
		return idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
	
	
	

}
