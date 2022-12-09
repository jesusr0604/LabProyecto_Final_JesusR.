package proyecto_lab_jesusr;

import java.util.Random;
import java.util.Scanner;
import static proyecto_lab_jesusr.Experimento_Decima_Binario.TransformacionB;

/**
 *
 * @author larl2
 */
public class Experimento_Binario_Decimal {
    static Scanner leer= new Scanner(System.in);
    static Random random = new Random();
     
 public static void main(String[] args) {
        String Binario = leer.next();
        System.out.println( Decimal(Binario));
    }

    public static int Decimal(String binario) {
        return ConvertidorDecimal(binario, 0, 0);
    }

    public static int ConvertidorDecimal(String binary, int numero, int power) {
        if (binary.length() != 0) {
            int digit = binary.charAt(binary.length() - 1)  == '0' ? 0 : 1;
            numero += digit == 1 ? (int) Math.pow(2, power) : 0;
            return ConvertidorDecimal(binary.substring(0, binary.length() - 1), numero, power + 1);
        } 

        return numero;
    }
} 
     



