package javad.development.connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Von{

    Connection connection;
    Statement statement;
    public Von(){
        try{
            
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cone", "root", "asher");
            statement= connection.createStatement();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
