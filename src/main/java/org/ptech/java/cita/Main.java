package org.ptech.java.cita;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import org.ptech.java.cita.Medico;


import org.ptech.java.cita.enums.Especialidad;
import org.ptech.java.cita.enums.EstadoCita;
import org.ptech.java.cita.enums.TipoDocumento;

public class Main {
    public static void main(String[] args) {

        //crear medico
        Medico m1 = new Medico(1, "Alejandro", "Quintero",TipoDocumento.TI, 1069475827L, 2323232L, Especialidad.ONCOLOGIA);

        System.out.println("id del medico:" + m1.getId() + "nombre del medico:" + m1.getNombres() + "apellido del medico:" +  m1.getApellidos() + m1.getEspecialidad());

        // crear un enfermero:
        Enfermero e1 = new Enfermero(2, "Albeiro", "Rodrigo",TipoDocumento.CC, 12334213L);
        
        //añadir dos procedimiento al enfermero
        e1.addProcedure("Aplicar inyección");
        e1.addProcedure("tomar signos vitales");

        //recorrer los procedimientos de e1
        for (   String p  :e1.getProcedimientos()){
            System.out.println("procedimientos:" + p);
            


        }




        

    }
}