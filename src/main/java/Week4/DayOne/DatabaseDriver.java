package Week4.DayOne;
import java.sql.*;
public class DatabaseDriver{
    private static DatabaseDriver db;
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/testdb";
    private String username = "root";
    private String password = "password";

    private DatabaseDriver() throws SQLException{
        this.con = DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection(){
        return this.con;
    }

    public static DatabaseDriver getInstance() throws SQLException{
        if(db == null){
            db = new DatabaseDriver();
        }else if(getInstance().getConnection().isClosed()){
            db = new DatabaseDriver();
        }
        return db;
    }
}