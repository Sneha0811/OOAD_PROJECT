package university.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                conn c1 = new conn();

                String s1 = "insert into subject values('"+t1.getText()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                String s2 = "insert into marks values('"+t1.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t9.getText()+"','"+t11.getText()+"')";

                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            }
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}