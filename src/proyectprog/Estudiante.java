package proyectprog;

import java.util.Date;

public class Estudiante  extends Usuario{
	private Orientacion orientacion;
	private Estado estado;
	private Generacion generacion;

	public Estudiante(Orientacion orientacion, Estado estado, Generacion generacion, String ci,  String password, String nombre, String apellido, String mail, Date fechaNacimiento) {
		super(ci, password, nombre, apellido, mail, fechaNacimiento);
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
