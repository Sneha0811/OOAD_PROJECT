package university.management.system;

import java.awt.*;
import javax.swing.*;

class Frame extends JFrame implements Runnable{

    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login f1 = new Login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}