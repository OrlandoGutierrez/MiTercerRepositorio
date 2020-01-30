package batalla_de_barcos_acorazados;

/**
Developed by:
*   -Dennis Gutierrez
*   -Josue Holguin
*   -Hugo Pibaque
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ubicacion implements ActionListener{
private int i,j;
Ubicacion(int i,int j){
this.i=i;
this.j=j;
}
    @Override
    public void actionPerformed(ActionEvent ae) {
    if(Metodos.barcos[i][j]==0 && Metodos.getAliados()<5){
       Metodos.barcos[i][j]=1;
      InterfazJuego.casillas[i][j].setIcon(new ImageIcon("aliado.png"));
      Metodos.nuevoaliado();
       if(Metodos.getAliados()==5){
           Metodos.nuevosenemigos();
           InterfazJuego.jButton1.setEnabled(true);
           InterfazJuego.jButton2.setEnabled(true);
           }
    }
    }
    
}
