/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd7;

/**
 *
 * @author usuario
 */
public class Alumno {
    private final String nombre;
    private final String apellido;
    private final int cedula;

    public Alumno(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }
    
    @Override
    public String toString() {
        return nombre + apellido + cedula;
    }
}
