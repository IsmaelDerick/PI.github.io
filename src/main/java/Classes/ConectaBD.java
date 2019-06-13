package Classes;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaBD implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/bdprojeto";
	private static final String USER = "postgres";
	private static final String SENHA = "root";

	public static Connection abrirConexao() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, SENHA);
		} catch (Exception e) {

		}
		return null;
	}

	public static void fecha(Connection con, Statement st, ResultSet rs) {
		fechaConexao(null, st, rs);
	}

	public void fecha(Connection con, Statement st) {
		fechaConexao(null, st, null);
	}

	private static void fechaConexao(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
