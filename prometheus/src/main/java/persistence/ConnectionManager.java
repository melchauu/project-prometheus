package persistence;
import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.ds.PGSimpleDataSource;

public class ConnectionManager {
	
	private static String userName = "postgres";
	private static String password = "test123";
	private static String serverName = "localHost";
	private static String dataBaseName = "prometheus";
	private static int portNumber = 5432;
	private static boolean ssl = false;
	
	
	public ConnectionManager() {
		
	}
	
	public static Connection getConnection(){
		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setUser(userName);
		dataSource.setPassword(password);
		dataSource.setPortNumber(portNumber);
		dataSource.setSsl(ssl);
		dataSource.setServerName(serverName);
		dataSource.setDatabaseName(dataBaseName);
		
		
		try {
			Connection connection = dataSource.getConnection();
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
