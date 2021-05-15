package datos;

public class Ubicacion extends Lugar {
	
	private int idUbicacion;
	private double longitud;
	private double latitud;
	
	public Ubicacion(int longitud, int latitud) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
	}
	
	public Ubicacion() {
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	@Override
	public String toString() {
		return "Ubicacion [idUbicacion=" + idUbicacion + ", longitud=" + longitud + ", latitud=" + latitud + "]";
	}
	

}
/*
 
 	private int var1;
	private int var2;
	private int var3;
	private String var4;
	private String var5;
	private String var6;
	private boolean var7;
	private boolean var9;
	private long var10;
	
	public Clase() {
	}
	
 */
