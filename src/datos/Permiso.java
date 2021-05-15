package datos;

import java.time.LocalDate;
import java.util.Set;

public class Permiso {
	private int idPermiso;
	private Persona persona;
	private LocalDate fecha;
	private int cantDias;
	private Rodado Rodado;
	private Set<Lugar> desdeHasta;
	
	public Permiso() {
	}

	public Permiso(Persona persona, LocalDate fecha, int cantDias, datos.Rodado rodado) {
		super();
		this.persona = persona;
		this.fecha = fecha;
		this.cantDias = cantDias;
		Rodado = rodado;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public Rodado getRodado() {
		return Rodado;
	}

	public void setRodado(Rodado rodado) {
		Rodado = rodado;
	}

	public Set<Lugar> getDesdeHasta() {
		return desdeHasta;
	}

	public void setDesdeHasta(Set<Lugar> desdeHasta) {
		this.desdeHasta = desdeHasta;
	}

	@Override
	public String toString() {
		return "Permiso [idPermiso=" + idPermiso + ", persona=" + persona + ", fecha=" + fecha + ", cantDias="
				+ cantDias + ", Rodado=" + Rodado + ", desdeHasta=" + desdeHasta + "]";
	}
	
	

}
