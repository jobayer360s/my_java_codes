import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    JLabel  name1 , logoLabel ,bgLabel;
    Font f1, f2;
    JTextArea adminId;
    JPasswordField password;
    JButton bt0 ,userDataButton, adminpassButton , backButton;
    JPanel panel;
    ImageIcon logo, bgimage ;

      public Admin(){
		  //22-50647-1
		  
        super("Admin");
        this.setBounds(650,180,650,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
		 f1 = new Font("Cambria", Font.BOLD, 40);
        f2 = new Font("Cambria", Font.BOLD, 30);
        
       
      

        name1 = new JLabel("Admin Pannel");
        name1.setBounds(200,30,450,50);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1); 
       
        logo = new ImageIcon("AdminUserLogo.png");
        logoLabel = new JLabel(logo);
        logoLabel.setBounds(180,130,300,290);
       panel.add(logoLabel);


       bt0 = new JButton();
       bt0.setBounds(0,0,0,0);
       bt0.setForeground(Color.BLACK);
       panel.add(bt0); 
       
       userDataButton = new JButton("USER DATA");
       userDataButton.setBounds(50,470,230,45);
       userDataButton.setFont(f2);
       userDataButton.setForeground(Color.BLACK);
       panel.add(userDataButton); 
       
       adminpassButton = new JButton("Admin PassWord");
       adminpassButton.setBounds(300,470,300,45);
       adminpassButton.setFont(f2);
       adminpassButton.setForeground(Color.BLACK);
       panel.add(adminpassButton); 
       
       backButton = new JButton("Back");
       backButton.setBounds(230,550,150,45);
       backButton.setFont(f2);
       backButton.setForeground(Color.BLACK);
       panel.add(backButton); 

      
    

       bgimage = new ImageIcon("Background.jpg");
       bgLabel = new JLabel(bgimage);
       bgLabel.setBounds(0,0,1100,700);
       panel.add(bgLabel);

      
        this.add(panel);

    }


}