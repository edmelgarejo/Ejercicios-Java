/*
    CrearunaclasellamadaOperacionquetengacomoatributosprivados numero1ynumero2.Acontinuación,sedebencrearlossiguientes métodos: a) Métodoconstructorcontodoslosatributospasadosporparámetro. b) Métodoconstructorsinlosatributospasadosporparámetro. c) Métodosgetyset. d) MétodoparacrearOperacion():quelepidealusuariolosdos númerosylosguardaenlosatributosdelobjeto. e) Métodosumar():calcularlasumadelosnúmerosydevolverel resultadoalmain. f) Métodorestar():calcularlarestadelosnúmerosydevolverel resultadoalmain g) Métodomultiplicar():primerovalidaquenosehagauna multiplicaciónporcero,sifueraamultiplicarporcero,elmétodo devuelve0yseleinformaalusuarioelerror.Sino,sehacela multiplicaciónysedevuelveelresultadoalmain h) Métododividir():primerovalidaquenosehagaunadivisiónporcero, sifueraapasarunadivisiónporcero,elmétododevuelve0ysele informaalusuarioelerrorseleinformaalusuario.Sino,sehacela divisiónysedevuelveelresultadoalmain.

 */
package pooejercicio3;

import pooejercicio3.entidad.Operacion;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion op = new Operacion ();
        op.crearOperacion();
        System.out.println("La suma es "+op.sumar());
        System.out.println("La resta es "+op.resta());
        System.out.println("La multiplicacion es "+op.multiplicacion());
        System.out.println("La division es "+op.division());
    }
    
}
