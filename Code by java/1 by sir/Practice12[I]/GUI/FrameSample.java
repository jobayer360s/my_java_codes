//step 0
import javax.swing.*;
import java.lang.*;
//step 1
public class FrameSample extends JFrame 
{
	//step 2
	JPanel panel;
	JLabel name1, name2, name3, name4, name5, name6, name7, name8, name9;
	JTextField txt1, txt2;
	JPasswordField pf;
	JRadioButton rd1, rd2;
	ButtonGroup bt1;
	JCheckBox c1, c2, c3, c4;
	JComboBox jcb;
	JTextArea ta;
	ImageIcon image;
	JButton jb;
	
	//step 4
	public FrameSample()
	{
		
		//step 4(a)
		super("My FIRST GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(700,300,800,500); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		
		//step 4(d)
		name1 = new JLabel("Welcome to OOP1[I] GUI class");
		name1.setBounds(150,20,200,50);
		panel.add(name1);
		
		name2 = new JLabel("Your Name");
		name2.setBounds(30,50,100,50);
		panel.add(name2);
		
		txt1 = new JTextField();
		txt1.setBounds(100,65,100,20);
		panel.add(txt1);
		
		name3 = new JLabel("Your ID");
		name3.setBounds(30,70,100,50);
		panel.add(name3);
		
		txt2 = new JTextField();
		txt2.setBounds(100,85,100,20);
		panel.add(txt2);
		
		name4 = new JLabel("National ID");
		name4.setBounds(30,90,100,50);
		panel.add(name4);
		
		pf = new JPasswordField();
		pf.setBounds(100,105,100,20);
		panel.add(pf);
		
		name5 = new JLabel("Your Gender");
		name5.setBounds(30,110,100,50);
		panel.add(name5);
		
		rd1 = new JRadioButton("Male");
		rd1.setBounds(100,125,70,20);
		panel.add(rd1);
		
		rd2 = new JRadioButton("Female");
		rd2.setBounds(170,125,70,20);
		panel.add(rd2);
		
		bt1 = new ButtonGroup();
		bt1.add(rd1);
		bt1.add(rd2);
		
		name6 = new JLabel("Courses offered for next semester");
		name6.setBounds(30,130,220,50);
		panel.add(name6);
		
		c1 = new JCheckBox("DS");
		c1.setBounds(100,170,70,20);
		panel.add(c1);
		
		c2 = new JCheckBox("DSL");
		c2.setBounds(100,190,70,20);
		panel.add(c2);
		
		c3 = new JCheckBox("IDB");
		c3.setBounds(170,170,70,20);
		panel.add(c3);
		
		c4 = new JCheckBox("Math 4");
		c4.setBounds(170,190,70,20);
		panel.add(c4);
		
		name7 = new JLabel("Your semester");
		name7.setBounds(30,200,220,50);
		panel.add(name7);
		
		String items[] = new String[]
		{" ","1st","2nd","3rd","4th","5th"};
		jcb = new JComboBox(items);
		jcb.setBounds(120,215,70,20);
		panel.add(jcb);
		
		name8 = new JLabel("What is OOP?");
		name8.setBounds(30,220,220,50);
		panel.add(name8);
		
		ta = new JTextArea();
		ta.setBounds(100,260,200,50);
		panel.add(ta);
		
		image = new ImageIcon("OOP1[I].jpg");
		name9 = new JLabel(image);
		name9.setBounds(400,70,256,285);
		panel.add(name9);
		
		jb = new JButton("Login");
		jb.setBounds(100,350,100,20);
		panel.add(jb);
		
		//step 4(f)
		this.add(panel);
	}
}
