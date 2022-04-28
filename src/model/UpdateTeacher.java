/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateTeacher implements ActionListener{

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update teacher set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"', emp_id = '"+t11.getText()+"',course='"+t13.getText()+"',dept='"+t14.getText()+"' where emp_id='"+t12.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new TeacherDetails().setVisible(true);
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Project().setVisible(true);
        }
        if(ae.getSource() == b2){
            try{
                conn con = new conn();
                String str = "select * from teacher where emp_id = '"+t12.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    f.setVisible(true);
             

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t8.setText(rs.getString(8));
                    t9.setText(rs.getString(9));
                    t10.setText(rs.getString(10));
                    t11.setText(rs.getString(11));
                    t13.setText(rs.getString(12));
                    t14.setText(rs.getString(13));
                }

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
    }

    public static void main(String[] arg){
        new UpdateTeacher().f.setVisible(true);
    }
}