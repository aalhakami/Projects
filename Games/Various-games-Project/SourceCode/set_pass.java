
package project_login_page;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class set_pass {
    public set_pass(String username , String pass){
        
        Data_base("Update our_project set password='"+hash_pass(pass)+"' where username = '"+username+"'");
        
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
    //To Hash the password and add the salt to provied MD5 saltedhash
    private String hash_pass(String user_password){


    String salt = "Our#Project";
    String Salted_Hash = user_password + salt;
    String passwordToHash = Salted_Hash;

    String generatedPassword = null;

    try 
    {
      // Create MessageDigest instance for MD5
      MessageDigest md = MessageDigest.getInstance("MD5");

      // Add password bytes to digest
      md.update(passwordToHash.getBytes());

      // Get the hash's bytes
      byte[] bytes = md.digest();

      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }

      // Get complete hashed password in hex format
      generatedPassword = sb.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
        return generatedPassword;
    }
}
