import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		
		try
		{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Success");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("SELECT * FROM test.user");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
