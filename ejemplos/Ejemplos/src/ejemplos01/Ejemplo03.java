/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // 
        int valor = obtenerSuma(10, 30); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
        
        int valor2 = obtenerSuma2();
         System.out.printf("El valor2 de la suma es: %d\n", valor2);
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
        // return a + b;
    }
    public static int obtenerSuma2(){
        Scanner entrada = new Scanner(System.in);
        
        int suma;
        int a;
        int b;
        
        System.out.println("Ingrese el valor de a");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextInt();
        
        suma = a + b;
        return suma;
        // return a + b;
    }
    
    
}
