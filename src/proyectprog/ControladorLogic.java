package proyectprog;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;

import persistencia.ControladorBD;

public class ControladorLogic {

	ControladorBD controladorbd = new ControladorBD();

	public ResultSet listarMaterias() throws Exception {
		return controladorbd.listarMaterias();
	}

	public ResultSet listarEstudiantes() throws Exception {
		return controladorbd.listarEstudiantes();
	}

	public ResultSet listarFuncionarios() throws Exception {
		return controladorbd.listarFuncionarios();
	}

	public ResultSet listarDocentes() throws Exception {
		return controladorbd.listarDocentes();
	}

	public ResultSet listarPendientes() throws Exception {
		return controladorbd.listarPendientes();
	}

	public ResultSet listarInasistencias() throws Exception {
		return controladorbd.listarInasistencias();
	}

	public void crearInasistencia(Inasistencia inasistencia) throws Exception {
		controladorbd.crearInasistencia(inasistencia);

	}

	public void crearMateria(Materia materia) throws Exception {
		controladorbd.crearMateria(materia);
	}

	public void crearExamen(Examen examen) throws Exception {
		controladorbd.crearExamen(examen);
	}

	public void crearEstudiante(Estudiante estudiante) throws Exception {
		controladorbd.crearEstudiante(estudiante);
	}

	public void crearDocente(Docente docente) throws Exception {
		controladorbd.crearDocente(docente);
	}

	public void crearFuncionario(Funcionario funcionario) throws Exception {
		controladorbd.crearFuncionario(funcionario);
	}

}
