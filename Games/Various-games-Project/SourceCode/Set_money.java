
package project_login_page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Set_money {
    
    public Set_money(double money,String username){
        
        Data_base("UPDATE our_project SET MONEY ="+money+" WHERE USERNAME='"+username+"'");
        
        
    
    }
    
        public void Data_base(String query){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@WINDOWS-9ERVQ4C:1521/XE","Alhakami","0000");
            Statement stm = con.createStatement();
            ResultSet Rs = stm.executeQuery(query);
            
            
            
        }
        catch(Exception ex){
        
        }
        
        
        
    }
    
    
}
