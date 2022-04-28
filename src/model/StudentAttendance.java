/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{
        
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new StudentAttendance();
    }
}
