package buscaminas;
import java.util.Scanner;
public class Buscaminas {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        System.out.println("Bienvenidos al buscaminas");
        System.out.println("Introduzca la fila");
        int filaIntroducida=sc.nextInt();
        System.out.println("Introduzca la columna");
        int columnaIntroducida=sc.nextInt();
        tablero[filaIntroducida][columnaIntroducida];
}
    public static void tablero(){
        boolean fin=false;
        String [][]tablero={{"mina","2","1","1","0"},
                            {"1","2","mina","2","0"},
                            {"0","2","mina","2","0"},
                            {"0","1","1","2","1"},
                            {"0","0","1","mina","1"}};
        for (int filas=0;filas<tablero.length;filas++){
            for (int columnas=0;columnas<tablero.length;columnas++){
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
                if (tablero[filas][columnas]=="1"){
                    System.out.println("No hay nada ahí");
                }                
            }
        }
    }
}

