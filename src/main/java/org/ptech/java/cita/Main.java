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
        Medico m2 = new Medico(3,"Anyi", "Rojas",TipoDocumento.CC,1231432232L,3423453453L,Especialidad.PEDIATRIA);


        System.out.println("id del medico:" + m1.getId() + "nombre del medico:" + m1.getNombres() + "apellido del medico:" +  m1.getApellidos() + m1.getEspecialidad());

        // crear un enfermero:
        Enfermero e1 = new Enfermero(2, "Albeiro", "Rodrigo",TipoDocumento.CC, 12334213L);
        Enfermero e2 = new Enfermero (4, "Juliana", "Villalobos", TipoDocumento.TI,31231231L);
        Enfermero e3 = new Enfermero(5, "Luis", "Ramos", TipoDocumento.TI, 12312342342L);
        Enfermero e4 = new Enfermero(6, "Alejo", "Quintero", TipoDocumento.TI, 123123442342342L);

        //Crear Pacientes
        Paciente p1 = new Paciente(7, "Zoe", "Quintero",TipoDocumento.TI, 242342342L);
        Paciente p2 = new Paciente(8, "Luisa", "Rayo",TipoDocumento.TI, 54545454L);
        Paciente p3 = new Paciente(9, "Anyi", "Ruiz",TipoDocumento.TI, 27676767L);
        Paciente p4 = new Paciente(10, "Kevin", "Herrera",TipoDocumento.TI, 28753434L);
        Paciente p5 = new Paciente(11, "Michell", "Puerta",TipoDocumento.TI, 31231231L);

        //Crear Consultorio
        Consultorio c1 = new Consultorio (17, "calle 54", 1323124, LocalDateTime.now(),504);
        Consultorio c2 = new Consultorio (18, "calle 55", 1323126, LocalDateTime.now(),505);
        Consultorio c3 = new Consultorio (19, "calle 56", 1323127, LocalDateTime.now(),506);

        //Citas
        CitaMedico cita1 = new CitaMedico(12,LocalDateTime.now(), p5, c1);
        CitaMedico cita2 = new CitaMedico(13,LocalDateTime.now(), p2,c3);
        

        //añadir dos procedimiento al enfermero
        e1.addProcedure("Aplicar inyección");
        e2.addProcedure("tomar signos vitales");
        e3.addProcedure("Gripa");
        e4.addProcedure("Escopolamina");
      


            //cita Enfermeros 
            CitaEnfermeros citaEnfermero1 = new CitaEnfermeros (17,LocalDateTime.now(),p4,e2);

            

            CitaEnfermeros citaEnfermero2 = new CitaEnfermeros (18,LocalDateTime.now(),p2,e1);


            System.out.println("fecha:" + LocalDateTime.now() + "consultorio" + c1.getId() + "nombres de Medico" + m1.getNombres() + "Apellidos del Medico" + m1.getApellidos() + "Motivo" + m1);
            System.out.println("fecha:" + LocalDateTime.now() + "consultorio" + c2.getId() + "nombres de Medico" + m2.getNombres() + "Apellidos del Medico" + m2.getApellidos() + "Motivo" + m2);

           

            cita1.cancelarCita();
            System.out.println("cita Medico id 1:" + c1.getEstado());    
            
          
               



        




        

    }
}