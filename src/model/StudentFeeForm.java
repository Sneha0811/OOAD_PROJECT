/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class StudentFeeForm extends JFrame implements ActionListener{
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn con = new conn();
                String sql = "insert into fee(rollno, name, fathers_name, course, branch, semester, fee_paid) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, c1.getSelectedItem());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, (String) comboBox_3.getSelectedItem());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, (String) comboBox_2.getSelectedItem());
		st.setString(7, t1.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Paid");
                    this.setVisible(false);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
            }
        }catch(Exception e){
            
        }
    }
}

