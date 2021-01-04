/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contractbyte;

import javax.swing.JFrame;

/**
 *
 * @author Ravindra
 */
public class Contractbyte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Splashform splash = new  Splashform();
    
    splash.setVisible(true);
    try{
           
            for(int i= 0; i<= 100; i++){
                 Thread.sleep(3);
               // Splashform.jLabel1.setText(i+"%");
                Splashform.jProgressBar1.setValue(i);
            
                if(i==100){
                    
                    Login login = new Login();
                  splash.setVisible(false);
                  login.setVisible(true);
                  
            
                }
            
            }
            
    }catch(Exception e){
    }
    }

   
                        
                        
                        
    
}
