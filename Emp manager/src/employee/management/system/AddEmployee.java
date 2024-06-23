package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener {
		Random ran = new Random();
	    int number = ran.nextInt(999999);
	    
	    JTextField tfname, tffname, tfaddress, tfphone, tfnid, tfemail, tfsalary, tfdesignation, tfdob;
	    JComboBox cbeducation;
	    JLabel lblempId;
	    JButton add, back;
	    
	    AddEmployee() {
	    	
	    	setSize(900, 700);
	        setLocation(300, 50);
	        setResizable(false);
			setFocusable(false);
			setLayout(null);
			
			setTitle("Sagor.hr - Smart employee management - Add employee");
			Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
			setIconImage(icon);
	    	
	    	
	        getContentPane().setBackground(new Color(255, 238, 191));
	        setLayout(null);
	        
	        JLabel heading = new JLabel("Add Employee Details");
	        heading.setBounds(320, 30, 500, 50);
	        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	        add(heading);
	        
	        JLabel labelname = new JLabel("Name");
	        labelname.setBounds(50, 150, 150, 30);
	        labelname.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelname);
	        
	        tfname = new JTextField();
	        tfname.setBounds(200, 150, 150, 30);
	        add(tfname);
	        
	        JLabel labelfname = new JLabel("Father's Name");
	        labelfname.setBounds(400, 150, 150, 30);
	        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelfname);
	        
	        tffname = new JTextField();
	        tffname.setBounds(600, 150, 150, 30);
	        add(tffname);
	        
	        JLabel labeldob = new JLabel("Date of Birth");
	        labeldob.setBounds(50, 200, 150, 30);
	        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldob);
	        
	        tfdob = new JTextField();
	        tfdob.setBounds(200, 200, 150, 30);
	        add(tfdob);
	        
	        JLabel labelsalary = new JLabel("Salary");
	        labelsalary.setBounds(400, 200, 150, 30);
	        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelsalary);
	        
	        tfsalary = new JTextField();
	        tfsalary.setBounds(600, 200, 150, 30);
	        add(tfsalary);
	        
	        JLabel labeladdress = new JLabel("Address");
	        labeladdress.setBounds(50, 250, 150, 30);
	        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeladdress);
	        
	        tfaddress = new JTextField();
	        tfaddress.setBounds(200, 250, 150, 30);
	        add(tfaddress);
	        
	        JLabel labelphone = new JLabel("Phone");
	        labelphone.setBounds(400, 250, 150, 30);
	        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelphone);
	        
	        tfphone = new JTextField();
	        tfphone.setBounds(600, 250, 150, 30);
	        add(tfphone);
	        
	        JLabel labelemail = new JLabel("Email");
	        labelemail.setBounds(50, 300, 150, 30);
	        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelemail);
	        
	        tfemail = new JTextField();
	        tfemail.setBounds(200, 300, 150, 30);
	        add(tfemail);
	        
	        JLabel labeleducation = new JLabel("Higest Education");
	        labeleducation.setBounds(400, 300, 150, 30);
	        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeleducation);
	        
	        String courses[] = {"JSC","SSC","HSC","Degree","Diploma","BBA", "BA", "BSC", "B.COM", "BTech", "MBA", "MA", "MTech", "MSC", "PHD"};
	        cbeducation = new JComboBox(courses);
	        cbeducation.setBackground(Color.WHITE);
	        cbeducation.setBounds(600, 300, 150, 30);
	        add(cbeducation);
	        
	        JLabel labeldesignation = new JLabel("Designation");
	        labeldesignation.setBounds(50, 350, 150, 30);
	        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldesignation);
	        
	        tfdesignation = new JTextField();
	        tfdesignation.setBounds(200, 350, 150, 30);
	        add(tfdesignation);
	        
	        JLabel labelnid = new JLabel("National ID no");
	        labelnid.setBounds(400, 350, 150, 30);
	        labelnid.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelnid);
	        
	        tfnid = new JTextField();
	        tfnid.setBounds(600, 350, 150, 30);
	        add(tfnid);
	        
	        JLabel labelempId = new JLabel("Employee id");
	        labelempId.setBounds(50, 400, 150, 30);
	        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelempId);
	        
	        lblempId = new JLabel("" + number);
	        lblempId.setBounds(200, 400, 150, 30);
	        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(lblempId);
	        
	        add = new JButton("Add Details");
	        add.setBounds(250, 550, 150, 40);
	        add.setFocusable(false);
	        add.addActionListener(this);
	        add.setBackground(Color.BLACK);
	        add.setForeground(Color.WHITE);
	        add(add);
	        
	        back = new JButton("Back");
	        back.setBounds(450, 550, 150, 40);
	        back.setFocusable(false);
	        back.addActionListener(this);
	        back.setBackground(Color.BLUE);
	        back.setForeground(Color.WHITE);
	        add(back);
	        
	       
	        setVisible(true);
	    }
	public static void main(String[] args) {
			new AddEmployee();

		}
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == add) {
	            String name = tfname.getText();
	            String fname = tffname.getText();
	            String dob =  tfdob.getText();
	            String salary = tfsalary.getText();
	            String address = tfaddress.getText();
	            String phone = tfphone.getText();
	            String email = tfemail.getText();
	            String education = (String) cbeducation.getSelectedItem();
	            String designation = tfdesignation.getText();
	            String nid = tfnid.getText();
	            String empId = lblempId.getText();
	            
	            try {
	                DBconn conn = new DBconn();
	                String query = "insert into employee_detials values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+nid+"', '"+empId+"')";
	                conn.st.executeUpdate(query);
	                JOptionPane.showMessageDialog(null, "Details added successfully");
	                setVisible(false);
	                new Home();
	            } catch (Exception e1) {
	                e1.printStackTrace();
	            }
	        } else {
	            setVisible(false);
	            new Home();
	        }
		

		
	}

}
