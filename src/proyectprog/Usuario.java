package proyectprog;

import java.util.Date;

public class Usuario {

	private String ci;
	private String password;
	private String nombre;
	private String apellido;
	private String mail;
	private Date fechaNacimiento;

	public Usuario(String ci, String password, String nombre, String apellido, String mail, Date fechaNacimiento) {
		super();
		this.ci = ci;
		this.password = password; 
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
