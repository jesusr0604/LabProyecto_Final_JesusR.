package proyecto_lab_jesusr;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proyecto_Lab_JesusR {
    static Scanner leer = new Scanner (System.in);
    static Random ran = new Random();
    
    public static void main(String[] args) {
     
 
  ArrayList<Cancion>Canciones= new ArrayList<>();  
        /*for (int i = 0; i <= 5; i++) {
            
        
       String cn1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la cancion: ", "Cancion ", 1);
       
       String al1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del album: ", "Album ", 1);
       
       String art1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del artista: ", "Atista ", 1);
       
       int dur1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la duracion: ", "Duracion", 1));
       
       int an1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año: ", "año", 1));
       
       Cancion n1 = new Cancion(cn1,al1,art1,dur1,an1);
     Canciones.add(n1);
        System.out.println(Canciones.get(Canciones.size()-1));
       
        }*/
  
  String canciones="";
        for (int i = 0; i <Canciones.size() ; i++) {
            canciones+= Canciones.get(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null, canciones);
}
}
//alt +insert
/*  ArrayList<Cancion> canciones = new ArrayList();
       Cancion c1 = new Cancion("Nombre","Album","Artista",2022,200);
       //c1.
       canciones.add(c1);
       //(canciones.get(0)).setNombre();
       canciones.remove(0);
       canciones.size();*/