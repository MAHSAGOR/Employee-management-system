package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Welcome extends JFrame implements ActionListener {
	
	Welcome(){
	
		setSize(1100, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setFocusable(false);
		
		setTitle("Sagor.hr - Welcome to new employee management software");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
		setIconImage(icon);
		
		
		ImageIcon i1 = new ImageIcon (getClass().getResource("Wmihr.png"));
		Image i2 = i1.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		add(image);
		
		JButton btn1 = new JButton(" Next ");
		btn1.setFocusable(false);
		btn1.setBounds(500, 400, 100, 50);
		btn1.setFont(new Font ("Tahoma", Font.BOLD, 20));
		btn1.setBackground(Color.black);
		btn1.setForeground(new Color(36, 181, 106));
		btn1.addActionListener(this);
		image.add(btn1);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Welcome();

	}
	
	public void actionPerformed(ActionEvent e) {
		dispose();
		new Login();
		
	}

}
