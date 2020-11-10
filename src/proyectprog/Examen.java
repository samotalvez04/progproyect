package proyectprog;

import java.util.Date;

public class Examen {
	private Date fecha;
	private int nota;
	public Examen(Date fecha, int nota) {
		super();
		this.fecha = fecha;
		this.nota = nota;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
