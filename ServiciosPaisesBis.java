package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosPaises {

    HashSet<Pais> conjuntoPaises = new HashSet();

    public void cargarPaises() {

        Scanner leer = new Scanner(System.in);

        boolean continua;

        do {

            System.out.println("Ingrese el pais");

            String nombrePais = leer.nextLine();

            Pais nuevoPais = new Pais(nombrePais);

            if (conjuntoPaises.contains(nuevoPais)) {

                System.out.println("El pais " + nombrePais + " ya esta ingresado");
            } else {

                conjuntoPaises.add(nuevoPais);

                System.out.println("El pais " + nombrePais + " se ha ingresado");

            }

            System.out.println("Desea ingresar otro pais? ");

            continua = leer.nextBoolean();
            
            leer.nextLine();

        } while (continua);

        mostrarPaises(conjuntoPaises);

    }

    private void mostrarPaises(Iterable<Pais> paises) {

        for (Pais pais : paises) {

            System.out.println(pais.getNombre());

        }
    }

    public void mostrarPaisesOrdenados() {

        Comparator<Pais> comparadorPaises = new Comparator<Pais>() {
            @Override
            public int compare(Pais pais1, Pais pais2) {
                return pais1.getNombre().compareTo(pais2.getNombre());
            }
        };

        ArrayList<Pais> paisesOrdenados = new ArrayList(conjuntoPaises);

        Collections.sort(paisesOrdenados, comparadorPaises);
        
        mostrarPaises(paisesOrdenados);
    }
    
    public void eliminarPais(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el pais a eliminar");
        
        String nombre = leer.nextLine();
        
        Iterator<Pais> iterador = conjuntoPaises.iterator();
        
        boolean encontrado = false;
        
        while(iterador.hasNext()){
            
            Pais pais = iterador.next();
            
            if(pais.getNombre().equals(nombre)){
                
                iterador.remove();
                
                encontrado = true;
                
                break;
                
                
            }
        }
        
        if(encontrado){
            
            mostrarPaises(conjuntoPaises);
        }
        
        else{
            
            System.out.println("El pais no se encontro");
        }
    }

}
