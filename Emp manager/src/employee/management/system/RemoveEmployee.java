package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.*;

public class RemoveEmployee extends JFrame implements ActionListener{
	Choice cEmpId;
    JButton delete, back;
    
    RemoveEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel labelempId = new JLabel("Employee Id");
        labelempId.setBounds(50, 50, 100, 30);
        add(labelempId);
        
        cEmpId = new Choice();
        cEmpId.setBounds(200, 50, 150, 30);
        add(cEmpId);
        
        try {
            DBconn c = new DBconn();
            String query = "select * from employee";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 100, 100, 30);
        add(lblname);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 150, 100, 30);
        add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(200, 150, 100, 30);
        add(lblphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(200, 200, 100, 30);
        add(lblemail);
        
        try {
            DBconn c = new DBconn();
            String query = "select * from employee where empId = '"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    DBconn c = new DBconn();
                    String query = "select * from employee where empId = '"+cEmpId.getSelectedItem()+"'";
                    ResultSet rs = c.st.executeQuery(query);
                    while(rs.next()) {
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("phone"));
                        lblemail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100,30);
        delete.setFocusable(false);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
       // delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(220, 300, 100,30);
        back.setFocusable(false);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
      //  back.addActionListener(this);
        add(back);
        
        setTitle("Sagor.hr - Smart employee management - Remove Employee ");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\ipac\\hr.png");  
		setIconImage(icon);
        
        setSize(1000, 400);
        setLocation(300, 150);
        setVisible(true);
    }

	public static void main(String[] args) {
		new  RemoveEmployee();

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
