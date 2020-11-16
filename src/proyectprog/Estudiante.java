package proyectprog;

import java.time.LocalDate;
import java.util.Date;

public class Estudiante  extends Usuario{
	private Orientacion orientacion;
	private Estado estado;
	private Generacion generacion;

	public Estudiante(String ci, Estado estado, Orientacion orientacion, Generacion generacion, String password, String nombre, String apellido, String mail, LocalDate fechaDeNacimiento) {
		super(ci, password, nombre, apellido, mail, fechaDeNacimiento);
		this.orientacion = orientacion;
		this.estado = estado;
		this.generacion = generacion;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Generacion getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Generacion generacion) {
		this.generacion = generacion;
	}

}
