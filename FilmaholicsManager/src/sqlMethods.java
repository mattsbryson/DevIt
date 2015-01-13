import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class sqlMethods
{
	public static Connection connect(String dbName, String userName, String password, String hostname, String port) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
		conn = DriverManager.getConnection(jdbcUrl);
		return conn;
	}
	
	public static boolean connectTest() //temporary hardcoded method for checking that RDS is connected
	{
		String dbName = "filmaholics";
		String userName = "filmDB";
		String password = "film2014";
		String hostname = "filmaholics.clrwys9xuwpp.us-west-1.rds.amazonaws.com";
		String port = "3306";
		try {
			Connection test = sqlMethods.connect(dbName, userName, password, hostname, port);
			return true;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
