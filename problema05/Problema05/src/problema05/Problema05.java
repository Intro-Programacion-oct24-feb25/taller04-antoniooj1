/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el costo de nextflix");
        double netflix = scanner.nextDouble();
        System.out.println("Ingrese el costo de youtube premium");
        double yt = scanner.nextDouble();
        System.out.println("Ingrese el costo de dropbox");
        double dropbox = scanner.nextDouble();
        System.out.println("ingrese el costo de spotify");
        double spotify = scanner.nextDouble();
        double netflixD = netflix - (netflix * 0.23);
        double ytD = yt - (yt * 0.23);
        double dropboxD = dropbox - (dropbox * 0.45);
        double valorTotal = spotify + netflixD + ytD + dropboxD;
        System.out.println("Netflix y Youtube tienen un descuento del 23%,"
        +"mientras que dropbox de un 45% entonces el valor total a pagar seria:"
                + valorTotal);
                
                
     
                
    }
    
}
