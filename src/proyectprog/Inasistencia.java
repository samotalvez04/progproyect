package proyectprog;

import java.util.Date;

public class Inasistencia {
	private Date fecha;
	private int cantHoras;
	private TipoInasistencia tipo;
	public Inasistencia(Date fecha, int cantHoras, TipoInasistencia tipo) {
		super();
		this.fecha = fecha;
		this.cantHoras = cantHoras;
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantHoras() {
		return cantHoras;
	}
	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	public TipoInasistencia getTipo() {
		return tipo;
	}
	public void setTipo(TipoInasistencia tipo) {
		this.tipo = tipo;
	}
	
}
