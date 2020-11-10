package proyectprog;

import java.sql.ResultSet;

import persistencia.ControladorBD;

public class ControladorLogic {
	ControladorBD controladorbd = new ControladorBD();
		public ResultSet listarMaterias() throws Exception {
			return controladorbd.listarMaterias();
		}
		


}
