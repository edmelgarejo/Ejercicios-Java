/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocolectionsej3.Entidad.Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import poocolectionsej3.Entidades.Alumno;

/**
 *
 * @author W10
 */
public class AlumnoServicio {
//Clase Servicio
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> listaAlumno = new ArrayList(); // El Arralist tipo alumno que guarda la lista de alumnos introducida por teclado
    char opcion;

    public void CrearAlumno() {
        do {
            System.out.println("Introduzca el nombre del alumno");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList(); //Se crea un ArrayList para guardar las 3 notas introducidas por teclado
            for (int i = 0; i < 3; i++) {
                System.out.println("Introduzca la nota NÂº" + (i + 1));
                notas.add(leer.nextInt());//Este metodo introuce las notas en el ArrayList "notas"
            }
            Alumno a1 = new Alumno(nombre, notas);//Se crea el objeto Alumno y se pasa por parametro (nombre y notas)
            listaAlumno.add(a1); //Se guarda la información en el arrayList listaAlumno

            System.out.println("Â¿Quiere ingresar otro Alumno? s/n");
            opcion = leer.next().charAt(0);//se utiliza para salir del bucle
        } while (opcion != 'n');
    }

    public void notaFinal() {
        char opcionNota;
        do{
        System.out.println("Introduzca el nombre del alumno que quiera calcular la nota final");
        String nombre = leer.next();
        int auxNota = 0;
        boolean bandera = true;
       
        for (Alumno buscarNombre : listaAlumno){//Se utiliza el ForE para buscar en el objeto Alumno en nombre introducido a buscar.
            if (buscarNombre.getNombre().equals(nombre)) {//Se compara getNombre y la variable nombre
                System.out.println("El promedio final de "+ buscarNombre.getNombre() +" es "+buscarNombre.promedio());//buscarNombre.promedio () en una funcion dentro de la Clase Alumno
                bandera = false;//Se utiliza para no ingresar la salida de datos en la linea nº 55.
            }
        }
        if (bandera == true){
            System.out.println("El nombre ingresado no se encuentra dentro de la lista");
        }
            System.out.println("¿Desea calcular la nota final de otro alumno? s/n");//es un agregado para sacar la nota final de otro alumno.
            opcionNota = leer.next().charAt(0);
        }while (opcionNota != 'n');
    }
}
