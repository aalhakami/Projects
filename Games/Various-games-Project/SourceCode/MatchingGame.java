package project_login_page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import javax.swing.Timer;


public class MatchingGame extends JFrame{
    double money;
    String name;
    double playermoney = 0;
    action act = new action();
    JPanel p1 = new JPanel(); 
    JPanel p2 = new JPanel(); 
    JPanel p3 = new JPanel();
    JLabel l = new JLabel(); 
    JButton[] Bs = new JButton[24]; 
    JMenuBar mb;
    JMenu m;
    JMenuItem mi;
    JButton b = new JButton("Back");
    
    int chanceCounter = 0; 
    List<Color> colorList = Arrays.asList(Color.pink, Color.MAGENTA, new Color(2, 1, 121), Color.red, Color.yellow, Color.black,
    Color.orange, Color.green,Color.cyan, Color.GRAY ,Color.DARK_GRAY,new Color(58, 142, 78));

    List<Color> memoryList = new ArrayList<>();
    LinkedList<Color> selected = new LinkedList<>();
    int lastButtonIndex;

    public MatchingGame(double mon,String nme){
        name = nme;
        money = mon;
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(600, 400);
        super.setTitle("Color Matching");

        ComponantSetting();
        mb = new JMenuBar();
        m = new JMenu("How To Play");
        mi = new JMenuItem("Color Matching");
        m.add(mi);
        mb.add(m);
        mi.addActionListener(new howtoplaymenuitem());
        super.setJMenuBar(mb);
        b.addActionListener(new back());

        p1.add(l);
        p3.add(b);
        super.add(p1, BorderLayout.NORTH);
        super.add(p3, BorderLayout.SOUTH);
        super.add(p2);
        super.setVisible(true);
        super.setResizable(false);
        
        startGame();
    }
    private void startGame() {
        memoryList.addAll(colorList);
        memoryList.addAll(colorList);
        Collections.shuffle(memoryList);
    }
    public void disableEnableButtons(boolean flag) {
        for (JButton B : Bs) {
            if (flag) {
                B.addActionListener(act);
            } else {
                B.removeActionListener(act);
            }
        }
    }

    private void ComponantSetting() {
        l.setBackground(new Color(62, 114, 161));
        l.setForeground(new Color(245, 212, 39));
        l.setFont(new Font("AvantGarde", Font.BOLD, 30));
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setText("Guesses: " + chanceCounter);
        l.setOpaque(true);
        p1.setLayout(new BorderLayout());
        p1.setBounds(0, 0, 800, 40);
        p2.setLayout(new GridLayout(6, 4));
        p2.setBackground(new Color(150, 150, 150));
        
        b.setBackground(new Color(62, 114, 161));
        b.setForeground(new Color(245, 212, 39));
        b.setFont(new Font("AvantGarde", Font.BOLD, 30));
        b.setHorizontalAlignment(JButton.CENTER);
        b.setOpaque(true);
        p3.setLayout(new BorderLayout());
        p3.setBounds(0, 0, 800, 40);
        
        // loop to create buttons 24 buttons required for 6x4 grid
        for (int i = 0; i < Bs.length; i++) {
            Bs[i] = new JButton();
            p2.add(Bs[i]);
            Bs[i].setFont(new Font("AvantGarde", Font.BOLD, 30));
            Bs[i].setBackground(Color.white);
            Bs[i].setFocusable(false);
            Bs[i].addActionListener(act);
        }
    }
    private class howtoplaymenuitem implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            invis();
            ColorMatching colorMatching = new ColorMatching();
            
        }
        
    }
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object[] option = { "Continue playing", "I'm Sure" };
            int n = JOptionPane.showOptionDialog(null,
            "if you start the game you will lose your progress","Are you suur you want to Exit?"
            ,JOptionPane.CANCEL_OPTION,JOptionPane.YES_NO_OPTION, null, option,option[0]);
            if(n == 1){
                dis();
                //call havefun frame 
                money = money + playermoney;

                new Choose(money,name).setVisible(true);
            }

        }
        
    }
    private void  dis(){
       dispose();
    }
    private void invis(){
        setVisible(false);
    }
    private void vis(){
        setVisible(true);
    }
    // check whether the game is completed
    private void checkGameStatus() {
        if (selected.size() == 24) {
            int n;

                
            Object[] option = { "New Game", "Back" };
            if(chanceCounter <= 70){
                if(chanceCounter <= 35){
                    n = JOptionPane.showOptionDialog(null,"You completed the game in " 
                    + chanceCounter + " guesses\n congrats you got $1000",
                    "Congratulations",1,3, null, option,option[0]);
                    playermoney =+ 1000;
                }else if(chanceCounter <= 50){
                    n = JOptionPane.showOptionDialog(null,"You completed the game in " 
                    + chanceCounter + " guesses\n congrats you got $500",
                    "Congratulations",1,3, null, option,option[0]);   
                    playermoney =+ 500;
                }else{
                    n = JOptionPane.showOptionDialog(null,"You completed the game in " 
                    + chanceCounter + " guesses\n congrats you got $250",
                    "Congratulations",1,3, null, option,option[0]);   
                    playermoney =+ 250;                    
                }
            }else{
                n = JOptionPane.showOptionDialog(null,"You completed the game in " + chanceCounter + " guesses\n congrats you got $100",
                "Congratulations",1,3, null, option,option[0]);
                playermoney =+ 100;
            }
            if (n == 0) {
                super.dispose();
                money = money + playermoney;
                new Set_money(money,name);
                new MatchingGame(money,name);
            } else {
                super.dispose();
                // havefun frame(playermoney) 
                money = money + playermoney;
                new Set_money(money,name);
                new Choose(money,name).setVisible(true);
                
            }
        }

    }
    private class action implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < Bs.length; i++) {
                if (e.getSource() == Bs[i]) {
                    if (!colorList.contains(Bs[i].getBackground())) {
                        // check if selected color matches with the last selected
                        if (selected.size() > 0 && (selected.size() % 2 == 1) && !(selected.contains(memoryList.get(i)))) {
                            chanceCounter++;
                            selected.removeLast();
                            Bs[i].setBackground(memoryList.get(i));
                            int currentIndex = i;

                            disableEnableButtons(false);

                            // timer to hide the color if incorrect color is selected
                            Timer timer = new Timer(500, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    disableEnableButtons(true);
                                    Bs[currentIndex].setBackground(Color.white);
                                    Bs[lastButtonIndex].setBackground(Color.white);
                                }
                            });
                            timer.setRepeats(false);
                            timer.start();

                        } else {
                            chanceCounter++;
                            lastButtonIndex = i;
                            selected.add(memoryList.get(i));
                            Bs[i].setBackground(memoryList.get(i));
                        }

                        l.setText("Guesses: " + chanceCounter);
                        checkGameStatus();
                    }

                }
            }
    }
    } 
    private class ColorMatching extends JFrame{
    JTextArea t = new JTextArea();
    JButton b = new JButton("back"); 
    JPanel p =new JPanel();
    public ColorMatching(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("How to play Matching Game");
        super.setLocationRelativeTo(null);
        Setting();
        howtoplay();
        add(p,BorderLayout.SOUTH);
        add(t);        
        pack();
        setVisible(true);        
    }  

    private void howtoplay() {
        t.setText("In this game there are 12 color and each color has a pair so we have 24 square\n"
                + "your jab is to match all the color with it pair with as little guess as possible\n"
                + "if got 35 guesses or less you will get $1000\n"
                + "if got 50 guesses or less you will get $500\n "
                + "if got 70 guesses or less you will get $100\n"
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
            vis();
        }
    }

}


}