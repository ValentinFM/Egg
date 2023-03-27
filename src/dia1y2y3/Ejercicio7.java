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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados");
        int celcius = leer.nextInt();
        int fahrenheit = 32 + (9 * celcius / 5);
        System.out.println("El equivalente en Fahrenheit es de: " + fahrenheit + "Grados fahrenheit");
    
    }
    
}
