package proyectprog;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Usuario {

	public Funcionario(String ci, String password, String nombre, String apellido, String mail, LocalDate fechaNacimiento) {
		super(ci, password, nombre, apellido, mail, fechaNacimiento);
	}

}
