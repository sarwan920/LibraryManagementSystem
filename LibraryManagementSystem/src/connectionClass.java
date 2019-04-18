public class connectionClass
{
  Connection con = null;
	public static Connection sqlConnector()
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uname= "library";
			String pass = "lib";
			Connection con= DriverManager.getConnection(url,uname,pass); 
		
			return con;
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
}
