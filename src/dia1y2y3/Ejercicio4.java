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
public class Ejercicio4 {

    private static String edad;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
        Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
        Esto nos va a generar un System.out.println() para poder escribir lo que queramos.*/
        
        Scanner leerNombre = new Scanner(System.in);
        String nombre;
        System.out.println/*printlinea*/("Ingresa tu nombre:");
        nombre=leerNombre.next();
        Scanner leerEdad = new Scanner (System.in);
        System.out.println("Ingresa tu edad");
        edad=leerEdad.next();
        
        System.out.println("Tu nombre es:" + nombre + " y tu edad es de:" + edad + " años");
    }
    
}
