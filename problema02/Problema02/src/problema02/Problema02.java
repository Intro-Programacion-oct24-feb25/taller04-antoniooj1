/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hola = new Scanner(System.in);
          //colocamos los 3 datos que debe colocar el usuario
        System.out.println("Ingrese el gasto del primer hijo:");
        double hijo1 = hola.nextDouble();
        System.out.println("ingrese el gasto del segundo hijo:");
        double hijo2 = hola.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo:");
        double hijo3 = hola.nextDouble();
        double gastosTotales = hijo1 + hijo2 + hijo3;
        System.out.println("El gasto total de sus tres hijos es:"
                +gastosTotales);
                
    
        

    }
    
}
