
package Presentacion;

public class Inicio {
    
    public static void main(String args[])
    {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                new Presentacion().setVisible(true);
            }
        });
        
        
    }
    
}
