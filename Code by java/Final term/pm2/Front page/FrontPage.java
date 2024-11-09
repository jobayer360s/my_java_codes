import javax.swing.*;
import java.lang.*;
import java.awt.*;

public class FrontPage extends JFrame {
    /*MD JOBAYER SHAIKH, 23-50647-1 */
    JLabel  name1 , name2 , name3 , name4 , name5 , name6 , name7;
    Font f1, f2;
    JButton bt1 , bt2 , bt3, bt4;
    JPanel panel;
    ImageIcon  image1 , image2, image3 , image4, image5 , image6;

    FrontPage(){
         super("Front Page");
        this.setBounds(450,180,1100,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
		
        name1 = new JLabel("Welcome to Star Cineplext Ticketing System");
        name1.setBounds(100,30,850,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);

        image1 = new ImageIcon("LoginIcon.png");
        bt1 = new JButton(image1);
        bt1.setBounds(820,130,64,64);
        panel.add(bt1);

       name2 = new JLabel(" Login");
       name2.setBounds(890,140,100,50);
       f2 = new Font("Cambria", Font.BOLD, 30);
       name2.setFont(f2);
       name2.setForeground(Color.BLACK);
       panel.add(name2);
      
       image2 = new ImageIcon("signupIcon.png");
       bt2 = new JButton(image2);
       bt2.setBounds(820,240,60,60);
       panel.add(bt2);

        name3 = new JLabel(" Sign Up");
       name3.setBounds(890,245,120,50);
       name3.setFont(f2);
       name3.setForeground(Color.BLACK);
       panel.add(name3);
       
       image3 = new ImageIcon("supportIcon.png");
       bt3 = new JButton(image3);
       bt3.setBounds(820,340,60,60);
       panel.add(bt3);

       name4 = new JLabel(" Support");
       name4.setBounds(890,345,130,50);
       name4.setForeground(Color.BLACK);
       name4.setFont(f2);
       panel.add(name4);

       
       image4 = new ImageIcon("aboutUsIcon.png");
       bt4 = new JButton(image4);
       bt4.setBounds(820,440,60,60);
       panel.add(bt4);

       name5 = new JLabel(" About Us");
       name5.setBounds(890,445,140,50);
       name5.setFont(f2);
       name5.setForeground(Color.BLACK);
       panel.add(name5);
      
      
       image5 = new ImageIcon("StarCineplexLogo.png");
       name6 = new JLabel(image5);
       name6.setBounds(250,200,416,203);
       panel.add(name6);
        

       image6 = new ImageIcon("Background.jpg");
       name7 = new JLabel(image6);
       name7.setBounds(0,0,1100,700);
       panel.add(name7);

      
        this.add(panel);

    }
    
}
