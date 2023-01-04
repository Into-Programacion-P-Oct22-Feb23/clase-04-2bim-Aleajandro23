/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                      correspondencia
        String cadena01 = "Loja";
        
     // String miCiudad = obtenerCiudadMayuscula("Loja");
        String miCiudad = obtenerCiudadMayuscula(cadena01);
        System.out.printf("%s\n", miCiudad);
        
        // opcion 1
        String mensaje_R = obtenerNombre();
        System.out.println(mensaje_R);
        
        // opcion 2
        System.out.println(obtenerNombre());
        System.out.printf("%s\n", obtenerNombre());

    }
    
    
    public static String obtenerCiudadMayuscula(String m){
        // ingresa asi loja
        String m2 = m.toUpperCase();   // .toUpperCase(); que haga en mayuscula
        return m2; //retornar
        // retorna LOJA
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        
    }
    
    public static String obtenerNombre(){
        return "Luis";
            
    }
    
    
}

// los procedimientos no retornan nada
// si lo dejo en void es un procedimiento
// el void no retorna nada
// quito el void y remplazar por :
// int
// double
// boolean
// int[]
// double[][]