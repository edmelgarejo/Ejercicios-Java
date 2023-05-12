/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej5.Entidad;

import java.util.Date;

/**
 *
 * @author W10
 */
public class Persona {
    
    private String Nombre;
    private String Apellido;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, Date fechaNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
