package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ControladorBD {
	
	public Connection getMySqlConnection() throws Exception {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyect?serverTimezone=UTC", "root", "");
        } catch (Exception r) {

        }
        return con;
    }
	
	public ResultSet listarMaterias() throws Exception {
		ResultSet res;
		Connection con = getMySqlConnection();
        Statement st;
        st = con.createStatement();
        res = st.executeQuery("SELECT * FROM materia");
        return res;
	}

}
