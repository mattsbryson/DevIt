import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class sqlMethods //this class is entirely static, as it is designed to give quick access to the databases we must interface with. This is not meant to be a long term solution. 
{
	public static Connection connect(String dbName, String userName, String password, String hostname, String port) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
		conn = DriverManager.getConnection(jdbcUrl);
		return conn;
	}
	
	public static Connection filmConnect() //quick and dirty method for connecting to the filmaholics database on RDS 
	//this is the new DB (transfer to this)
	{
		String dbName = "filmaholics";
		String userName = "filmDB";
		String password = "film2014";
		String hostname = "filmaholics.clrwys9xuwpp.us-west-1.rds.amazonaws.com";
		String port = "3306";
		Connection film = null;
		
		try {
			film = sqlMethods.connect(dbName, userName, password, hostname, port);
		} catch (SQLException | ClassNotFoundException e) { //if db connect fails, program will crash. 
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Program has failed to connect to the " + dbName + ".");
		}
		return film;
	}
	
	public static Connection webGameConnect() //quick and dirty method for connecting to the filmaholics database on RDS 
	{
		String dbName = "webgameconvert";
		String userName = "filmDB";
		String password = "film2014";
		String hostname = "filmaholics.clrwys9xuwpp.us-west-1.rds.amazonaws.com";
		String port = "3306";
		Connection game = null;
		
		try {
			game = sqlMethods.connect(dbName, userName, password, hostname, port);
		} catch (SQLException | ClassNotFoundException e) { //if db connect fails, program will crash. 
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Program has failed to connect to the " + dbName + ".");
		}
		return game;
	}
	
	public static Connection gameConnect() //quick and dirty method for connecting to the filmaholics database on RDS 
	{
		String dbName = "gameconvert";
		String userName = "filmDB";
		String password = "film2014";
		String hostname = "filmaholics.clrwys9xuwpp.us-west-1.rds.amazonaws.com";
		String port = "3306";
		Connection game = null;
		
		try {
			game = sqlMethods.connect(dbName, userName, password, hostname, port);
		} catch (SQLException | ClassNotFoundException e) { //if db connect fails, program will crash. 
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Program has failed to connect to the " + dbName + ".");
		}
		return game;
	}
	
	public static boolean gameConnectTest() //temporary hardcoded method for checking that RDS is connected 
	//only use to see if you can connect, this method is not meant to check the status of your current connection
	{
		Connection test = sqlMethods.gameConnect();
		if(test != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean filmConnectTest() //temporary hardcoded method for checking that RDS is connected 
	//only use to see if you can connect, this method is not meant to check the status of your current connection
	{
		Connection test = sqlMethods.filmConnect();
		if(test != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean webGameConnectTest() //temporary hardcoded method for checking that RDS is connected 
	//only use to see if you can connect, this method is not meant to check the status of your current connection
	{
		Connection test = sqlMethods.webGameConnect();
		if(test != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
