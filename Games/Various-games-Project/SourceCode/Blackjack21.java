
package project_login_page;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Blackjack21 extends JFrame{


    String name;
    JLabel l1,l2,l3,l4, l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,L1,L2;
    JTextField t1,t2;
    JPanel p1,p2,p3, p4, p5,p6,p7,p8,p9,p10,p16,p17,p18;//Center
    JPanel p11,p12,p13,p14,p15;//West
    JButton b1,b2,b3,b4,b5;
    ImageIcon pc1,pc2;
    JMenuBar mb;
    JMenu m;
    JMenuItem mi;
    ArrayList<ImageIcon> cardImageList ;
    Random rand = new Random();
    double bet;
    int playerpoint,DealerPoint ,DealerPoint1;
    int clicked ,clicked1 = 0,clicked2, DHC ,point ;
    double playermoney;
    public Blackjack21(double playerM , String nme){
      name = nme;
      setTitle("BlackJack 21");
      setDefaultCloseOperation(3);
      //setLocationRelativeTo(null);
      playermoney = playerM;
      buildCardImageList();
      CreateComponant();
      ComponantSetting();
      PanelsComponants();
      componantAction();
      super.setJMenuBar(mb);
      p13.setBackground(new Color(6, 131, 10));
      add(p13);
      pack();
      setSize(1200,600);
      setVisible(true);   
      setResizable(false);
    }
    private void CreateComponant(){
        //creating Labeles
        l1 = new JLabel("Player Money:");
        l2 = new JLabel();
        l3 = new JLabel("Your Bet: ");
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l11 = new JLabel();
        l12 = new JLabel();
        l13 = new JLabel();
        l14 = new JLabel();
        l15 = new JLabel();
        L1 = new JLabel("Player Cards:");
        L2 = new JLabel("Dealer Cards:");
        //creating TextFields
        t1 = new JTextField(7);
        t2 = new JTextField(""+playermoney,7);
        t2.setEditable(false);
        //creating Panels
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();
        p11 = new JPanel();
        p12 = new JPanel();
        p13 = new JPanel();
        p14 = new JPanel();
        p15 = new JPanel();
        p16 = new JPanel();
        p17 = new JPanel();
        p18 = new JPanel();
        //creating Buttons
        b1 = new JButton("Hit");
        b2 = new JButton("Stand");
        b3 = new JButton("Play agine");
        b4  = new JButton("Drow a card");
        b5 = new JButton("Back");
        b3.setVisible(false);
        b2.setVisible(false);
        b1.setVisible(false);
        //creating menu
        mb = new JMenuBar();
        m = new JMenu("How To Play");
        mi = new JMenuItem("Black jack 21 ");
        m.add(mi);
        mb.add(m);
   }
    private void ComponantSetting(){
      L1.setForeground(new Color(245, 212, 39));
      L1.setFont(new Font("Ink Free", Font.BOLD, 20));
      
      L2.setForeground(new Color(245, 212, 39));
      L2.setFont(new Font("Ink Free", Font.BOLD, 20));
      
      l1.setForeground(new Color(245, 212, 39));
      l1.setFont(new Font("Ink Free", Font.BOLD, 20));
      l3.setForeground(new Color(245, 212, 39));
      l3.setFont(new Font("Ink Free", Font.BOLD, 20));
      
      l14.setFont(new Font("Ink Free", Font.BOLD, 25));
      l14.setForeground(new Color(245, 212, 39));
      
      
      l15.setFont(new Font("Ink Free", Font.BOLD, 25));
      l15.setForeground(new Color(245, 212, 39));

      b1.setBorder(BorderFactory.createLineBorder(new Color(245, 212, 39)));
      b1.setForeground(new Color(245, 212, 39));
      b1.setBackground(Color.black);
      b1.setFont(new Font("Ink Free", Font.BOLD, 15));      
      b1.setMnemonic(KeyEvent.VK_H);
      
      b2.setBorder(BorderFactory.createLineBorder(new Color(245, 212, 39)));
      b2.setForeground(new Color(245, 212, 39));
      b2.setBackground(Color.black);
      b2.setFont(new Font("Ink Free", Font.BOLD, 15));      
      b2.setMnemonic(KeyEvent.VK_S);
      
      b3.setBorder(BorderFactory.createLineBorder(new Color(245, 212, 39)));
      b3.setForeground(new Color(245, 212, 39));
      b3.setBackground(Color.black);
      b3.setFont(new Font("Ink Free", Font.BOLD, 15));      
      b3.setMnemonic(KeyEvent.VK_P);
      
      b4.setBorder(BorderFactory.createLineBorder(new Color(245, 212, 39)));
      b4.setForeground(new Color(245, 212, 39));
      b4.setBackground(Color.black);
      b4.setFont(new Font("Ink Free", Font.BOLD, 15));      
      b4.setMnemonic(KeyEvent.VK_D);
      
      b5.setBorder(BorderFactory.createLineBorder(new Color(245, 212, 39)));
      b5.setForeground(new Color(245, 212, 39));
      b5.setBackground(Color.black);
      b5.setFont(new Font("Ink Free", Font.BOLD, 15));
      b5.setMnemonic(KeyEvent.VK_B);
      
   }
    private void PanelsComponants(){
        GridLayout gl = new GridLayout(1,2);
        ///////////////CENTER/////////////////
        //Panel 1 componant
        p14.setBackground(new Color(58, 142, 78));
        p15.setBackground(new Color(58, 142, 78));
        p14.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.setLayout(new GridLayout(2,1));
        p14.add(L1);
        p15.add(l14);
        p1.add(p14);
        p1.add(p15);
        //Panel 2 componant
        //p2 is for the playercards 
        p2.setBackground(new Color(58, 142, 78));
        p2.setLayout(new GridLayout(1,5));
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        //Panel 3 componant
        p3.setLayout(gl);
        p3.add(p1);
        p3.add(p2);
        //Panel 4 componant
        p17.setLayout(new FlowLayout(FlowLayout.LEFT));
        p17.setBackground(new Color(58, 142, 78));
        p18.setBackground(new Color(58, 142, 78));
        p4.setLayout(new GridLayout(2,1));
        p17.add(L2);
        p18.add(l15);
        p4.add(p17);
        p4.add(p18);
        //Panel 5 componant
        //p5 is for the Delarcards 
        p5.setBackground(new Color(58, 142, 78));
        p5.setLayout(new GridLayout(1,5));
        p5.add(l9);
        p5.add(l10);
        p5.add(l11);
        p5.add(l12);
        p5.add(l13);
        //Panel 6 componant
        p6.setLayout(gl);
        p6.add(p4);
        p6.add(p5);
        //Panel 7 componant
        p7.setLayout(new GridLayout(2,1));
        p7.add(p3);
        p7.add(p6);
        ////////////////west///////////////////
        //Panel 8 componant
        p8.setBackground(new Color(58, 142, 78));
        p8.add(l3);
        p8.add(t1);
        //Panel 9 componant
        p9.setBackground(new Color(58, 142, 78));
        p9.add(b1);
        p9.add(b2);
        p9.add(b3);       
        p9.add(b4);
        //Panel 10 componant
        p16.setBackground(new Color(58, 142, 78));
        p16.add(b5);
        //Panel 10 componant
        p10.setBackground(new Color(58, 142, 78));
        p10.setLayout(new GridLayout(3,1));
        p10.add(p8);
        p10.add(p9);
        p10.add(p16);
        //Panel 11 componant
        p11.setBackground(new Color(58, 142, 78));
        p11.add(l1);
        p11.add(t2);
        //Panel 12 componant
        p12.setLayout(new GridLayout(2,1));
        p12.add(p11);
        p12.add(p10);
        //Panel 13 componant
        p13.setLayout(new BorderLayout());
        p13.add(p7);
        p13.add(p12,BorderLayout.WEST);
        
        
   }   
    private void componantAction() {
       b1.addActionListener(new hitbutton());
       b2.addActionListener(new standbutton());
       b3.addActionListener(new PAButton());
       b4.addActionListener(new drowButton());
       b5.addActionListener(new BackButton());
       mi.addActionListener(new howtoplaymenuitem());
    }  
    private int  Cardpoint (int cardIndex,int s){
        int CardValue = 0;
        switch(cardIndex){
            case 0:case 1:case 2:case 3:
                CardValue =CardValue+ 2;
                break;
            case 4:case 5:case 6:case 7:
               CardValue =CardValue+ 3;
                  break;                              
            case 8:case 9:case 10:case 11:
                CardValue =CardValue+ 4;
                  break;
            case 12:case 13:case 14:case 15:
                CardValue =CardValue+ 5;
                  break;  
            case 16:case 17:case 18:case 19:
                CardValue =CardValue+ 6;
                  break;  
            case 20:case 21:case 22:case 23:
                CardValue =CardValue+ 7;
                  break;  
            case 24:case 25:case 26:case 27:
                CardValue =CardValue+ 8;
                  break;  
            case 28:case 29:case 30:case 31:
                CardValue =CardValue+ 9;
                  break;  
            case 32:case 33:case 34:case 35:
                CardValue =CardValue+ 10;
                  break;  
            case 36:case 37:case 38:case 39:
                CardValue =CardValue+ 10;
                  break;  
            case 40:case 41:case 42:case 43:
               CardValue =CardValue+ 10;
                  break;  
            case 44:case 45:case 46:case 47:
                CardValue =CardValue+ 10;
                  break;
            case 48:case 49:case 50:case 51:
                if(s == 1){
                    if (playerpoint > 10){
                        CardValue= CardValue+ 1;
                    }
                    else if(playerpoint <= 10){
                        CardValue= CardValue+ 11;
                    }
                }else{
                    if (DealerPoint  > 10){
                        CardValue= CardValue+ 1;
                    }
                    else if(DealerPoint <= 10){
                        CardValue= CardValue+ 11;
                    }
                }    
                    
                  break;
            default:
                try{
                    throw new Exception();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"No card Found :(\n"
                      + "press play again");
                }
        }
        return CardValue;
    }
    private int  theWinner(){
       int theWinner ;
       if(playerpoint > DealerPoint)//player win
           theWinner = 0;
       else if(playerpoint < DealerPoint && DealerPoint < 22)//Dealer win
           theWinner = 1;
       else // push or Tie
           theWinner = 2;
       
       return theWinner;
   }
    private void buildCardImageList(){
        cardImageList= new ArrayList<>() ;
       
      cardImageList.add(new ImageIcon("2_Clubs.jpg"));
      cardImageList.add(new ImageIcon("2_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("2_Hearts.jpg"));
      cardImageList.add(new ImageIcon("2_Spades.jpg"));

      cardImageList.add(new ImageIcon("3_Clubs.jpg"));
      cardImageList.add(new ImageIcon("3_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("3_Hearts.jpg"));
      cardImageList.add(new ImageIcon("3_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("4_Clubs.jpg"));
      cardImageList.add(new ImageIcon("4_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("4_Hearts.jpg"));
      cardImageList.add(new ImageIcon("4_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("5_Clubs.jpg"));
      cardImageList.add(new ImageIcon("5_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("5_Hearts.jpg"));
      cardImageList.add(new ImageIcon("5_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("6_Clubs.jpg"));
      cardImageList.add(new ImageIcon("6_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("6_Hearts.jpg"));
      cardImageList.add(new ImageIcon("6_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("7_Clubs.jpg"));
      cardImageList.add(new ImageIcon("7_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("7_Hearts.jpg"));
      cardImageList.add(new ImageIcon("7_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("8_Clubs.jpg"));
      cardImageList.add(new ImageIcon("8_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("8_Hearts.jpg"));
      cardImageList.add(new ImageIcon("8_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("9_Clubs.jpg"));
      cardImageList.add(new ImageIcon("9_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("9_Hearts.jpg"));
      cardImageList.add(new ImageIcon("9_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("10_Clubs.jpg"));
      cardImageList.add(new ImageIcon("10_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("10_Hearts.jpg"));
      cardImageList.add(new ImageIcon("10_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Jack_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Jack_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Jack_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Jack_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Queen_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Queen_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Queen_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Queen_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("King_Clubs.jpg"));
      cardImageList.add(new ImageIcon("King_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("King_Hearts.jpg"));
      cardImageList.add(new ImageIcon("King_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Ace_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Ace_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Ace_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Ace_Spades.jpg"));
                                                   
   }
    public  double getPlayerMoney(){
       return playermoney;
   }
    private void  dis(){
       dispose();
   }
    private void vis(){
        setVisible(true);
    }
    private void invis(){
        setVisible(false);
    }
    private class howtoplaymenuitem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            invis();
            BJ21 bJ21 = new BJ21();
        }
        
    }
    private class drowButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
                boolean E = true;
                try{   
                    playermoney = Double.parseDouble(t2.getText());
                    bet = Double.parseDouble(t1.getText());
                    if(bet <= playermoney ){
                        if(bet > 0){
                            playermoney = playermoney- bet;
                            t1.setText("");
                            t2.setText(""+playermoney);  
                            new Set_money(playermoney,name);
                        }else
                            throw new NumberFormatException();
                    }else{
                        JOptionPane.showMessageDialog(null,
                             "You don't have this much");
                        t1.setText(null);
                        E = false;                     
                    }
                }catch(NumberFormatException n){
                    n.getStackTrace();
                   JOptionPane.showMessageDialog(null,
                        "please Enter how much do want to bet as a Positive number");
                    t1.setText(null);
                    E = false; 

                }
                if(!cardImageList.isEmpty() && E){ 
                    //player First hand
                    int index = rand.nextInt(cardImageList.size());
                    pc1 = cardImageList.get(index);
                    l4.setIcon(pc1);
                    int index1 = rand.nextInt(cardImageList.size());
                    pc1 = cardImageList.get(index1);
                    l5.setIcon(pc1);
                    playerpoint = Cardpoint(index,1)+Cardpoint(index1,1);
                    l14.setBorder(BorderFactory.createTitledBorder
                    (BorderFactory.createLineBorder(Color.white), "Point"));
                    l14.setText("You have "+playerpoint+" Point");
                    cardImageList.remove(index);
                    cardImageList.remove(index1);
                    //Dealer First hand
                    int index2 = rand.nextInt(cardImageList.size());
                    int DHC1 = rand.nextInt(cardImageList.size());
                    pc1 = cardImageList.get(index2);
                    l9.setIcon(pc1);
                    l10.setIcon(new ImageIcon("Backface_Red.Jpg"));
                    DealerPoint = Cardpoint(index2,0);
                    l15.setBorder(BorderFactory.createTitledBorder
                    (BorderFactory.createLineBorder(Color.white), "Point"));
                    l15.setText("The dealer has "+DealerPoint+" Point \nand a hiden card");
                    DHC = DHC1 ;
                    clicked1++;
                    cardImageList.remove(index2);
                    DealerPoint1 = Cardpoint(index2,0) +Cardpoint(DHC1,0);
                    //System.out.println(DealerPoint1);
                    if(DealerPoint1 == 21 && playerpoint == 21){
                        JOptionPane.showMessageDialog(null,
                            "Playing Result:\nyou have 21 and the dealer has 21 it's a push(Tie)");
                        playermoney = playermoney+ bet;
                        t2.setText(""+playermoney);
                        new Set_money(playermoney,name);
                        pc1 = cardImageList.get(DHC);
                        l10.setIcon(pc1);
                        DealerPoint =+Cardpoint(DHC,0);
                        l15.setText("the Dealer has"+DealerPoint+" Point");
                        b3.setVisible(true);
                        b1.setVisible(false);
                        b2.setVisible(false);                        
                    }else if(playerpoint == 21){
                        JOptionPane.showMessageDialog(null,
                            "Playing Result:\nYou have 21 from the first hand You win");
                        playermoney = playermoney+ (bet*2.5);
                        t2.setText(""+playermoney);
                        new Set_money(playermoney,name);
                        pc1 = cardImageList.get(DHC);
                        l10.setIcon(pc1);
                        DealerPoint = DealerPoint +Cardpoint(DHC,0);
                        l15.setText("the Dealer has"+DealerPoint+" Point");
                        b3.setVisible(true);
                        b1.setVisible(false);
                        b2.setVisible(false);                        
                    }else if(DealerPoint1 == 21){
                        JOptionPane.showMessageDialog(null,
                        "Playing Result:\nthe Dealer has 21 from the first hand the dealer win");
                        pc1 = cardImageList.get(DHC);
                        l10.setIcon(pc1);
                        DealerPoint = DealerPoint +Cardpoint(DHC,0);
                        l15.setText("the Dealer has"+DealerPoint+" Point");
                        b3.setVisible(true);
                        b1.setVisible(false);
                        b2.setVisible(false);
                    }
                    b4.setVisible(false);
                    b1.setVisible(true);
                    b2.setVisible(true);
                }  
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null,
                    "An Error has occur:\nPlease press the play again button");
                        b3.setVisible(true);
                        b4.setVisible(false);
                        b2.setVisible(false);
                        b1.setVisible(false);
                        playermoney =+ bet;
            }
        }
            
            
    }  
    private class hitbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           try{ 
                if(clicked1 == 1 && clicked2 == 0  ){
                    clicked++;
                    if(clicked == 1 &&(!cardImageList.isEmpty() || playerpoint < 22)){ 
                        int index = rand.nextInt(cardImageList.size());
                        pc1 = cardImageList.get(index);
                        l6.setIcon(pc1);
                        int s = Cardpoint(index,1);
                        playerpoint = playerpoint +s;
                        l14.setText("You have "+playerpoint+" Point");
                        cardImageList.remove(index);
                        if (playerpoint >= 22){
                        JOptionPane.showMessageDialog(null,
                                    "Playing Result:\nYou have more than 21");
                            pc1 = cardImageList.get(DHC);
                            l10.setIcon(pc1);
                            DealerPoint = DealerPoint+Cardpoint(DHC,0);
                            l15.setText("the Dealer has"+DealerPoint+" Point");
                            b3.setVisible(true);
                            b2.setVisible(false);
                            b1.setVisible(false);                         
                        }                    
                    }else if(clicked == 2 &&(!cardImageList.isEmpty() || playerpoint < 22)){
                       int index = rand.nextInt(cardImageList.size());
                        pc1 = cardImageList.get(index);
                        l7.setIcon(pc1);
                        playerpoint = playerpoint +Cardpoint(index,1);
                        l14.setText("You have "+playerpoint+" Point");
                        cardImageList.remove(index);
                        if (playerpoint >= 22){
                        JOptionPane.showMessageDialog(null,
                                    "Playing Result:\nYou have more than 21");
                            pc1 = cardImageList.get(DHC);
                            l10.setIcon(pc1);
                            DealerPoint = DealerPoint+Cardpoint(DHC,0);
                            l15.setText("the Dealer has"+DealerPoint+" Point");
                            b3.setVisible(true);
                            b2.setVisible(false);
                            b1.setVisible(false);                         
                        }
                    }else if(clicked == 3 &&(!cardImageList.isEmpty() || playerpoint < 22)){
                       int index = rand.nextInt(cardImageList.size());
                        pc1 = cardImageList.get(index);
                        l8.setIcon(pc1);
                        playerpoint = playerpoint +Cardpoint(index,1);
                        l14.setText("You have "+playerpoint+" Point");
                        cardImageList.remove(index);
                        if (playerpoint >= 22){
                            JOptionPane.showMessageDialog(null,
                                    "Playing Result:\nYou have more than 21 The dealer win");
                            pc1 = cardImageList.get(DHC);
                            l10.setIcon(pc1);
                            DealerPoint = DealerPoint+Cardpoint(DHC,0);
                            l15.setText("the Dealer has"+DealerPoint+" Point");
                            b3.setVisible(true);
                            b2.setVisible(false);
                            b1.setVisible(false);                        
                        }
                    }else if(clicked <= 4 &&(!cardImageList.isEmpty() || playerpoint < 22)){
                          JOptionPane.showMessageDialog(null,
                                "You can't hit more than 5 cards");
                          
                    }
                }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                    "An Error has occur:\nPlease press the play again  button");
                        b3.setVisible(true);
                        b2.setVisible(false);
                        b1.setVisible(false);                 
            }
        }
        
    }
    private class standbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
                DealerPoint++;
                int index;
                boolean b=true;
                clicked2++;
                if(clicked2 == 1 && clicked1 == 1 && playerpoint <= 21){
                    int Cont = 0;
                    pc1 = cardImageList.get(DHC);
                    l10.setIcon(pc1);
                    DealerPoint = DealerPoint +Cardpoint(DHC,0);
                    l15.setText("the Dealer has"+DealerPoint+" Point");
                    cardImageList.remove(DHC);
                    while(DealerPoint < 17){
                        index = rand.nextInt(cardImageList.size());
                        pc1 = cardImageList.get(index);
                        DealerPoint =DealerPoint+Cardpoint(index,0);
                        l15.setText("Dealer has "+DealerPoint+" Point");                
                        Cont++;
                        switch (Cont) {
                            case 1:
                                l11.setIcon(pc1);
                                break;
                            case 2:
                                l12.setIcon(pc1);
                                break;
                            case 3:
                                l13.setIcon(pc1);
                                break;
                                
                        }
                        cardImageList.remove(index);
                        if(DealerPoint > 21){
                            JOptionPane.showMessageDialog(null,
                                    "Playing Result:\nYou are the winner the delar has more than 21");
                            playermoney =playermoney+ (bet*2);
                            t2.setText(""+playermoney);
                            new Set_money(playermoney,name);
                            b=false;
                            break;
                            
                        }
                        if(Cont == 3){
                            break;
                        }
                    }
                    if(b){
                        switch(theWinner()){
                            case 0:
                                JOptionPane.showMessageDialog(null,
                                        "Playing Result:\nYou have "+playerpoint+" You are the winner");
                                playermoney =playermoney+ (bet*2);
                                t2.setText(""+playermoney);
                                new Set_money(playermoney,name);
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                    "Playing Result:\nthe Dealer has "+DealerPoint+" the dealer win");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        "Playing Result:\nPush(tie)");
                                playermoney = playermoney+ bet;
                                t2.setText(""+playermoney);
                                new Set_money(playermoney,name);
                                break;                    
                        }
                    }    
                    b3.setVisible(true);
                    b2.setVisible(false);
                    b1.setVisible(false);
                }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                    "An Error has occur:\nPlease press the play again  button");
                        b3.setVisible(true);
                        b2.setVisible(false);
                        b1.setVisible(false);                 
            }
        }
        
    }
    private class PAButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            l4.setIcon(null);
            l5.setIcon(null);
            l6.setIcon(null);
            l7.setIcon(null);
            l8.setIcon(null);
            l9.setIcon(null);
            l10.setIcon(null);
            l11.setIcon(null);
            l12.setIcon(null);
            l13.setIcon(null);
            clicked = 0 ;
            clicked1 = 0;
            clicked2 = 0;
            b4.setVisible(true);
            b3.setVisible(false);
            l14.setText(null);
            l15.setText(null);
            l14.setBorder(BorderFactory.createTitledBorder
            (BorderFactory.createEmptyBorder()));
            l15.setBorder(BorderFactory.createTitledBorder
            (BorderFactory.createEmptyBorder()));
            cardImageList.clear();
            buildCardImageList();
        }     
    }
    private class BackButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object[] option = { "Continue playing", "I'm Sure" };
            int n = JOptionPane.showOptionDialog(null,
            "if you start a game you will lose your money ","Are you suur you want to Exit?"
            ,JOptionPane.CANCEL_OPTION,JOptionPane.YES_NO_OPTION, null, option,option[0]);
            if(n == 1){
                dis();
                //call havefun frame
                new Set_money(playermoney,name);
                new Choose(playermoney,name).setVisible(true);
            }
        }
        
    }
    private class BJ21 extends JFrame{
        JTextArea t = new JTextArea();
        JButton b = new JButton("Back"); 
        JPanel p =new JPanel();
        public BJ21(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("How to play BlackJack21");
            //setLocationRelativeTo(null);
            howtoplay();
            Setting();
            add(p,BorderLayout.SOUTH);
            add(t);
            pack();
            setVisible(true);        
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
                vis();
            }
        }

}

}