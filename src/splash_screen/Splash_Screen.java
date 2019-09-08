/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash_screen;

/**
 *
 * @author Joyjit Chowdhury
 */
public class Splash_Screen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Screen obj = new Screen();
        Login_Page obj2 = new Login_Page();
        obj.setVisible(true);
        
        try
        {
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(35);
                
                obj.jParcentage.setText(Integer.toString(i)+"%");
                obj.jProgressBar.setValue(i);
                
                if(i==100)
                {
                    obj.setVisible(false);
                    obj2.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}
