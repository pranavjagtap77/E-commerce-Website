package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	private static Connection conn=null;

	public static Connection getCon() {
		try {

			Class.forName("org.postgresql.Driver");
			// 2.create connection....
			String user = "postgres";
			String password = "pranav";
			String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
