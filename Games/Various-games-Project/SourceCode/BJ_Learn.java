
package project_login_page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BJ_Learn extends JFrame{
    double money;
    String name;

    
    JTextArea t = new JTextArea();
    JButton b = new JButton("Back"); 
    JPanel p =new JPanel();
    public BJ_Learn(double mon,String nme){
        money = mon ;
        name = nme;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("How to play BlackJack21");
        //setLocationRelativeTo(null);
        howtoplay();
        Setting();
        add(p,BorderLayout.SOUTH);
        add(t);
        pack();
        setVisible(true);   
        super.setResizable(false);
    }

    private void howtoplay() {
        t.setText("the game will start with the dealer passing to you 2 cards and for him 2 and one of them is hidden"+
            "\nhere you will have 2 choices 1- Hit 2-Stand.\n" +
            "Hit:\n" +
            "when you press hit the dealer will pass you another card and when you want to stop press stand.\n"+
            " (if your point more than 21 the dealer will stop passing cards)\n" +
            "\nStand:\n" +
            "press it when you don't want another card.\n" +
            "\n" +
            "After Stand the dealer will flip his hidden card if it less than 17 the dealer will hit a card until it above 17 or more than 21\n"
                + " and if that so the player will win even if the player has 4 (which is the minimum point the player will ever get).\n" +
            "\n" +
            "Points: \n" +
            "Ace has two value the first one is 11 point and the second one is 1 point the player can choose whichever is better for him\n" +
            "King, Queen, Jack, and ten have the same value which is 10 points \n" +
            "And the rest have points as the same as their value for example nine has 9 points and two has 2 points and so. \n" +
            " \n" +
            "How to win:\n" +
            "You must gather points more than the dealer and less or equal to 21 if it more than 21 you will lose instantly."
        );
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
