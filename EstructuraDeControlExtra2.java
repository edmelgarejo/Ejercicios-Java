/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg2;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A = 1;
        int B = 2;
        int C = 3; 
        int D = 4;
        int Aux = 0;
       
        Aux = B;
        B = C;
        C = A;
        A = D;
        D = Aux;
        
        System.out.println("A: " + A + " B: "+ B + " C: "+ C + " D: "+ D);
        
        
        
        
        
    }
    
}
