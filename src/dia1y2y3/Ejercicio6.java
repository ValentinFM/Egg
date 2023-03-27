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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas 
        y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();

        String fraseMayusculas = frase.toUpperCase();
        String fraseMinusculas = frase.toLowerCase();

        System.out.println("Frase en mayúsculas: " + fraseMayusculas);
        System.out.println("Frase en minúsculas: " + fraseMinusculas);
    }
    
}
