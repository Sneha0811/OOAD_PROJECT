package university.management.system;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetails extends JFrame implements ActionListener{

    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from teacher where emp_id = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new TeacherDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddTeacher().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            //new UpdateTeacher().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new TeacherDetails().setVisible(true);
    }
    
}

