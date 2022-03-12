package project_login_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.event.*;


public class GUI_T3 extends JFrame{
    
    double money;
    String name;
    ImageIcon image1_x = new ImageIcon("X.jpg");
    JLabel label_image_x = new JLabel(image1_x);

    ImageIcon image2_o = new ImageIcon("O.jpg");
    JLabel label_image_o = new JLabel(image2_o);
    
    JButton b1 = new JButton();
    
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    
    
    //MENU 
    JMenuBar mb;
    JMenu m;
    JMenuItem mi;

    
    
    boolean player1 = true;
    boolean player2 = true;
    
    int a1 = 0 , a2 = 0,a3 = 0,a4 = 0, a5 = 0,a6 = 0 , a7=0,a8=0,a9=0;

    
    int line1 , line2 , line3 , line4 , line5 , line6 , line7 , line8 ;
    int line1_o ,line2_o , line3_o , line4_o , line5_o , line6_o , line7_o , line8_o;
    
    JButton new_game = new JButton("New Game ?");
    JButton exit_game= new JButton("Back !");
    
    
    boolean vis = true;
    public GUI_T3(double mon, String nme){
    super("T2");
    money = mon;
    name = nme;
        super.setSize(400, 400);
        super.setVisible(vis);
        super.setDefaultCloseOperation(3);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        
        
        //MENU
        mb = new JMenuBar();
        m = new JMenu("How To Play");
        mi = new JMenuItem("Tic-Tac-Toe");
        m.add(mi);
        mb.add(m);
        mi.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {

            invis();
             new XO_Learn();

        }
        
        
        
        });
        super.setJMenuBar(mb);

    //-------------------------------------
    b1.setPreferredSize(new Dimension(100, 100));
    b2.setPreferredSize(new Dimension(100, 100));
    b3.setPreferredSize(new Dimension(100, 100));
    b4.setPreferredSize(new Dimension(100, 100));
    b5.setPreferredSize(new Dimension(100, 100));
    b6.setPreferredSize(new Dimension(100, 100));
    b7.setPreferredSize(new Dimension(100, 100));
    b8.setPreferredSize(new Dimension(100, 100));
    b9.setPreferredSize(new Dimension(100, 100));
    
    super.add(b1);
    super.add(b2);
    super.add(b3);
    super.add(b4);
    super.add(b5);
    super.add(b6);
    super.add(b7);
    super.add(b8);
    super.add(b9);
    
    super.add(new_game);
    super.add(exit_game);
    //-----------
    
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a1 == 0){
            if (player1)
            {
                b1.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line1 = line1 + 1;
                line4 = line4 + 1;
                line7 = line7 + 1;

            }
            else if(player2){
                b1.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line1_o = line1_o + 1;
                line4_o = line4_o + 1;
                line7_o = line7_o + 1;
            }
            }
            a1= 1;
            result();
            
        }
    
    });
    
    
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a2 == 0){
            if (player1)
            {
                b2.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line2 = line2 + 1;
                line4 = line4 + 1;

            }
            else if(player2){
                b2.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line2_o = line2_o + 1;
                line4_o = line4_o + 1;

            }
            }
            a2= 1;
            result();

        }
    
    
    });
    
    

    
    b3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a3 == 0){
            if (player1)
            {
                b3.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line3 = line3 + 1;
                line4 = line4 + 1;
                line8 = line8 + 1;
            }
            else if(player2){
                b3.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line3_o = line3_o + 1;
                line4_o = line4_o + 1;
                line8_o = line8_o + 1;

            }
            }
            a3= 1;
            result();

        }
    
    
    });
    
    
    
    
    b4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a4 == 0){
            if (player1)
            {
                b4.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line1 = line1 + 1;
                line5 = line5 + 1;
            }
            else if(player2){
                b4.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line1_o = line1_o + 1;
                line5_o = line5_o + 1;
            }
            }
            a4= 1;
            result();

        }
    
    
    });
    
    
    
    
    
    b5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a5 == 0){
            if (player1)
            {
                b5.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line2 = line2 + 1;
                line5 = line5 + 1;
                line7 = line7 + 1;
                line8 = line8 + 1;
            }
            else if(player2){
                b5.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line2_o = line2_o + 1;
                line5_o = line5_o + 1;
                line7_o = line7_o + 1;
                line8_o = line8_o + 1;
            }
            }
            a5= 1;
            result();

        }
    
    
    });
    
    
    

    b6.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a6 == 0){
            if (player1)
            {
                b6.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line3 = line3 + 1;
                line5 = line5 + 1;
            }
            else if(player2){
                b6.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line3_o = line3_o + 1;
                line5_o = line5_o + 1;
            }
            }
            a6= 1;
            result();

        }
    
    
    });
    
    
    
    
    b7.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a7 == 0){
            if (player1)
            {
                b7.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line1 = line1 + 1;
                line6 = line6 + 1;
                line8 = line8 + 1;
            }
            else if(player2){
                b7.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line1_o = line1_o + 1;
                line6_o = line6_o + 1;
                line8_o = line8_o + 1;
            }
            }
            a7= 1;
            result();

        }
    
    
    });
    
    
    

    b8.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a8 == 0){
            if (player1)
            {
                b8.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line2 = line2 + 1;
                line6 = line6 + 1;

            }
            else if(player2){
                b8.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line2_o = line2_o + 1;
                line6_o = line6_o + 1;
            }
            }
            a8= 1;
            result();

        }
    
    
    });
    
    
    
    
    
    b9.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(a9 == 0){
            if (player1)
            {
                b9.setIcon(image1_x);
                player1 = false;
                player2 = true;
                line3 = line3 + 1;
                line6 = line6 + 1;
                line7 = line7 + 1;
            }
            else if(player2){
                b9.setIcon(image2_o);
                player2 = false;
                player1 = true;
                line3_o = line3_o + 1;
                line6_o = line6_o + 1;
                line7_o = line7_o + 1;
            }
            }
            a9= 1;
            result();
        }
    
    
    });
 
// -----------------------------------------------------------------------------

    new_game.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
        //Here For New Game
        close_gd3na();
        }

});
    
    exit_game.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
           Go_Back();
        }
        
    });
    


    
    
    
    
    
    
    
    
    
    
    
    }
    
    private void invis(){
        setVisible(false);
    }
    
    public void Go_Back(){
        super.dispose();
        new Choose(money,name).setVisible(true);
    }
    
    
    public void close_gd3na(){
        super.dispose();
        new GUI_T3(money,name);
    }
    
    public void result(){
        if (line1 == 3 || line2 == 3 || line3 == 3 || line4 == 3 || line5 == 3 || line6 == 3 || line7 == 3 || line8 == 3){
        JOptionPane.showMessageDialog(null, "!! The Winner in this game is X !!");
        
        player1 = false;
        player2 = false;
        }
        else if(line1_o == 3 || line2_o == 3 || line3_o == 3 || line4_o == 3 || line5_o == 3 || line6_o == 3 || line7_o == 3 || line8_o == 3){
        JOptionPane.showMessageDialog(null, "!! The Winner in this game is O !!");
        
        player1 = false;
        player2 = false;
        }
        
    }

    private void vis(){
        setVisible(true);
    }
    
public class XO_Learn extends JFrame{
    JTextArea t = new JTextArea();
    JButton b = new JButton("Back");  
    JPanel p =new JPanel();
    public XO_Learn() {
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
            vis();
        }
    }



}





}//END OF THE CLASS
