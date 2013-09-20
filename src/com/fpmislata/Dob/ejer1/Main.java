/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.Dob.ejer1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      
        Persona persona= new Persona("David" , "Oliver" ,Sexo.HOMBRE ,"53213468L");
        
     
        
        System.out.println("Mi nombre es :" + persona.getNombre());
        System.out.println("Mi apellido es :"+persona.getAp1());
        System.out.println("Soy un :" +persona.getSexo());
        System.out.println("Mi nombre comprleto es : "+ persona.getNombreCompleto());
        
        // TODO code application logic here
    }
}
