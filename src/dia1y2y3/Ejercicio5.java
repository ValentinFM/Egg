/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia1y2y3;

import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los números ingresados por el usuario
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        // Calcular la suma de los dos números
        int suma = num1 + num2;

        // Mostrar el resultado de la suma
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

        
    }
    
}
