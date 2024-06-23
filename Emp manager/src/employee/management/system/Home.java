package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Home extends JFrame implements ActionListener {
	 
	 JButton view, add, update, remove;
	Home() {
	        
		//setLocationRelativeTo(null);
		setResizable(false);
		setFocusable(false);
		setLayout(null);
		
		setTitle("Sagor.hr - Smart employee management - Deshboard");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
		setIconImage(icon);
		
	        setLayout(null);
	        
	        ImageIcon i1 = new ImageIcon (getClass().getResource("hui.png"));
			Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
			ImageIcon i3= new ImageIcon(i2);
			JLabel image =new JLabel(i3);
			image.setBounds(0, 0, 1120, 630);
			add(image);
	        
	        
	        JLabel heading = new JLabel("Employee Management System");
	        heading.setBounds(390, 10, 400, 40);
	        heading.setFont(new Font("Raleway", Font.BOLD, 25));
	        heading.setForeground(new Color(250, 252, 252));
	        image.add(heading);
	        
	        add = new JButton("Add Employee");
	        add.setBounds(95, 150, 235, 40);
	        add.setFocusable(false);
			add.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    add.setForeground(new Color(36, 145, 255));
			add.setBackground(new Color(250, 252, 252));
	        add.addActionListener(this);
	        image.add(add);
	        
	        view = new JButton("View Employees");
	        view.setBounds(95, 220, 235, 40);
	        view.setFocusable(false);
			view.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    view.setForeground(new Color(36, 145, 255));
			view.setBackground(new Color(250, 252, 252));
	        //view.addActionListener(this);
	        image.add(view);
	        
	        update = new JButton("Update Employee");
	        update.setBounds(95, 290, 235, 40);
	        update.setFocusable(false);
			update.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    update.setForeground(new Color(36, 145, 255));
			update.setBackground(new Color(250, 252, 252));
	        update.addActionListener(this);
	        image.add(update);
	        
	        remove = new JButton("Remove Employee");
	        remove.setBounds(95, 360, 235, 40);
	        remove.setFocusable(false);
			remove.setFont(new Font ("Tahoma", Font.BOLD, 14));
		    remove.setForeground(new Color(36, 145, 255));
			remove.setBackground(new Color(250, 252, 252));
	       // remove.addActionListener(this);
	        image.add(remove);
	        
	        setSize(1120, 630);
	        setLocation(200, 95);
	        setVisible(true);
	    }

	
	public static void main(String[] args) {
		new Home();

	}


	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == add) {
	            setVisible(false);
	            new AddEmployee();
	        } else if (e.getSource() == view) {
	            setVisible(false);
	            new ViewEmployee();
	        } else if (e.getSource() == update) {
	           // setVisible(false);
	            new UpdateEmployee();
	        } else {
	            setVisible(false);
	            new RemoveEmployee();
	        }
		
	}
	
	


}
