package CardPayment;
import javax.swing.*;
import java.lang.*;
import java.awt.*;

public class CardPayment extends JFrame {
    /*MD JOBAYER SHAIKH, 23-50647-1 */
    JLabel  name1 , name2 , name3 , name4 , name5 , name6 , backgroundLabel;
    TextField text1, text2 , text3 ;
    JPasswordField password1;
    Font f1, f2;
    JButton bt0 , bt1;
    JPanel panel;
    ImageIcon  image1 , background;
  

   public CardPayment(){
         super("Card Payment ");
        this.setBounds(450,180,1100,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        
  
        
        name1 = new JLabel("Credit / Debit Card Payment");
        name1.setBounds(300,30,850,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);
      
       image1 = new ImageIcon("StarCineplexLogo.png");
       name2 = new JLabel(image1);
       name2.setBounds(120,200,416,203);
       panel.add(name2);
        
       name3 = new JLabel("Card Holder name ");
       f2 = new Font("Cambria", Font.BOLD, 25);
       name3.setBounds(600,180,220,30);
       name3.setFont(f2);
       panel.add(name3);

       text1 = new TextField();
       text1.setBounds(820,180,230,35);
       text1.setFont(f2);
       panel.add(text1);

       name4 = new JLabel("Card Number ");
       name4.setBounds(650,240,160,30);
       name4.setFont(f2);
       panel.add(name4);

       text2 = new TextField();
       text2.setBounds(820,240,230,35);
       text2.setFont(f2);
       panel.add(text2);
       
       name5 = new JLabel("Expairy Date ");
       name5.setBounds(660,300,160,30);
       name5.setFont(f2);
       panel.add(name5);

       text3 = new TextField();
       text3.setBounds(820,300,230,35);
       text3.setFont(f2);
       panel.add(text3);

       name6 = new JLabel("CVC ");
       name6.setBounds(760,360,100,35);
       name6.setFont(f2);
       panel.add(name6);

       password1 = new JPasswordField();
       password1.setBounds(820,360,230,35);
       password1.setFont(f2);
       panel.add(password1);

       bt0 = new JButton();
       bt0.setBounds(0,0,0,0);
       panel.add(bt0);

       bt1 = new JButton("Pay Now ");
       bt1.setBounds(750,430,180,40);
       bt1.setFont(f2);
       panel.add(bt1);

       background = new ImageIcon("Background.jpg");
       backgroundLabel = new JLabel(background);
       backgroundLabel.setBounds(0,0,1100,700);
       panel.add(backgroundLabel);

       
        this.add(panel);

    }
    
}
