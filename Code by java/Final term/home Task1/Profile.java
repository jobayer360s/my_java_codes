import javax.swing.*;
import java.lang.*;
import java.util.*;

public class Profile extends JFrame{
	JPanel panel;
	JLabel label1 , label2 , label3 , label4 , label5 ,label6 , label7, label8 , label9 , label10, label11, label12;
	
	JTextField txt1 , txt2 , txt3 , txt4 , txt5 ;
	JPasswordField pas1 , pas2;
	JButton button1 , button2;
	JRadioButton rb1, rb2;
	JComboBox cb;
	JCheckBox checkBox1 , checkBox2 , checkBox3;
	
    Profile(){
		super("Profile form");
		this.setBounds(500 , 100, 650 , 850);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
     panel = new JPanel();
	 panel.setLayout(null);
	 
	 label1 = new JLabel("Profile ");
	 label1.setBounds(10, 8, 40, 60);
	 panel.add(label1);
	 
	 label2 = new JLabel("Given Name* ");
	 label2.setBounds(10, 60, 100, 20);
	 panel.add(label2);
	 
	 txt1 = new JTextField();
	 txt1.setBounds(10, 80, 200, 30);
	 panel.add(txt1);
	 
	 label3 = new JLabel("Family Name* ");
	 label3.setBounds(10, 120, 100, 20);
	 panel.add(label3);
	 
	 txt2 = new JTextField();
	 txt2.setBounds(10, 140, 200, 30);
	 panel.add(txt2);
	 
	 label4 = new JLabel("Affiliation* ");
	 label4.setBounds(10, 180, 100, 20);
	 panel.add(label4);
	 
	 txt3 = new JTextField();
	 txt3.setBounds(10, 200, 200, 30);
	 panel.add(txt3);
	 
	 label5 = new JLabel("Country* ");
	 label5.setBounds(10, 240, 100, 20);
	 panel.add(label5);
	 
	 String countryName[] = new String[]{"  ","Albenia", "Algeria", "Argentina", "Azarbaizan","Afghanistan ", "Australia" , " Bangladesh " , "Bahrain","Bhutan", "Brazil", "China" ,"Malasiya","Maldeves" ,"Hungery","Nepal","Indonesia", "Italy", "Palestine ","Pakistan","Portugal","India","Russia", "Saudi Aarabia","Sri lanka","United kingdom","United states","Zimbabue"};
	 
	 cb = new JComboBox(countryName);
	 cb.setBounds(10, 260, 280, 30);
	 panel.add(cb);
	
	 
	 label7 = new JLabel("Login ");
	 label7.setBounds(10, 300, 100, 30);
	 panel.add(label7);
	 
	 label8 = new JLabel("Email* ");
	 label8.setBounds(10, 330, 100, 20);
	 panel.add(label8);
	 
	 txt4 = new JTextField();
	 txt4.setBounds(10, 350, 200, 30);
	 panel.add(txt4);
	 
	 label9 = new JLabel("user name* ");
	 label9.setBounds(10, 380, 100, 20);
	 panel.add(label9);
	 
	 txt5 = new JTextField();
	 txt5.setBounds(10, 400, 200, 30);
	 panel.add(txt5);
	 
	 label10 = new JLabel("Passowrd* ");
	 label10.setBounds(10, 440, 100, 20);
	 panel.add(label10);
	 
	 pas1 = new JPasswordField();
	 pas1.setBounds(10, 460, 200, 30);
	 panel.add(pas1);
	 
	 label11 = new JLabel("Repeat Passowrd* ");
	 label11.setBounds(10, 500, 200, 20);
	 panel.add(label11);
	 
	 pas2 = new JPasswordField();
	 pas2.setBounds(10, 520, 200, 30);
	 panel.add(pas2);
	 
	 checkBox1 = new JCheckBox("Yes, I agree to have my data collected and stored according to the privacy statement.");
	 checkBox1.setBounds(8, 570, 1000, 25);
	 panel.add(checkBox1);
	
	 checkBox2 = new JCheckBox("Yes, I would like to be notified of new publications and announcements.");
	 checkBox2.setBounds(8, 600, 1000, 25);
	 panel.add(checkBox2);
	
	 label12 = new JLabel("Would you be willing to review submissions to this journal? ");
	 label12.setBounds(10, 640, 1000, 30);
	 panel.add(label12);
	
	checkBox3 = new JCheckBox("Yes, request the Reviewer role.");
	checkBox3.setBounds(8, 670, 1000, 30);
	panel.add(checkBox3);
	
	
	 button1 = new JButton("Register ");
	 button1.setBounds(10, 710, 90, 30);
	 panel.add(button1);
	 
	 button2 = new JButton("Login");
	 button2.setBounds(105, 710, 70, 30);
	 panel.add(button2);
	 
	 this.add(panel);
	}
     
	
}