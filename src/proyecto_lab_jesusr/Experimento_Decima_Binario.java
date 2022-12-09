
package proyecto_lab_jesusr;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Experimento_Decima_Binario {
 static Scanner leer= new Scanner(System.in);
 static Random random = new Random();
     
 public static void main (String[]args){
     System.out.println("Ingrese un decimal: ");
     int hola = leer.nextInt();
     TransformacionB(hola);
 }
     
 public static void TransformacionB(int bin){
     if (bin<2) {
         System.out.print(bin);
         return;
     }else{
         
         TransformacionB(bin/2);
         System.out.print(bin%2);
     }
     
 }
 
}
