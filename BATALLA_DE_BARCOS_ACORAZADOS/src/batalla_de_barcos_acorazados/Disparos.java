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


public class Disparos implements ActionListener{
private int i,j;
private int a,b;
Disparos(int i,int j){
this.i=i;
this.j=j;
}
    @Override
    public void actionPerformed(ActionEvent ae) {
    if(Metodos.barcos[i][j]==0 || Metodos.barcos[i][j]==1 || Metodos.barcos[i][j]==2){
       if(Metodos.barcos[i][j]==0){
       Metodos.barcos[i][j]=3;
       InterfazJuego.casillas[i][j].setIcon(new ImageIcon("perdido.png"));
       InterfazJuego.naraliado.setText("Ataque fallido");
       }
        if(Metodos.barcos[i][j]==1){
         Metodos.barcos[i][j]=4;
         InterfazJuego.casillas[i][j].setIcon(new ImageIcon("aliadodes.png"));
         InterfazJuego.naraliado.setText("Fuego amigo");
         Metodos.atacaraliado();
        }
         if(Metodos.barcos[i][j]==2){
         Metodos.barcos[i][j]=5;
         InterfazJuego.casillas[i][j].setIcon(new ImageIcon("enemigodes.png"));
         InterfazJuego.naraliado.setText("Ataque éxitoso");
         Metodos.atacarenemigo();
         }
         InterfazJuego.puntajeE.setText(""+Metodos.getEnemigos());
          InterfazJuego.puntajeA.setText(""+Metodos.getAliados());
          if(Metodos.getAliados()== 0 || Metodos.getEnemigos()== 0){
          InterfazJuego.estadomapa();
          InterfazJuego.jButton3.setEnabled(true);
          InterfazJuego.narenemigo.setText("");
           if(Metodos.getAliados()== 0){
              InterfazJuego.naraliado.setText("Fracasamos");
              JOptionPane.showMessageDialog(null, "Todos tus barcos aliados han sido atacados, perdiste.");
           }else{
              InterfazJuego.naraliado.setText("Lo logramos");
              JOptionPane.showMessageDialog(null, "Has acabado con todos los barcos enemigos, ganaste");
           }
          }else{
              
        do{
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
          }while(Metodos.barcos[a][b]==3||Metodos.barcos[a][b]==4||Metodos.barcos[a][b]==5);
           if(Metodos.barcos[a][b]==0){
              Metodos.barcos[a][b]=3;
              InterfazJuego.casillas[a][b].setIcon(new ImageIcon("perdido.png"));
              InterfazJuego.narenemigo.setText("Ataque fallido");
              }
            if(Metodos.barcos[a][b]==1){
               Metodos.barcos[a][b]=4;
               InterfazJuego.casillas[a][b].setIcon(new ImageIcon("aliadodes.png"));
               InterfazJuego.narenemigo.setText("Fuego amigo");
               Metodos.atacaraliado();
             }
              if(Metodos.barcos[a][b]==2){
              Metodos.barcos[a][b]=5;
              InterfazJuego.casillas[a][b].setIcon(new ImageIcon("enemigodes.png"));
              InterfazJuego.narenemigo.setText("Ataque éxitoso");
              Metodos.atacarenemigo();
              }
         if(Metodos.getAliados()== 0 || Metodos.getEnemigos()== 0){
          InterfazJuego.estadomapa();
          InterfazJuego.jButton3.setEnabled(true);
          InterfazJuego.narenemigo.setText("");
            if(Metodos.getAliados()== 0){
              InterfazJuego.naraliado.setText("Fracasamos");
              JOptionPane.showMessageDialog(null, "Todos tus barcos aliados han sido atacados, perdiste.");
           }else{
              InterfazJuego.naraliado.setText("Lo logramos");
              JOptionPane.showMessageDialog(null, "Has acabado con todos los barcos enemigos, ganaste");
           }
          }
          InterfazJuego.puntajeE.setText(""+Metodos.getEnemigos());
          InterfazJuego.puntajeA.setText(""+Metodos.getAliados());
          }
    }
    }
    
}
