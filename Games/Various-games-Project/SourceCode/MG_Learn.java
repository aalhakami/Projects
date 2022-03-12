
package project_login_page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MG_Learn extends JFrame{
    double money;
    String name;
    
    JTextArea t = new JTextArea();
    JButton b = new JButton("back"); 
    JPanel p =new JPanel();
    public MG_Learn(double mon,String nme){
        name = nme;
        money = mon;
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("How to play Matching Game");
        //super.setLocationRelativeTo(null);
        Setting();
        howtoplay();
        add(p,BorderLayout.SOUTH);
        add(t);        
        pack();
        setVisible(true);     
        super.setResizable(false);
    }  

    private void howtoplay() {
        t.setText("In this game there are 12 color and each color has a pair so we have 24 square\n"
                + "your jab is to match all the color with it pair with as little guess as possible\n"
                + "if got 35 guesses or less you will get $1000\n"
                + "if got 50 guesses or less you will get $500\n "
                + "if got 70 guesses or less you will get $250\n"
                + "if got more than 70 guesses you will get $100\n"
                + "there will be a guess counter above so you can know how many guesses you got until now\n"
                + "enjoy :)");
        t.setEditable(false);
    }
    private void Setting() {
        p.setBackground(Color.white);
        p.add(b);
        
        b.setFont(new Font("Ink Free", Font.BOLD, 25));
        b.setForeground(new Color(255, 216, 33));
        b.setBackground(new Color(0));
        b.setBorder(BorderFactory.createLineBorder(new Color(150, 150, 150)));
        b.addActionListener(new action());
        t.setFont(new Font("Ink Free", Font.BOLD, 20));
    } 
    
    private void  dis(){
       dispose();
    }
    private class action implements ActionListener{
       @Override
        public void actionPerformed(ActionEvent ae) {
            dis();
            new Choose(money,name).setVisible(true);
        }
    }



}
