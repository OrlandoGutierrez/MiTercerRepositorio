package batalla_de_barcos_acorazados;

/**
Developed by:
*   -Dennis Gutierrez
*   -Josue Holguin
*   -Hugo Pibaque
 */

abstract class Metodos {
public static int[][] barcos;
private static int aliados=0;
private static int enemigos=0;
private static int a,b;
public static void inicializar(){
barcos=new int[10][10];
enemigos=0;
aliados=0;

for(int i=0;i<10;i++){
for(int j=0;j<10;j++){
barcos[i][j]=0;
}
}
}
public static void nuevosenemigos(){
for(int c=0;c<5;c++){
        do{
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
          }while(barcos[a][b]!=0);
           barcos[a][b]=2;
           enemigos++;
        }
}
public static void atacaraliado(){
aliados --;
}
public static void atacarenemigo(){
enemigos --;
}
public static void nuevoaliado(){
aliados ++;
}
public static int getAliados(){
return aliados;
}
public static int getEnemigos(){
return enemigos;
}
}
