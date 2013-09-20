/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.Dob.ejer1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Map<String,Persona>mapPersona= new HashMap<String,Persona>();
        List<Persona> personas = new LinkedList<Persona>();
        Persona persona1 = new Persona("Pepe", "Federico", Sexo.HOMBRE, "53698745P");
         Persona persona2 =new Persona("Fredi", "Artoler", Sexo.MUJER, "54789123T");
        Persona persona3 = new Persona("Antonia", "Ricardo", Sexo.INDEFINIDO, "78965412Ñ");
        

        
        
        mapPersona.put(persona1.getDni(),persona1);
         mapPersona.put(persona3.getDni(),persona3);
         mapPersona.put(persona2.getDni(),persona2);
         Persona personaBuscada=mapPersona.get("54789123T");
         System.out.println(personaBuscada.getNombreCompleto());
         
        Set<String> dnis=mapPersona.keySet();
            for(String dni:dnis){
                Persona persona=mapPersona.get(dni);
                System.out.println(dni+ " " + persona.getNombreCompleto());
            }
         
      /*  String dni="54789123T";
        for (Persona persona : personas) {
            
               if(persona.getDni().equals(dni)){
                   System.out.println(persona.getNombreCompleto());
               }

        }
        System.out.println("Nº de elementos: " + personas.size());


        // TODO code application logic here
    }
*/
}
}
