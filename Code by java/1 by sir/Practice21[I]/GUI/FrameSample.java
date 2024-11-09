//step 0
import javax.swing.*;
import java.lang.*;
import java.awt.*; //this package is used for coloring/font changing..
import java.awt.event.*; //used for interface
//step 1
//There are two interface for Frame desingn (MouseListener, ActionListener)s
public class FrameSample extends JFrame implements MouseListener, ActionListener
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
	JButton jb, jb2, jb3, jb4, jb5, jb6;
	Color color1;
	Font f1;
	
	//step 4
	public FrameSample()
	{
		
		//step 4(a)
		super("My FIRST GUI"); //header of frame
		//this.setSize(800,400); //(width, height)
		this.setBounds(700,200,800,700); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(82,246,235); //(Red,Green,Blue)
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
		//step 4(d)
		name1 = new JLabel("Welcome to OOP1[I] GUI class");
		name1.setBounds(150,10,275,30);
		f1 = new Font("Cambria", Font.ITALIC, 20);// (font name, font style, font size)
		name1.setFont(f1);
		name1.setBackground(Color.PINK);
		name1.setForeground(Color.RED); //used for changing font color
		name1.setOpaque(true); //used for color overlapping
		panel.add(name1);
		
		name2 = new JLabel("Your Name");
		name2.setBounds(30,50,100,50);
		panel.add(name2);
		
		txt1 = new JTextField();
		txt1.setBounds(100,65,100,20);
		txt1.setBackground(Color.BLUE);
		panel.add(txt1);
		
		name3 = new JLabel("Your ID");
		name3.setBounds(30,90,100,50);
		panel.add(name3);
		
		txt2 = new JTextField();
		txt2.setBounds(100,105,100,20);
		panel.add(txt2);
		
		name4 = new JLabel("National ID");
		name4.setBounds(30,125,100,50);
		panel.add(name4);
		
		
		pf = new JPasswordField();
		pf.setBounds(100,140,100,20);
		pf.setEchoChar('$');
		panel.add(pf);
		
		name5 = new JLabel("Your Gender");
		name5.setBounds(30,160,100,50);
		panel.add(name5);
		
		rd1 = new JRadioButton("Male");
		rd1.setBounds(120,175,70,20);
		rd1.setBackground(Color.GREEN);
		panel.add(rd1);
		
		rd2 = new JRadioButton("Female");
		rd2.setBounds(220,175,70,20);
		rd2.setForeground(Color.RED);
		panel.add(rd2);
		
		bt1 = new ButtonGroup();
		bt1.add(rd1);
		bt1.add(rd2);
		
		name6 = new JLabel("Courses offered for next semester");
		name6.setBounds(30,200,220,50);
		panel.add(name6);
		
		c1 = new JCheckBox("DS");
		c1.setBounds(100,260,70,20);
		panel.add(c1);
		
		c2 = new JCheckBox("DSL");
		c2.setBounds(100,300,70,20);
		panel.add(c2);
		
		c3 = new JCheckBox("IDB");
		c3.setBounds(190,260,70,20);
		panel.add(c3);
		
		c4 = new JCheckBox("Math 4");
		c4.setBounds(190,300,70,20);
		panel.add(c4);
		
		name7 = new JLabel("Your semester");
		name7.setBounds(30,330,220,50);
		panel.add(name7);
		
		String items[] = new String[]
		{" ","1st","2nd","3rd","4th","5th"};
		jcb = new JComboBox(items);
		jcb.setBounds(120,360,70,20);
		jcb.setBackground(Color.RED);
		jcb.setForeground(Color.GREEN);
		panel.add(jcb);
		
		name8 = new JLabel("What is OOP?");
		name8.setBounds(30,370,220,50);
		name8.addMouseListener(this);
		panel.add(name8);
		
		ta = new JTextArea();
		ta.setBounds(100,410,200,50);
		panel.add(ta);
		
		image = new ImageIcon("OOP1[I].jpg");
		name9 = new JLabel(image);
		name9.setBounds(400,70,256,285);
		panel.add(name9);
		
		jb = new JButton("Login");
		jb.setBounds(100,480,100,40);
		jb.setBackground(Color.ORANGE);
		jb.setForeground(Color.RED);
		jb.addMouseListener(this);
		panel.add(jb);
		
		jb2 = new JButton("Coloring");
		jb2.setBounds(100,530,100,40);
		jb2.setBackground(Color.ORANGE);
		jb2.setForeground(Color.RED);
		jb2.addMouseListener(this);
		panel.add(jb2);
		
		jb4 = new JButton("Close");
		jb4.setBounds(200,480,100,40);
		jb4.setBackground(Color.ORANGE);
		jb4.setForeground(Color.RED);
		jb4.addActionListener(this);
		panel.add(jb4);
		
		jb5 = new JButton("Show");
		jb5.setBounds(200,530,100,40);
		jb5.setBackground(Color.ORANGE);
		jb5.setForeground(Color.RED);
		jb5.addActionListener(this);
		panel.add(jb5);
		
		jb6 = new JButton("Go");
		jb6.setBounds(100,580,100,40);
		jb6.setBackground(Color.ORANGE);
		jb6.setForeground(Color.RED);
		jb6.addActionListener(this);
		panel.add(jb6);
		
		//step 4(f)
		this.add(panel);
	}
	//MouseListener
	//There are 5 abstract methods in MouseListener interface
	public void mouseClicked(MouseEvent me) 
	{
		if(me.getSource() == jb)
		{
			jb.setText("Sing in");
		}
		else 
		{
			
		}
	}
	public void mousePressed(MouseEvent me) 
	{
		if(me.getSource() == name8)
		{
			name8.setText("OOP full form");
		}
		else 
		{
			
		}
	}
	public void mouseReleased(MouseEvent me) 
	{
		if(me.getSource() == name8)
		{
			name8.setText("What is OOP1 and OOP2?");
		}
		else 
		{
			
		}
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == jb2)
		{
			jb2.setText("New Color");
			jb2.setBackground(Color.BLUE);
			jb2.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == jb2)
		{
			jb2.setText("Old Color");
			jb2.setBackground(Color.GREEN);
			jb2.setForeground(Color.RED);
		}
		else 
		{
			
		}
	}
	//ActionListener
	//There is 1 abstract method in ActionListener interface
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == jb4) //Close button
		{
			System.exit(0);
		}
		else if (ae.getSource() == jb5) //Show button
		{
			//Will appear a dialog box
			JOptionPane.showMessageDialog(null, "Java[I]!");
		}
		else if (ae.getSource() == jb6) //Go button
		{
			
			
			String s1, s2, s3, s4, s5, s6, s7;
			s1 = txt1.getText(); //textfield for name
			s2 = txt2.getText(); //textfield for id
			s3 = pf.getText(); //passwordfield for nid
			if(rd1.isSelected())
			{
				s4 = rd1.getText(); //radiobutton male
			}
			else if(rd2.isSelected())
			{
				s4 = rd2.getText(); //radiobutton female
			}
			else 
			{
				s4 = "No Gender";
			}
			if(c1.isSelected() && c2.isSelected()) //checkbox for DS and DSL
			{
				s5 = c1.getText()+" "+c2.getText(); //s5 = DS DSL
			}
			else if(c1.isSelected())
			{
				s5 = c1.getText(); //checkbox DS
			}
			else if(c2.isSelected())
			{
				s5 = c2.getText(); //checkbox DSL
			}
			else if(c3.isSelected())
			{
				s5 = c3.getText(); //checkbox IDB
			}
			else if(c4.isSelected())
			{
				s5 = c4.getText(); //checkbox Math4
			}
			//more else if condition is required for all combination
			else 
			{
				s5 = "No item to select";
			}
			s6 = jcb.getSelectedItem().toString(); //for combobox
			s7 = ta.getText(); //textarea for OOP
			
			
			NextFrame obj2 = new NextFrame(s1, s2, s3, s4, s5, s6, s7);
			//NextFrame obj2 = new NextFrame();
			obj2.setVisible(true);
			this.setVisible(false);
		}
	}
}
