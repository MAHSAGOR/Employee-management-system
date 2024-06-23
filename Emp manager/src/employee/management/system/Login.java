package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JPanel pl1, pl2;
	JTextField textField, passwordField;
	JButton b1, b2, b3;
	JLabel lb1, lb2,lb3;
	
	Login(){
		setSize(900, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setFocusable(false);
		setLayout(null);
		
		setTitle("Sagor.hr - Smart employee management - Login");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
		setIconImage(icon);
		
		getContentPane().setBackground(new Color(27, 174, 242));
		
		pl1 = new JPanel();
		pl1.setBackground(Color.black);
		//setContentPane(panel);
		pl1.setBounds(0, 0, 400, 400);
		pl1.setLayout(null);
		add(pl1);

		ImageIcon i1 = new ImageIcon (getClass().getResource("log.png"));
	    Image i2 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
	    ImageIcon i3 = new ImageIcon(i2);
	    JLabel image = new JLabel(i3);
	    image.setBounds(35,20, 300, 300);
	    pl1.add(image);
		    
	    pl2 = new JPanel();
		pl2.setBackground(new Color(172, 227, 252));
	   	pl2.setBounds(400, 30, 450, 300);
	   	pl2.setLayout(null);
	   	add(pl2);
			
		JLabel lb1 = new JLabel("Username : ");
		lb1.setBounds(60, 20, 150, 25);
		lb1.setFont(new Font ("SAN_SERIF", Font.PLAIN, 20));
		pl2.add(lb1);

		JLabel lb2 = new JLabel("Password : ");
		lb2.setBounds(60, 110, 150, 25);
		lb2.setFont(new Font ("SAN_SERIF", Font.PLAIN, 20));
		pl2.add(lb2);

		textField = new JTextField();
		textField.setBounds(60, 60, 300, 30);
		pl2.add(textField);
			
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 150, 300, 30);
		pl2.add(passwordField);

		        
		b1 = new JButton("Login");
		b1.setFocusable(false);
		b1.addActionListener(this);
		b1.setFont(new Font ("Tahoma", Font.BOLD, 14));
	    b1.setForeground(new Color(250, 252, 252));
		b1.setBackground(new Color(27, 167, 247));
		//b1.setBounds(60, 200, 130, 30);
		b1.setBounds(230, 200, 130, 30);
		pl2.add(b1);
				
		b2 = new JButton("Signup");
		b2.setFocusable(false);
		b2.addActionListener(this);
		b2.setFont(new Font ("Tahoma", Font.BOLD, 14));
	    b2.setForeground(new Color(0, 163, 106));
		b2.setBackground(new Color(250, 252, 252));
		//b2.setBounds(230, 200, 130, 30);
		b2.setBounds(60, 200, 130, 30);
		pl2.add(b2);

		b3 = new JButton("Forgot Password");
		b3.setFocusable(false);
		//b3.addActionListener(this);
		b3.setFont(new Font ("Tahoma", Font.BOLD, 11));
	    b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(232, 7, 44));
		b3.setBounds(130, 250, 130, 30);
		pl2.add(b3);

		lb3 = new JLabel("Trouble in Login?");
		lb3.setFont(new Font("SAN_SERIF", Font.PLAIN, 15));
		lb3.setForeground(new Color(5, 5, 5));
		lb3.setBounds(300, 250, 150, 20);
		pl2.add(lb3);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();

	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			try {
	            String username = textField.getText();
	            String password = passwordField.getText();
	            
	            DBconn c = new DBconn();
	            String query = "select * from acc where username = '"+username+"' and password = '"+password+"'";
	            
	            ResultSet rs = c.st.executeQuery(query);
	            if (rs.next()) {
	                setVisible(false);
	                new Home();
	            } else {
	                JOptionPane.showMessageDialog(null, "Invalid username or password");
	                setFocusable(false);
	                // setVisible(false);
	            }
	        } catch (Exception e1) {
	            e1.printStackTrace();
	        }
		}
		else if(e.getSource() == b2) {
			dispose();
			new Signup();	
		}
		
		
	}

}
