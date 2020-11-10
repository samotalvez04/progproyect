package proyectprog;

public class Materia {
	private String codigo;
	private String nombre;
	private Orientacion orientacion;
	private Generacion generacion;

	public Materia(String codigo, String nombre, Orientacion orientacion, Generacion generacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.orientacion = orientacion;
		this.generacion = generacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	public Generacion getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Generacion generacion) {
		this.generacion = generacion;
	}

}
