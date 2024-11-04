/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //mi segunda solucion a este problema que me parece mas eficaz
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el costo por minuto");
        double costoMinuto = scanner.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos");
        double minutosMes = scanner.nextDouble();
        System.out.println("Ingrese la direccion en la que vive");
        scanner.nextLine();
        String direccion = scanner.nextLine();
        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = scanner.nextLine();
        double planilla = (costoMinuto * minutosMes );
        System.out.printf("Reporte:\nNombres completos: %s\n\tDirecciones: %s\n"
        +"Costo por minuto: %.2f\n\tNumero de minutos consumidos: " 
        + " %.2f\n\t\tValor a cancelar: %.2f\n",
        nombreCompleto,
        direccion,
        costoMinuto,
        minutosMes,
        planilla);