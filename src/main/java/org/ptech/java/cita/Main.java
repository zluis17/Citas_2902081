package org.ptech.java.cita;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.cita.Especialidad;
import org.ptech.java.cita.Medico;
import org.ptech.java.cita.TipoDocumento;

public class Main {
    public static void main(String[] args) {

        //crear un objeto medico
        //instanciar medico
        //una manera de dar valor
        //atributos privados a una clase es a traves del constructor parametrizadp
        Medico m= new Medico (1,"Alejandro", "Quintero",TipoDocumento.PPT,1069475827L,231234323L,Especialidad.MEDICINA_GENERAL);

        //instanciar otro medico
        Medico m2= new Medico();
        //se debe utilizar primero el setter del atributo a asignar
        m2.setNombres("Luis");
        m2.setApellidos("Ramos");
        m2.setNumeroDocumento(31231231L);
        System.out.println(m2.getNombres());
        

        Paciente m3= new Paciente();
        m3.setNombres("dayana");
        m3.setApellidos("Aguilar");
        m3.setNumeroDocumento(312123123L);
        System.out.println(m3.getNombres());

        Consultorio m4= new Consultorio();
        m4.setNumero(35);
        System.out.println(m4.getNumero());

        Cita m5= new Cita();
        m5.setEstado (EstadoCita.AGENDADA);
        m5.setFecha (LocalDateTime.now());
        System.out.println("Estado"+ "" + m5.getEstado() + " fecha " + m5.getFecha() );

        


    }
}