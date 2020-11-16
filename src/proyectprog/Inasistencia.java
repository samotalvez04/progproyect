package proyectprog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Inasistencia {
	private String ciEstudiante;
	private String idMateria;
	private LocalDate fecha;
	private int cantHoras;
	private TipoInasistencia tipoInasistencia;

	public Inasistencia(String ciEstudiante, String idMateria, LocalDate fecha, int cantHoras,
			TipoInasistencia tipoInasistencia) {
		super();
		this.ciEstudiante = ciEstudiante;
		this.idMateria = idMateria;
		this.fecha = fecha;
		this.cantHoras = cantHoras;
		this.tipoInasistencia = tipoInasistencia;
	}

	public String getciEstudiante() {
		return ciEstudiante;
	}

	public void setciEstudiante(String ciEstudiante) {
		this.ciEstudiante = ciEstudiante;
	}

	public String getidMateria() {
		return idMateria;
	}

	public void setidMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public TipoInasistencia getTipoInasistencia() {
		return tipoInasistencia;
	}

	public void setTipoInasistencia(TipoInasistencia tipoInasistencia) {
		this.tipoInasistencia = tipoInasistencia;
	}

}
