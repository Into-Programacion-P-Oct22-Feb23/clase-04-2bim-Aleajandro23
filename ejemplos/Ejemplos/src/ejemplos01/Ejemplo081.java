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
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int op;
        String mensaje;
        String mensajeSuma;
        String mensajeSumaDos;
        
        System.out.println("Ingrese numero para realizar el proceso");
        op = entrada.nextInt();
        
        if (op == 1) {
            mensajeSuma = obtenerTablaSumar(10, 9);
            System.out.println(obtenerTablaSumar(10, 9));
        } else
            if (op == 2) {
            mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
                System.out.println( obtenerTablaMultiplicar(10, 9));
        }else
                System.out.println("Error");
        
        
        
        
       
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
