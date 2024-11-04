/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String nombre = nuevo.nextLine();
        System.out.println("Ingrese el costo de la cpu");
        double cpu = nuevo.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        double teclado = nuevo.nextDouble();
        System.out.println("Ingrese el costo del raton");
        double raton = nuevo.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        double pantalla = nuevo.nextDouble();
        double valorTotal = cpu + teclado + raton + pantalla;
        
        System.out.printf("Reporte:\nNombres de cliente: %s\n"
        +"Valores iniciales: \nCpu: $ %.1f\nTeclado: $ %.1f\n"
        + "Raton: $ %.1f\nPantalla: $ %.1f\n\nValor a cancela: $ %.1f\n",
        nombre,
        cpu,
        teclado,
        raton,
        pantalla,
        valorTotal);
                
       
    }
    
}
