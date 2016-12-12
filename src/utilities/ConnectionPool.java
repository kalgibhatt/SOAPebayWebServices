package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	public static Vector<Connection> pool = new Vector<Connection>();
	private static Vector<Boolean> availablity = new Vector<Boolean>();

	public static void initializePool(int poolSize) {

		while (pool.size() <= poolSize) {
			addConnection();
		}

	}

	private static void addConnection() {
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_market_place", "root", "admin");
			pool.add(conn);
			availablity.add(true);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized Connection getConnection() {
		Connection conn = null;
		while(true) {
			if(pool.size() > 0) {
				conn = pool.get(0);
				pool.remove(0);
				break;
			}
		}
		return conn;
	}
	
	public static synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
	}

}