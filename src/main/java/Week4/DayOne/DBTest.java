package Week4.DayOne;

import java.sql.*;

public class DBTest {
    Connection con;

    public static void main(String[] args) {
        try {
            DBTest test = new DBTest();
            test.con = DatabaseDriver.getInstance().getConnection();
            System.out.println("connection successful");

        } catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
