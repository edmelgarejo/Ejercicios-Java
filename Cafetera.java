/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseservicioej2.entidad;

/**
 *
 * @author MarinaElizabeth
 */
public class Cafetera {
  private float capacidadMaxima = 5;
  private float cantidadActual;

    public Cafetera() {
    }

    public Cafetera(float capacidadMaxima, float cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public float getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
  
  
    
    
    
    
}
