/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebas;

/**
 *
 * @author AlumnoD
 */
public class Contacto {
    String nombre;
    String prApellido;
    String sdApellido;
    String tipoPersona; /*(Cliente, Personal, Jefe...)*/
    
    public Contacto(String nombre, String prApellido, String sdApellido, String tipoPersona){
        this.nombre = nombre;
        this.prApellido = prApellido;
        this.sdApellido = sdApellido;
        this.tipoPersona = tipoPersona;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
