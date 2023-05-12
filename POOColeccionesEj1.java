/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionesej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author W10
 */
public class POOColeccionesEj1 {

    /**
     * @param args the command line arguments 1)Diseñar un programa que lea y
     * guarde razas de perros en un ArrayList de tipo String. El programa pedirá
     * una raza de perro en un bucle, el mismo se guardará en la lista y después
     * se le preguntará al usuario si quiere guardar otro perro o si quiere
     * salir. Si decide salir, se mostrará todos los perros guardados en el
     * ArrayList.
     *
     * 2)Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> ArrayPerros = new ArrayList();
        boolean bandera = true;
        char opcion;
        String buscarRaza;
        do {
            System.out.println("Introduzca una raza de perro");
            ArrayPerros.add(leer.next());

            System.out.println("¿Quiere ingresar otro perro?");
            System.out.println("s-si");
            System.out.println("n-no");
            opcion = leer.next().charAt(0);

            if (opcion == 's') {
                bandera = true;
            } else {
                bandera = false;
            }
        } while (bandera);

        System.out.println("La cantidad perros introducidos es " + ArrayPerros.size());

        for (String raza : ArrayPerros) {
            System.out.println(raza);
        }
        System.out.println("¿Cual de las razas de perro introducidas quiere buscar?");
        buscarRaza = leer.next();

        Iterator Buscar = ArrayPerros.iterator();

        boolean coincidencia = true;

        while (Buscar.hasNext()) {
            if (Buscar.next().equals(buscarRaza)) {
                System.out.println("Procediendo a eliminar "+buscarRaza);
                Buscar.remove();
                coincidencia = false;
            }
        }
        if (coincidencia) {
            System.out.println("La raza ingresada no existe");
        }
        Collections.sort(ArrayPerros);
        for (String CollectionsRaza : ArrayPerros) {
            System.out.println(CollectionsRaza);
        }
    }
}
