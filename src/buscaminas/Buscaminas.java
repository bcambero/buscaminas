package buscaminas;
import java.util.Scanner;
public class Buscaminas {
    public static void main(String[] args) {
        // TODO code application logic here
        tablero();
}
    public static void tablero(){
        System.out.println("Bienvenidos al buscaminas");
        Scanner sc= new Scanner (System.in);
        boolean fin=false;
        String [][]tablero={{"mina","2","1","1","0"},
                            {"1","2","mina","2","0"},
                            {"0","2","mina","2","0"},
                            {"0","1","1","2","1"},
                            {"0","0","1","mina","1"}};
        while(fin==false){
                System.out.println("Introduzca la fila");
                int filaIntroducida=sc.nextInt();
                System.out.println("Introduzca la columna");
                int columnaIntroducida=sc.nextInt();            
                if (tablero[filaIntroducida][columnaIntroducida]=="1"){
                    System.out.println("Tienes 1 mina alrededor");
                    }
                if (tablero[filaIntroducida][columnaIntroducida]=="2"){
                    System.out.println("Tienes 2 minas alrededor");
                    }
                if (tablero[filaIntroducida][columnaIntroducida]=="0"){
                    System.out.println("No hay nada ahí");
                    }
                if (tablero[filaIntroducida][columnaIntroducida]=="mina"){
                    System.out.println("Has descubierto una mina, fin del juego.");
                    fin=true;
                    }
            

        }
        /*for (int filas=0;(filas<tablero.length)&&(fin==false);filas++){
            for (int columnas=0;(columnas<tablero.length)&&(fin==false);columnas++){
                if((tablero[filas][columnas])=="mina"){
                    System.out.println("Has fallado. Fin del juego");
                    fin=true;
                }
                if(tablero[filas][columnas]=="1"){
                    System.out.println("1 mina alrededor, introduzca otra casilla");
                }
                if(tablero[filas][columnas]=="2"){
                    System.out.println("2 minas alredor, introduzca otra casilla");
                }
                if (tablero[filas][columnas]=="0"){
                    System.out.println("No hay nada ahí");
                }                
            }*/
        }
    }
