/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{
 
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from student where rollno = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddStudent().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            //new UpdateStudent().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }
    
}
