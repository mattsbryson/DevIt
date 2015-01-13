import java.sql.Connection;
import java.sql.*;
//These three  are needed for the method I commented out below. Might not need them anymore.
//import java.io.InputStream;
//import java.io.IOException;
//import java.io.ByteArrayOutputStream;

public class importMethods
{
	
	
	
	
	
	
	
	
	
	//todo rename and organize methods, ie. why is blobs in importOld()?
	/*
	public static void importOld() throws ClassNotFoundException, SQLException
	{
		Connection con = sqlMethods.connect("mysql.new.filmaholics.com", "filmaholics", "dbadmin_film", "c@Adra4w");
		Connection aCon = accessMethods.connect();

		Statement stmt = null;
        PreparedStatement ps = null;
	    String query =
	        "select * from Answers"; //used to be "select 'Clip number' from Answers"
	    String tableID = ""; //Where do the results from the query need to go? Change the string to the name of the table we're importing to please - Todd
	    String column1ID = "Clip number";
	    String column2ID = "column2";
	    String column3ID = "column3"; //Change/add columns as necessary per table. Make sure there are as many setBinaryStream() below as there are columns, and that the preparedStatement is correct.
	    ps = con.prepareStatement("INSERT INTO "+tableID+" (column1, column2, column3) VALUES (?, ?, ?)"); 	//Each question mark by VALUES is a value for a certain column in the table we need.
	    																									//Someone needs to change this so it lines up with the table we're importing into, I think.
	    try {
	        stmt = aCon.createStatement();
	        ResultSet rs = stmt.executeQuery(query);

	        while (rs.next()) {
	            int id = rs.getInt("Clip number");
	            System.out.print(id);
	            
	            //Since I'm having trouble connecting to the databases (see below), I can't test to see if this stuff I've added works or not.
	            //The error is: "Access denied for user 'dbadmin_film'@'cpe-172-251-42-172.socal.res.rr.com' (using password: YES)"
	            //I think it has something to do with me not having authorization to modify the mySQL DB at my IP address, or something. - Todd
	            
	            //What this stuff below should be doing, is converting each value in each column into a stream of binary,
	            //then basically inserts the binary into the respective MYSQL table.
	            
		        ps.setBinaryStream(1, rs.getBinaryStream(column1ID));
		        ps.setBinaryStream(2, rs.getBinaryStream(column2ID));
		        ps.setBinaryStream(3, rs.getBinaryStream(column3ID));
	            int a = ps.executeUpdate();
	            
	            System.out.println(a);
	            
	        }
	    } catch (SQLException e ) {
	        System.out.println(e.toString());
	    } finally {
	        if (stmt != null) { stmt.close(); ps.close(); }
	    }
		
	}
	*/
	/*/ Do we need to convert things from queries to Blobs? This almost does the job. (just remove the asterisk to toggle the comment block)
	public static Blob convertToBlob(ResultSet rs, String columnID) throws SQLException, IOException {
		try{
			while(rs.next()){
				InputStream is = rs.getBinaryStream(columnID);
				ByteArrayOutputStream buff = new ByteArrayOutputStream();
				
				int a;
				byte[] b = new byte[16384];
				
				while ((a = is.read(b,0,b.length))!=-1){
					buff.write(b,0,a);
				}
				
				buff.flush();
				
				byte[] c = buff.toByteArray();
				
				
				
			}
		} catch (SQLException e) {
	        System.out.println(e.toString());
		} catch (IOException e){
			System.out.println(e.toString());
		}
	}
	//*/
}
