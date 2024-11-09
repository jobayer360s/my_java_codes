import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel userlable,passlable;
	JTextField tfield;
	JPasswordField pfield;
	JButton signbtn,exitbtn;
	Color mycolor, mycolor1;
	Font myfont;
	
	
	public Registration ()
	{
		super("Registration");
		this.setBounds(280,115,800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userlable = new JLabel("user");
		userlable.setBounds(150,115,80,30);
		userlable.setBackground(Color.RED);
		userlable.setOpaque(true);
		userlable.setForeground(Color.WHITE);
		userlable.setFont(myfont);
		panel.add(userlable);
		
		
	    tfield = new JTextField();
		tfield.setBounds(230,115,100,30);
		panel.add(tfield);
		
		passlable = new JLabel("Password:");
		passlable.setBounds(150,150,80,30);
		passlable.setBackground(Color.RED);
		passlable.setOpaque(true);
		panel.add(passlable);
		
		pfield = new JPasswordField();
		pfield.setBounds(230,150,100,30);
		panel.add(pfield);
		
		signbtn= new JButton("Signup");
		signbtn.setBounds(180,200,80,30);
		signbtn.setBackground(Color.RED);
		signbtn.addMouseListener(this);
		signbtn.addActionListener(this);
		panel.add(signbtn);
		
		exitbtn = new JButton("Exit");
		exitbtn.setBounds(280,200,80,30);
		exitbtn.setBackground(Color.ORANGE);
		exitbtn.addMouseListener(this);
		exitbtn.addActionListener(this);
		panel.add(exitbtn);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == signbtn)
		{
			String name=tfield.getText();
			String pass=pfield.getText();
				
			if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill All");
			}
			else
			{		
				Account acc= new Account(name,pass);
				acc.addaccount();
					
				JOptionPane.showMessageDialog(this,"Added");
					
				tfield.setText("");
				pfield.setText("");
					
				Newframe f1=new Newframe();
				f1.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource() == exitbtn)
		{
			System.exit(0);
		}
	}
	
}