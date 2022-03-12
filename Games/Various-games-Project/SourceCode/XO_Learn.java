package project_login_page;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class XO_Learn extends JFrame{
    double money;
    String name;
    
    JTextArea t = new JTextArea();
    JButton b = new JButton("Back");  
    JPanel p =new JPanel();
    public XO_Learn(double mon,String nme){
        name = nme;
        money = mon;
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("How to play Tic-tac-toe(X&O)");
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
        t.setText("1. The game is played on a grid that's 3 squares by 3 squares.\n" +
                "2. You are X, your friend is O. Players take turns putting \n    their marks in empty squares.\n" +
                "3. The first player to get 3 of her marks in a row(up, down, across, or diagonally)\n     is the winner.\n" +
                "4. When all 9 squares are full, the game is over. \n"
                + "    If no player has 3 marks in a row, the game ends in a tie. \n"
                + "enjoy :)");
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
        t.setEditable(false);
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
