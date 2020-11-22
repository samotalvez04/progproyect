package proyectprog;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import persistencia.ControladorBD;

public class ControladorLogic {

	ControladorBD controladorbd = new ControladorBD();

	public ResultSet listarMaterias() throws Exception {
		return controladorbd.listarMaterias();
	}
	
	public ResultSet traerNombreEstudiante(String ciEstudiante) {
		return controladorbd.traerNombreEstudiante(ciEstudiante);
	}
	
	public ResultSet traerNombreMateria(String idMateriaa) {
		return controladorbd.traerNombreMateria(idMateriaa);
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

	public ResultSet listarInasistencias(String oriIna, String genIna) throws Exception {
		return controladorbd.listarInasistencias(oriIna, genIna);
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

	public ResultSet datosLogin(String ciLogin) {
		return controladorbd.datosLogin(ciLogin);
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

	public ResultSet consultarSiDicta(String idMateriaa, String ciDocente) {
		return controladorbd.consultarSiDicta(idMateriaa, ciDocente);
	}

	public ResultSet consultarInasistenciaIF(LocalDate dateInicio, LocalDate dateFin) throws Exception {
		return controladorbd.consultarInasistenciaIF(dateInicio, dateFin);
	}

	public ResultSet consultarInasistenciaFI(LocalDate dateInicio, LocalDate dateFin) throws Exception {
		return controladorbd.consultarInasistenciaFI(dateInicio, dateFin);
	}

	public ResultSet consultarInasistenciaIequalsF(LocalDate dateInicio, LocalDate dateFin) throws Exception {
		return controladorbd.consultarInasistenciaIequalsF(dateInicio, dateFin);
	}

	public void modificarDicta(String idMateriaa, String idMateriaModificar, String ciDocente) {
		controladorbd.modificarDicta(idMateriaa, idMateriaModificar, ciDocente);
	}

	public void crearDictaDoc(String ciD, String idmatt) {
		controladorbd.crearDictaDoc(ciD, idmatt);
	}

	public void crearDictaMat(String codigo, String ciDoc) {
		controladorbd.crearDictaMat(codigo, ciDoc);
	}

	public void eliminarInasistencia(String fecha, String materia, String ciEstudiante) {
		controladorbd.eliminarInasistencia(fecha, materia, ciEstudiante);
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
	
	public void actualizarDeAño() {
		controladorbd.actualizarDeAño();
	}
}
