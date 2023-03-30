/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprograma.java.ej.pkg2;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class SubProgramaJavaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String nombre = "f";
        int edad = 0;
        boolean opcion;
        do{
            mostrarInfo(nombre,edad);
            
            System.out.println("Desea continuar");
            String respuesta = leer.nextLine ();
     
            if (respuesta = "s"){
                    opcion = true;
            }else if (respuesta = "n"){
                    opcion = false;
            }
        }while (opcion = true);
    
    
}
    public static void mostrarInfo (String nombre, int edad){
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca el nombre");
        nombre = leer.nextLine();
        
        System.out.println("Introduzca la edad");
        edad = leer.nextInt(); 
        
        if (edad < 21){
            System.out.println(nombre+" tiene "+edad+" años y es menor edad");
        }else{
            System.out.println(nombre+" tiene "+edad+" años y es mayor de edad");
        }
    }
     
}
