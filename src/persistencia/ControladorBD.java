package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import proyectprog.ControladorLogic;
import proyectprog.Docente;
import proyectprog.Estudiante;
import proyectprog.Examen;
import proyectprog.Funcionario;
import proyectprog.Inasistencia;
import proyectprog.Materia;
import proyectprog.Usuario;
import proyectprog.pantalla;

public class ControladorBD {

	Conn conn = new Conn();
	Connection connection = conn.connectToMySQL();

	public void crearInasistencia(Inasistencia inasistencia) {
		try {

			String valores = "'" + inasistencia.getCantHoras() + "', '" + inasistencia.getFecha() + "', '"
					+ inasistencia.getidMateria() + "', '" + inasistencia.getTipoInasistencia() + "', '"
					+ inasistencia.getciEstudiante() + "'";
			Statement s = connection.createStatement();
			s.executeUpdate("INSERT INTO inasistencia(cantHoras, fecha, idMateria, tipo, ciEstudiante) VALUES ( "
					+ valores + " );");
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public void crearMateria(Materia materia, String ciDoc) {
		try {
			String valores99 = "'" + materia.getCodigo() + "', '" + materia.getNombre() + "', '"
					+ materia.getOrientacion() + "', '" + materia.getGeneracion() + "'";
			Statement s99 = connection.createStatement();
			s99.executeUpdate("INSERT INTO materia(id, nombre, orientacion, generacion) VALUES ( " + valores99 + " );");

			try {
				String valore2 = "'" + ciDoc + "', '" + materia.getCodigo() + "'";
				Statement s2 = connection.createStatement();
				s2.executeUpdate("INSERT INTO dicta(ciDocente, codMateria) VALUES ( " + valore2 + " );");

			} catch (SQLException e) {
				System.out.println("Error!");
				e.printStackTrace();
			}
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public ResultSet listarMaterias() throws Exception {
		ResultSet res;
		Connection connection = conn.connectToMySQL();
		Statement st;
		st = connection.createStatement();
		res = st.executeQuery("SELECT * FROM materia");
		return res;
	}

	public ResultSet listarEstudiantes() throws Exception {
		ResultSet res2;
		Connection connection2 = conn.connectToMySQL();
		Statement st2;
		st2 = connection2.createStatement();
		res2 = st2.executeQuery("SELECT * FROM estudiante");
		return res2;
	}

	public ResultSet listarFuncionarios() throws Exception {
		ResultSet res3;
		Connection connection3 = conn.connectToMySQL();
		Statement st3;
		st3 = connection3.createStatement();
		res3 = st3.executeQuery("SELECT * FROM funcionario");
		return res3;
	}

	public ResultSet listarDocentes() throws Exception {
		ResultSet res4;
		Connection connection4 = conn.connectToMySQL();
		Statement st4;
		st4 = connection4.createStatement();
		res4 = st4.executeQuery("SELECT * FROM docente");
		return res4;
	}

	public ResultSet listarPendientes() throws Exception {
		ResultSet res5;
		Connection connection5 = conn.connectToMySQL();
		Statement st5;
		st5 = connection5.createStatement();
		res5 = st5.executeQuery("SELECT * FROM examen");
		return res5;
	}

	public ResultSet listarInasistencias() throws Exception {
		ResultSet res6;
		Connection connection6 = conn.connectToMySQL();
		Statement st6;
		st6 = connection6.createStatement();
		res6 = st6.executeQuery("SELECT * FROM inasistencia");
		return res6;
	}

	public ResultSet consultarInasistencia() throws Exception {
		ResultSet res9;
		Connection connection9 = conn.connectToMySQL();
		Statement st9;
		st9 = connection9.createStatement();
		res9 = st9.executeQuery("SELECT * FROM inasistencia");
		return res9;
	}

	public void crearExamen(Examen examen) {
		try {

			String valores = "'" + examen.getCi() + "', '" + examen.getId() + "', '" + examen.getFecha() + "', '"
					+ examen.getNota() + "'";
			Statement s = connection.createStatement();
			s.executeUpdate("INSERT INTO examen(ciEstudiante, codMateria, fecha, nota) VALUES ( " + valores + " );");
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public void crearEstudiante(Estudiante estudiante) {
		try {

			String valores = "'" + estudiante.getCi() + "', '" + estudiante.getMail() + "', '"
					+ estudiante.getFechaDeNacimiento() + "', '" + estudiante.getNombre() + "', '"
					+ estudiante.getApellido() + "', '" + estudiante.getPassword() + "'";
			Statement s = connection.createStatement();
			s.executeUpdate("INSERT INTO usuario(ci, correo, fechaDeNacimiento, nombre, apellido, passwd) VALUES ( "
					+ valores + " );");

			try {

				String valores2 = "'" + estudiante.getCi() + "', '" + estudiante.getEstado() + "', '"
						+ estudiante.getOrientacion() + "', '" + estudiante.getGeneracion() + "'";
				Statement s2 = connection.createStatement();
				s2.executeUpdate(
						"INSERT INTO estudiante(ci, estado, orientacion, generacion) VALUES ( " + valores2 + " );");
			} catch (SQLException e) {
				System.out.println("Error!");
				e.printStackTrace();
			}
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public void crearDocente(Docente docente) {
		try {

			String valores3 = "'" + docente.getCi() + "', '" + docente.getMail() + "', '"
					+ docente.getFechaDeNacimiento() + "', '" + docente.getNombre() + "', '" + docente.getApellido()
					+ "', '" + docente.getPassword() + "'";
			Statement s3 = connection.createStatement();
			s3.executeUpdate("INSERT INTO usuario(ci, correo, fechaDeNacimiento, nombre, apellido, passwd) VALUES ( "
					+ valores3 + " );");

			try {
				Statement s4 = connection.createStatement();
				String valores4 = "'" + docente.getCi() + "'";
				s4.executeUpdate("INSERT INTO docente(ci) VALUES ( " + valores4 + " );");
			} catch (SQLException e) {
				System.out.println("Error!");
				e.printStackTrace();
			}
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public void crearFuncionario(Funcionario funcionario) {
		try {

			String valores5 = "'" + funcionario.getCi() + "', '" + funcionario.getMail() + "', '"
					+ funcionario.getFechaDeNacimiento() + "', '" + funcionario.getNombre() + "', '"
					+ funcionario.getApellido() + "', '" + funcionario.getPassword() + "'";
			Statement s5 = connection.createStatement();
			s5.executeUpdate("INSERT INTO usuario(ci, correo, fechaDeNacimiento, nombre, apellido, passwd) VALUES ( "
					+ valores5 + " );");

			try {
				Statement s6 = connection.createStatement();
				String valores6 = "'" + funcionario.getCi() + "'";
				s6.executeUpdate("INSERT INTO funcionario(ci) VALUES ( " + valores6 + " );");
			} catch (SQLException e) {
				System.out.println("Error!");
				e.printStackTrace();
			}
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}

	}

	public void crearCursa(String ciestudiante, String idMateria, String notaMateria) {
		try {
			Statement s34 = connection.createStatement();
			s34.executeUpdate("INSERT INTO cursada(ciEstudiante, codMateria, nota) VALUES ('" + ciestudiante + "', '"
					+ idMateria + "', '" + notaMateria + "');");
		} catch (Exception e34) {
			e34.printStackTrace();
		}
	}

	public void modificarDicta(String idmateria, String cidocente) {
		try {
			Statement comando = connection.createStatement();
			comando.executeUpdate(
					"UPDATE dicta SET codMateria='" + idmateria + "' WHERE ciDocente='" + cidocente + "'");
		} catch (Exception e54) {
			e54.printStackTrace();
		}
	}

	public ResultSet consultarInasistencia(String dateInicio, String dateFin) throws Exception {
		ResultSet res666 = null;
		try {
			Statement comando = connection.createStatement();
			res666 = comando.executeQuery(
					"SELECT * FROM inasistencia WHERE fecha BETWEEN '" + dateInicio + "' AND '" + dateFin + "'");
		} catch (Exception e666) {
			e666.printStackTrace();
		}
		return res666;

	}

	public ResultSet consultarUsuario(String ciUsu) throws Exception {
		ResultSet res13 = null;
		try {
			Statement comando = connection.createStatement();
			res13 = comando.executeQuery(
					"SELECT ci, correo, fechaDeNacimiento, nombre, apellido, passwd FROM usuario WHERE ci=" + ciUsu);
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return res13;

	}

	public void modificarUsuario(String nom, String apell, String ci, LocalDate fech, String mail, String psswd) {
		try {

			Statement comando = connection.createStatement();
			comando.executeUpdate("UPDATE usuario SET correo='" + mail + "', fechaDeNacimiento='" + fech + "', nombre='"
					+ nom + "', apellido='" + apell + "', passwd='" + psswd + "' WHERE ci='" + ci + "'");
		} catch (Exception e3) {
			e3.printStackTrace();
		}
	}

	public ResultSet consultarSiEsEstudiante(String ciUsu) {
		ResultSet res77 = null;
		try {
			Statement comando = connection.createStatement();
			res77 = comando.executeQuery("SELECT ci FROM estudiante WHERE ci='" + ciUsu + "'");
		} catch (Exception e67) {
			e67.printStackTrace();
		}
		return res77;
	}

	public ResultSet consultarSiEsDocente(String ciUsu) {
		ResultSet res99 = null;
		try {
			Statement comando = connection.createStatement();
			res99 = comando.executeQuery("SELECT ci FROM docente WHERE ci='" + ciUsu + "'");
		} catch (Exception e67) {
			e67.printStackTrace();
		}
		return res99;
	}

	public void modificarMateria(String idMat, String nombreMat, String oriMat, String geneMat) {
		try {
			Statement comando = connection.createStatement();
			comando.executeUpdate("UPDATE materia SET nombre='" + nombreMat + "', orientacion='" + oriMat
					+ "', generacion='" + geneMat + "' WHERE id='" + idMat + "'");
		} catch (Exception e77) {
			e77.printStackTrace();
		}
	}

	public ResultSet consultarMateria(String idOnameMat) throws Exception {
		ResultSet res14 = null;
		try {
			Statement comando = connection.createStatement();

			res14 = comando.executeQuery(
					"SELECT id, nombre, orientacion, generacion FROM materia WHERE id= '" + idOnameMat + "'");
			if (res14.isBeforeFirst() == false) {
				res14 = comando.executeQuery(
						"SELECT id, nombre, orientacion, generacion FROM materia WHERE nombre= '" + idOnameMat + "'");
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return res14;

	}

	public ResultSet cantidadIns(String idOnameMat) throws Exception {
		ResultSet res15 = null;
		try {
			Statement comando = connection.createStatement();
			res15 = comando
					.executeQuery("SELECT count(codMateria) FROM cursada WHERE codMateria= '" + idOnameMat + "'");
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return res15;

	}

	public void eliminarInasistencia(String selected) {
		try {
			Statement comando = connection.createStatement();
			comando.executeUpdate("DELETE FROM inasistencia WHERE cantHoras='" + selected + "'");
		} catch (Exception e41) {
			e41.printStackTrace();
		}
	}

	public ResultSet login(String ciLogin, String psswdLogin) {
		ResultSet res3344 = null;
		try {
			Statement comando = connection.createStatement();
			res3344 = comando.executeQuery(
					"SELECT usuario.ci FROM usuario INNER JOIN funcionario WHERE usuario.ci = funcionario.ci AND usuario.passwd='"
							+ psswdLogin + "' AND usuario.ci='" + ciLogin + "'");
		} catch (Exception e3344) {
			e3344.printStackTrace();
		}
		return res3344;
	}

	public ResultSet reporteEstadisticasInasistenciaIndice() {
		ResultSet res456 = null;
		try {
			Statement comando = connection.createStatement();
			res456 = comando.executeQuery("SELECT COUNT(*) FROM inasistencia");
		} catch (Exception e456) {
			e456.printStackTrace();
		}
		return res456;
	}

	public ResultSet reporteEstadisticasEstudiante() {
		ResultSet res65 = null;
		try {
			Statement comando = connection.createStatement();
			res65 = comando.executeQuery("SELECT COUNT(*) FROM estudiante");
		} catch (Exception e65) {
			e65.printStackTrace();
		}
		return res65;
	}

	public ResultSet materiasRepetidas() {
		ResultSet res67 = null;
		try {
			Statement comando = connection.createStatement();
			res67 = comando.executeQuery(
					"SELECT idMateria,COUNT(idmateria) as total FROM `inasistencia` GROUP BY 1 HAVING COUNT(idMateria) > 1");
		} catch (Exception e67) {
			e67.printStackTrace();
		}
		return res67;
	}

}
