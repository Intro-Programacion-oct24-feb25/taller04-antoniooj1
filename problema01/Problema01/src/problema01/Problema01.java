/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        

    }
}

