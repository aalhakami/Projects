package project_login_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;


public class GUI_login_page extends JFrame{

    double money;
    String user_name;
    
    
    JLabel titel_log = new JLabel("Login");
    
    JLabel user_label = new JLabel("Username");
    JLabel pass_label = new JLabel("Password");
    
    JTextField user_text = new JTextField(15);
    JPasswordField pass_text = new JPasswordField(15);
    
    JButton login_button = new JButton("Login");
    JButton register_button = new JButton("Register");
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    
    File user_file , pass_file ;
    FileWriter write_user , write_pass;
    
    
    public GUI_login_page(){
        //Set Settings 
        super("Login_Page");
        super.setDefaultCloseOperation(3);
        super.setSize(500, 600);
        super.setVisible(true);
        super.setContentPane(new JLabel(new ImageIcon("giphy.gif")));
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);
        super.setResizable(false);

        //Here we Startttttttttttttttttttttttttttutututkd
        //End
        super.add(this.titel_log,BorderLayout.NORTH);
        super.add(new JLabel("                                                                                                                                                  "));
        super.add(this.user_label);
        super.add(this.user_text);
        super.add(this.pass_label);
        super.add(this.pass_text);
        super.add(new JLabel("                                                                                                                                                  "));

        //super.add(this.p2,BorderLayout.SOUTH);
        super.add(new JLabel("                                                                                          "));
        super.add(new JLabel("                                                                                          "));
        super.add(new JLabel("                                                                                          "));
        super.add(new JLabel("                                                                                          "));
        super.add(new JLabel("                                                                                                                                                                                    "));
        //super.add(new JLabel("                                                                                          "));
        //super.add(new JLabel("                                                                         "));
        //super.add(new JLabel("                                                                                          "));
        super.add(this.register_button);
        super.add(this.login_button);
        //Add to the panel

        
        
//        p2.add(this.register_button);
//        p2.add(this.login_button);

        
        
        //Add the compontns to the Frame
//        super.add(this.p1,BorderLayout.CENTER);

        //Set the setting of componants .
        titel_log.setHorizontalAlignment(JLabel.CENTER);
        //Set Font setting
        titel_log.setFont(new Font("Tempus Sans ITC",Font.PLAIN,50));
        user_label.setFont(new Font("Tempus Sans ITC",Font.PLAIN,15));
        pass_label.setFont(new Font("Tempus Sans ITC",Font.PLAIN,15));
        
        titel_log.setForeground(Color.white);
        user_label.setForeground(Color.WHITE);
        pass_label.setForeground(Color.WHITE);
        
        
        //Register Button Start Action
        
        this.register_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean user_already_used = false;
                String username = user_text.getText();
                
                //To read
//                user_file = new File("UserName.txt");
//                pass_file = new File("PassWord.txt");
                try {
//                    Scanner input = new Scanner(user_file);
                    //while (input.hasNext())
                    //{
                        if(Data_base_Check("SELECT * FROM our_project WHERE USERNAME='"+username+"'"))
                        {
                            JOptionPane.showMessageDialog(null, "User already used !");
                            user_already_used = true;
                        }
                        
                    //}
                    
                } catch (Exception ex) {
                    Logger.getLogger(GUI_login_page.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
                
                
                //To write
                if(user_already_used != true)
                {
                
                    try {
//                        
//                    write_user = new FileWriter(user_file,true);
//                    write_pass = new FileWriter(pass_file,true);
//                    PrintWriter us = new PrintWriter (write_user);
//                    PrintWriter ps = new PrintWriter (write_pass);
//                    
//                    us.println(username);
//                    
//                    ps.println(hash_pass(pass_text.getText()));
//                    
//                    us.close();
//                    ps.close();
//                    write_user.close();

//                    To input inside the Data base Table .
                    Data_base("INSERT INTO OUR_PROJECT(username,password) VALUES ('"+username+"','"+ hash_pass(pass_text.getText())+"')");
                    JOptionPane.showMessageDialog(null, "@@ Now you are one of us @@");
                } catch (Exception ex) {
                    System.out.println("Error In Register");
                    
                }

                
                
                    
                }
            
            
            
            }
        
        });
       //Register Button End Action 
        
       




       //Login Button Start Action
       
       this.login_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = user_text.getText();
                String password = hash_pass(pass_text.getText());
                
//                user_file = new File("UserName.txt");
//                pass_file = new File("PassWord.txt");
                try {
//                    Scanner input_user_file = new Scanner(user_file);
//                    Scanner input_pass_file = new Scanner(pass_file);
//                    
//                    while (input_user_file.hasNext() && input_pass_file.hasNext())
//                    {
//                        //Reading line from the user file and password file
//                
//                    }

            //Check from the Data base and return true or flase
            if(Data_base_Check("SELECT * FROM our_project WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'"))
            {
                
                JOptionPane.showMessageDialog(null, "Hello " + username);
                
                xo_frame(money);
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "!! UserName/Password INCORRECT !!");
            }
            
            
            
                } catch (Exception ex) {
                }

                
                
            }
       
       });
       
       
    
       
       
       
       
       
       
       
       
       
       
       
    }
    
    //To register and input data to DataBase
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

    
    //To check when user login
    public boolean Data_base_Check(String query){
        boolean a = false;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@WINDOWS-9ERVQ4C:1521/XE","Alhakami","0000");
            Statement stm = con.createStatement();
            ResultSet Rs = stm.executeQuery(query);
            //Return if there a row exist with the value so the pass match and user name;
            a = Rs.next();
            
            money = Rs.getDouble("MONEY");
            user_name = Rs.getString("username");

        }
        catch(Exception ex){
        
        }
        
     return a;   
    }

    
    private void xo_frame(double money){
        super.setVisible(false);
        new Choose(money,user_name).setVisible(true);
 
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
