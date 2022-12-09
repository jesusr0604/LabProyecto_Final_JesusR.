package proyecto_lab_jesusr;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Experimento_Matrices {
    static Scanner lea= new Scanner(System.in);
     static Random random = new Random();
     
     public static void main(String[]args){
  int colA;
        int filasB;
        System.out.print("Ingrese numero de filas de matriz A: ");
        int filasA = lea.nextInt();
        do {
            System.out.print("Ingrese numero de columnas de matriz A: ");
            colA = lea.nextInt();
            System.out.print("Ingrese numero de filas de matriz B: ");
            filasB = lea.nextInt();
            if (filasB != colA) {
                System.out.println("Las columnas de A ocupan ser igual a las filas de B, intente de nuevo.");
            }
        } while (filasB != colA);
        System.out.print("Ingrese numero de columnas de matriz B: ");
        int colB = lea.nextInt();
        int[][] A = new int[filasA][colA];
        int[][] B = new int[filasB][colB];
        int[][] C = new int[A.length][B[0].length];
        matriz(0, 0, A);
         System.out.println(jamon(0, 0, A));
        System.out.println("");
        matriz(0, 0, B);
         System.out.println(jamon(0, 0, B));
        System.out.println("");
        Mult(A, B, C, 0, 0);
         System.out.println( jamon(0, 0, C));
         
                 
     }
    /* public static int[][] lectura(int fila, int columna) {
        int[][] temporal = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temporal[i][j] = random.nextInt(9);
            }
        }
        return temporal;
    }*/

    /* public static String imprimir(int[][] numero) {
        String cadena = "";

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                cadena += "[" + numero[i][j] + "]" + " ";
            }
            cadena += "\n";
        }

        return cadena;
        
        
    
 
 
 

/*Llenado*/public static int [][] matriz (int i, int j, int [][]Mat1){
    if (i == Mat1.length-1 && j == Mat1[0].length-1) {
        Mat1[i][j] = random.nextInt(9);
    }
    else if(j < Mat1[0].length-1){
         Mat1[i][j] = random.nextInt(9);
         matriz(i, ++j, Mat1);
    } else if(j == Mat1[0].length-1){
         Mat1[i][j] = random.nextInt(9);
         matriz(++i, 0, Mat1);
    }
    return Mat1;
}

/*Imprimir*/public static String jamon (int i, int j, int [][]Mat1){
    if (i == Mat1.length-1 && j == Mat1[0].length-1) {
        return("[" + Mat1[i][j] + "]\n"); 
    }
    else if(j < Mat1[0].length-1){
           return("[" + Mat1[i][j] + "]"  )+jamon(i, ++j, Mat1);
            
    } else if(j == Mat1[0].length-1){
         return("[" + Mat1[i][j] + "]\n" )+jamon(++i, 0, Mat1);
            
         
    }
   return " ";
}

/*Rowproduct*/public static int rowproduct (int[][]A, int [][]B, int i, int j, int k){
    if(k< A[0].length-1){
        return (A[i][k]* B[k][j]) + rowproduct(A,B,i, j, ++k);
    }else{
        return (A[i][k]* B[k][j]);
    }
        
    
    
}
//Para el row product agarra 2 matrices y lo que hace es agarrar la fila i de A y la columna j de B
// El valor de k puede ser A[0].lenght o  B.length
//El valor de k va a ir cambiando los elementos que se multiplican segun las reglas de multiplicacion de matrices
// La funcion devuelve la multiplicacion individual de cada 2 elementos y las va sumando hasta salir de la funcion
//lo cual da el elemento [i][j] del producto de matriz A y B.
 
public static int[][] Mult (int[][]A, int [][]B, int [][]C, int i, int j){
    if(i== A.length-1 && j== B[0].length-1){
        C[i][j]= rowproduct(A,B,i,j, 0);
    }else if(j<B[0].length-1 ){
         C[i][j]= rowproduct(A,B,i,j, 0);
         Mult(A,B,C, i, ++j);
    }else if(j== B[0].length-1){
        C[i][j]= rowproduct(A,B,i,j, 0);
         Mult(A,B,C, ++i, 0);
    }
    return C;
    }
}
//Para la multiplicacion, la funcion va a terminar cuando el valor de i sea la ultima fila de A
//y cuando el valor de j sea la ultima columna de B, Esto es el primer if de la funcion
// Lo que hace el siguiente else if es multiplicar la fila i de A con todas las columnas de B
//Lo que hace el else if final es cuando llega a la ultima columna de B, va a pasar a la sigueinte fila de A
//Este proceso se repite hasta que el valor de i sea la ultima fila de A
//y cuando el valor de j sea la ultima columna de B, y retorna la matriz resultado de A y B.



