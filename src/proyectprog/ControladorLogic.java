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

	public void crearMateria(Materia materia, String ciDoc) throws Exception {
		controladorbd.crearMateria(materia, ciDoc);
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

	public ResultSet consultarInasistencia(LocalDate dateInicio, LocalDate dateFin) throws Exception {
		return controladorbd.consultarInasistencia();
	}

	public ResultSet consultarUsuario(String ciUsu) throws Exception {
		return controladorbd.consultarUsuario(ciUsu);
	}

	public ResultSet consultarMateria(String idOnameMat) throws Exception {
		return controladorbd.consultarMateria(idOnameMat);
	}

	public ResultSet cantidadIns(String idOnameMat) throws Exception {
		return controladorbd.cantidadIns(idOnameMat);
	}

	public void modificarUsuario(String nom, String apell, String ci, LocalDate fech, String mail, String psswd) {
		controladorbd.modificarUsuario(nom, apell, ci, fech, mail, psswd);
	}

	public ResultSet consultarSiEsEstudiante(String ciUsu) {
		return controladorbd.consultarSiEsEstudiante(ciUsu);
	}

	public void modificarMateria(String idMat, String nombreMat, String oriMat, String geneMat) {
		controladorbd.modificarMateria(idMat, nombreMat, oriMat, geneMat);
	}

	public void crearCursa(String ciestudiante, String idMateria, String notaMateria) {
		controladorbd.crearCursa(ciestudiante, idMateria, notaMateria);
	}

	public void modificarDicta(String idmateria, String cidocente) {
		controladorbd.modificarDicta(idmateria, cidocente);
	}
	
	public void eliminarInasistencia(String selected) {
		controladorbd.eliminarInasistencia(selected);
	}

	public ResultSet login(String ciLogin, String psswdLogin) {
		return controladorbd.login(ciLogin, psswdLogin);
	}

	public ResultSet reporteEstadisticasInasistenciaIndice() {
		return controladorbd.reporteEstadisticasInasistenciaIndice();
	}

	public ResultSet reporteEstadisticasEstudiante() {
		return controladorbd.reporteEstadisticasEstudiante();
	}

	public ResultSet materiasRepetidas() {
		return controladorbd.materiasRepetidas();
	}
	
	public ResultSet consultarSiEsDocente(String ciUsu) {
		return controladorbd.consultarSiEsDocente(ciUsu);
	}
}
