 
package TravelManagementSystem;

import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","364915@Om");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
