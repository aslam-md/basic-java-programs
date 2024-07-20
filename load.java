import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class load {
    public static void main(String[] args) throws Exception
    {
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("loaded");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3333/gecdb2", "root", "rajitha");
           System.out.println("connection is established");
           Statement stmt=con.createStatement();
           stmt.execute("create table emp(eno int primary key,ename varchar(30))");
           System.out.println("emp table created");

    }
}
