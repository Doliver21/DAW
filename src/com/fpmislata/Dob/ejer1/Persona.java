/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.Dob.ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 *
 */
public class Persona {

    private String nombre;
    private String ap1;
    private Sexo sexo;
    private String dni;
    List<Persona> personas = new ArrayList<Persona>();

    public Persona(String nombre, String ap1, Sexo sexo, String dni) {
        this.nombre = nombre;
        this.ap1 = ap1;
        this.sexo = sexo;
        this.dni = dni;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombreCompleto() {
        String nombreCompleto = nombre + " " + " " + ap1;
        return nombreCompleto;


    }
}
