package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;

import javax.swing.*;

public class Signup extends JFrame implements ActionListener {
	JPanel pl1, pl2;
	JTextField urfld, emfld, passfld, ansfld;
	JButton b1, b2, b3;
	JLabel lb1, lb2, lb3, lb4, lb5;
	//Choice sec;
	JComboBox comboBox;
	
	Signup(){
		setLocationRelativeTo(null);
		setResizable(false);
		setFocusable(false);
		setLayout(null);
		
		setTitle("Sagor.hr - Smart employee management - Register");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
		setIconImage(icon);
		
		setBounds(350, 200, 900, 360);
		getContentPane().setBackground(Color.black);
		
		
		
			pl1 = new JPanel();
			pl1.setBackground(new Color(36, 181, 106));
			//setContentPane(panel);
			pl1.setBounds(0, 0, 500, 400);
			pl1.setLayout(null);
			add(pl1);

			ImageIcon i1 = new ImageIcon (getClass().getResource("Reg.png"));
		    Image i2 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
		    ImageIcon i3 = new ImageIcon(i2);
		    JLabel image = new JLabel(i3);
		    image.setBounds(525, 0, 300, 300);
		    add(image);
		
			
			JLabel lb1 = new JLabel("Username :");
			lb1.setBounds(50, 20, 125, 25);
			lb1.setFont(new Font ("Tahoma", Font.BOLD, 14));
			lb1.setForeground(new Color(255, 255, 255));
			pl1.add(lb1);

			JLabel lb2 = new JLabel("E-mail :");
			lb2.setBounds(50, 60, 125, 25);
			lb2.setFont(new Font ("Tahoma", Font.BOLD, 14));
			lb2.setForeground(new Color(255, 255, 255));
			pl1.add(lb2);
			
			JLabel lb3 = new JLabel("Password :");
			lb3.setBounds(50, 100, 125, 25);
			lb3.setFont(new Font ("Tahoma", Font.BOLD, 14));
			lb3.setForeground(new Color(255, 255, 255));
			pl1.add(lb3);
			
			JLabel lb4 = new JLabel("Security Question :");
			lb4.setBounds(50, 140, 125, 25);
			lb4.setFont(new Font ("Tahoma", Font.BOLD, 14));
			lb4.setForeground(new Color(255, 255, 255));
			pl1.add(lb4);
			
			JLabel lb5 = new JLabel("Answer :");
			lb5.setBounds(50, 180, 125, 25);
			lb5.setFont(new Font ("Tahoma", Font.BOLD, 14));
			lb5.setForeground(new Color(255, 255, 255));
			pl1.add(lb5);

			urfld = new JTextField();
			urfld.setBounds(190, 20, 180, 25);
			pl1.add(urfld);
			
			emfld = new JTextField();
			emfld.setBounds(190, 60, 180, 25);
			pl1.add(emfld);	
			
			passfld = new JTextField();
			passfld.setBounds(190, 100, 180, 25);
			pl1.add(passfld);
			
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?","Your bestfiend name", "Your Lucky Number?",
					"Your child SuperHero?", "Your childhood Name ?", "Your fav car name ?" }));
			comboBox.setBounds(190, 140, 180, 25);
			pl1.add(comboBox);
			
			//Choice sec = new Choice();
			//sec.add("Your fav Sports name");
			//sec.add("Your fav Marval Charcter name");
			//sec.add("Your pet name");
			//sec.add("Your fav days in week");
			//sec.add("Your childwood cartoon name");
			//sec.add("Your fav car name");
			//sec.add("Your bestfiend name");
			//sec.setBounds(190, 140, 180, 25);
			//pl1.add(sec);
			
			ansfld = new JTextField();
			ansfld.setBounds(190, 180, 180, 25);
			pl1.add(ansfld);
		
			
			
			b1 = new JButton("Register");
			b1.setFocusable(false);
			b1.addActionListener(this);
			b1.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    b1.setForeground(new Color(255, 255, 255));
			b1.setBackground(new Color(242, 63, 63));
			b1.setBounds(250, 250, 100, 30);
			pl1.add(b1);
			
			b2 = new JButton("Back");
			b2.setFocusable(false);
			b2.addActionListener(this);
			b2.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    b2.setForeground(new Color(7, 8, 8));
			b2.setBackground(new Color(242, 255, 248));
			b2.setBounds(80, 250, 100, 30);
			pl1.add(b2);

			
			
		setVisible(true);
	}	

	public static void main(String[] args) {
		new Signup();

	}

	public void actionPerformed(ActionEvent e) {
		
	       // if(e.getSource() == b1){
	               // String sql = "insert into acc(username, name, password, question, answer) values(?, ?, ?, ?, ?)";
	               // PreparedStatement st = con.c.prepareStatement(sql);

//			String username = urfld.getText();
//			System.out.println(username);
//			String email = emfld.getText();
//			System.out.println(email);
//			String password = passfld.getText();
//			System.out.println(password);
			//String question = sec.getItem(sec.getSelectedIndex());
			//System.out.println(question);
//			String question = (String) comboBox.getSelectedItem();
//			System.out.println(question);
//			String answer = ansfld.getText();
//			System.out.println(answer);
			
//			String query = "insert into acc('"+username+"', '"+email+"', '"+password+"', '"+question+"', '"+answer+"')";
			//String query = "insert into acc(username, name, password, question, answer) values (?, ?, ?, ?, ?)";
			
//			try {
//				DBconn c = new DBconn();
//				c.st.executeUpdate(query);
				
//				JOptionPane.showMessageDialog(null, "Account Created Successfully ");
				
//				dispose();
//				new Login();
				
//			}catch(Exception e1){
//				e1.printStackTrace();}

			//urfld.setText("");
			//emfld.setText("");
			//passfld.setText("");
			//ansfld.setText("");
//	            }
//	            if(e.getSource() == b2){
//	                dispose();
//	                new Login();
				
//	            }
		 try{
	            DBconn con = new DBconn();
	            
	            if(e.getSource() == b1){
	                String sql = "insert into acc(username, Email, password, SecurityQues, answer) values(?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, urfld.getText());
	        st.setString(2, emfld.getText());
			st.setString(3, passfld.getText());
			st.setString(4, (String) comboBox.getSelectedItem());
			st.setString(5, ansfld.getText());

			int i = st.executeUpdate();
			if (i > 0){
	                    JOptionPane.showMessageDialog(null, "Account Created Successfully ");
	                    new Login();
	                    setVisible(false);
	                }

				urfld.setText("");
				emfld.setText("");
				passfld.setText("");
				ansfld.setText("");;
	            }
	            if(e.getSource() == b2){
	                this.setVisible(false);
	                new Login().setVisible(true);
				
	            }
	        }catch(Exception e1){
	                System.out.println(e1);
	        }
	    }
			
}
