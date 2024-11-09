import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Newframe extends JFrame implements MouseListener,ActionListener
{
	
	JPanel panel;
	JLabel user,pass;
	JTextField text;
	JPasswordField passfield;
	JButton login,signup;
	
	public Newframe()
	{
		super("My First Gui");
		this.setBounds(280,115,800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		user=new JLabel("Name");
		user.setBounds(280,115,100,30);
		panel.add(user);
		
		
		text=new JTextField();
		text.setBounds(380,115,200,30);
		panel.add(text);
		
		pass=new JLabel("Pass");
		pass.setBounds(280,165,100,30);
		panel.add(pass);
		
		
		passfield=new JPasswordField();
		passfield.setBounds(380,165,200,30);
		panel.add(passfield);
		
		login=new JButton("Sign In");
		login.setBounds(330,215,100,40);
		login.addMouseListener(this);
		login.addActionListener(this);
		panel.add(login);
		
		signup=new JButton("Sign Up");
		signup.setBounds(460,215,100,40);
		signup.addMouseListener(this);
		signup.addActionListener(this);
		panel.add(signup);
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.RED);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.RED);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.BLUE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == login)
		{
			String name=text.getText();
			String pass=passfield.getText();
			
			Account acc=new Account();
			
			if(acc.getAccount(name,pass)==true)
			{
				JOptionPane.showMessageDialog(null,"Sucessfull");
				
				Login obj1=new Login(name,pass);
				obj1.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect");
			}
		}
			
		else if(ae.getSource() == signup)
		{
			Registration r1=new Registration();
			r1.setVisible(true);
			this.setVisible(false);
		}
	}
}