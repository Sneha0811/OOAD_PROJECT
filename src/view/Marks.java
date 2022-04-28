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

public class Marks extends JFrame{

   JTextArea t1;
   JPanel p1;
   
   Marks(){}
   Marks(String str){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(t1);
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark(str);
   }
}