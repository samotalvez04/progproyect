package persistencia;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conn {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String database = "proyect";
	public String hostname = "127.0.0.1";
	public String port = "3306";
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public String username = "root";
	public String password = "";

	public Connection connectToMySQL() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Base de datos Offline", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			e.printStackTrace();
		}

		return conn;
	}

}
