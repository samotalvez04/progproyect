package proyectprog;

import java.time.LocalDate;
import java.util.Date;

public class Examen {
	private String ci;
	private String id;
	private LocalDate fecha;
	private int nota;

	public Examen(String ci, String id, LocalDate fecha, int nota, String codigo) {
		super();
		this.ci = ci;
		this.id = id;
		this.fecha = fecha;
		this.nota = nota;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
