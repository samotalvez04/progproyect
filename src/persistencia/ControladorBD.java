package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import proyectprog.ControladorLogic;
import proyectprog.Docente;
import proyectprog.Estudiante;
import proyectprog.Examen;
import proyectprog.Funcionario;
import proyectprog.Inasistencia;
import proyectprog.Materia;
import proyectprog.pantalla;

public class ControladorBD {

	Conn conn = new Conn();
	Connection connection = conn.conectarMySQL();

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
		Connection connection = conn.conectarMySQL();
		Statement st;
		st = connection.createStatement();
		res = st.executeQuery("SELECT * FROM materia");
		return res;
	}

	public ResultSet listarEstudiantes() throws Exception {
		ResultSet res2;
		Connection connection2 = conn.conectarMySQL();
		Statement st2;
		st2 = connection2.createStatement();
		res2 = st2.executeQuery("SELECT * FROM estudiante");
		return res2;
	}

	public ResultSet listarFuncionarios() throws Exception {
		ResultSet res3;
		Connection connection3 = conn.conectarMySQL();
		Statement st3;
		st3 = connection3.createStatement();
		res3 = st3.executeQuery("SELECT * FROM funcionario");
		return res3;
	}

	public ResultSet listarDocentes() throws Exception {
		ResultSet res4;
		Connection connection4 = conn.conectarMySQL();
		Statement st4;
		st4 = connection4.createStatement();
		res4 = st4.executeQuery("SELECT * FROM docente");
		return res4;
	}

	public ResultSet listarPendientes() throws Exception {
		ResultSet res5;
		Connection connection5 = conn.conectarMySQL();
		Statement st5;
		st5 = connection5.createStatement();
		res5 = st5.executeQuery("SELECT * FROM examen");
		return res5;
	}

	public ResultSet listarInasistencias() throws Exception {
		ResultSet res6;
		Connection connection6 = conn.conectarMySQL();
		Statement st6;
		st6 = connection6.createStatement();
		res6 = st6.executeQuery("SELECT * FROM inasistencia");
		return res6;
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

}
