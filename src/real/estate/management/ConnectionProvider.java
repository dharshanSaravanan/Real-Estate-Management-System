/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.estate.management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dharsan S
 */
class ConnectionProvider {

    static Connection getCon() {
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rems","root","");
            return con;
        }
        catch(Exception e)
                {
                    return null;
                }
     }
    
}
