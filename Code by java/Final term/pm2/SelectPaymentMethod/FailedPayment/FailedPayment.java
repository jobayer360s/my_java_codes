package FailedPayment.*;
import java.lang.*;
import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;

public class FailedPayment extends JFrame {
     /*MD JOBAYER SHAIKH, 23-50647-1 */
    JPanel panel;
    JLabel name1 , name2 , name3, name4, name5 ;
    ImageIcon img1 , img2;
    JButton bt1 , bt2 , bt0;
    Font f1, f2 , f3;

   public FailedPayment(){
       super("Payment failed !");
       
      this.setBounds(650,200,600,400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      

      panel = new JPanel();
      panel.setLayout(null);

      bt0 = new JButton();
      bt0.setBounds(0,0,0,0);
      panel.add(bt0);

      img1 = new ImageIcon("icons8-cancel-94.png");
      name1 = new JLabel(img1);
      name1.setBounds(230,40,94,94);
      panel.add(name1);

      name2 = new JLabel();
      name2 = new JLabel("Payment Failed !");
      name2.setBounds(170,110,1000,94);
      f1 = new Font("Cambria", Font.BOLD, 30);
      name2.setFont(f1);
      panel.add(name2);

      name3 = new JLabel("An error occured. Please Try again");
      name3.setBounds(150,150,300,94);
      panel.add(name3);
      f2 = new Font("Cambria", Font.PLAIN, 20);
      name3.setFont(f2); 

      bt1 = new JButton("Try Again");
      bt1.setBounds(100,240,140,45);  
      f3 = new Font("Cambria", Font.PLAIN,25);
      bt1.setFont(f3);
      panel.add(bt1);

      img2 = new ImageIcon("supportIcon.png");
      name4 = new JLabel(img2);
      name4.setBounds(250,230,130,64);
      panel.add(name4);
  
      bt2 = new JButton("Get Support");
      bt2.setFont(f3);
      bt2.setBounds(350,240,160,45);
      panel.add(bt2);
      
      this.add(panel);

    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == bt1){
      System.exit(0);
    }
    else{
      
    }

   }

}