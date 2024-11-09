package classes;
import images.*;
import javax.swing.*;
import java.awt.*;

public class RedeemGiftCard extends JFrame {
     /*MD JOBAYER SHAIKH, 23-50647-1 */
    JPanel panel;
    JLabel tittle, name1,name2, backgroundLabel;
    JTextField text1;
    Font f1, f2 , f3;
    JButton  bt0 ,bt1 ;
    ImageIcon  bgImage , image1;


    RedeemGiftCard(){
    super("Redeem gift card ");
    this.setBounds(450,180,1100,700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    panel = new JPanel();
    panel.setLayout(null);


    image1 = new ImageIcon("StarCineplexLogo.png");
    name1 = new JLabel(image1);
    name1.setBounds(120,200,416,203);
    panel.add(name1);
    

    tittle = new JLabel("Redeem Your Gift Card ");
    tittle.setBounds(300,50,500,50);
    f1 = new Font("Cambria", Font.BOLD, 45);  
    tittle.setFont(f1);
    panel.add(tittle);


    name2 = new JLabel("Enter your Gift card Code");
    name2.setBounds(620,110,400,200);
    f2 = new Font("Cambria", Font.BOLD, 30);  
    name2.setFont(f2);
    panel.add(name2);
    
    text1 = new JTextField();
    text1.setBounds(620,250,360,50);  
    text1.setFont(f2);
    panel.add(text1);

    bt0 = new JButton();
    bt0.setBounds(0,0,0,0);
    panel.add(bt0);
   
     f3 = new Font("Cambria", Font.BOLD, 20); 
    bt1 = new JButton("Redeem");
    bt1.setBounds(720,320,120,50);
    bt1.setFont(f3);
    panel.add(bt1);

    bgImage= new ImageIcon("Background.jpg");
    backgroundLabel = new JLabel(bgImage);
    backgroundLabel.setBounds(0,0,1100,700);
    panel.add(backgroundLabel);

    this.add(panel);

    }



}
