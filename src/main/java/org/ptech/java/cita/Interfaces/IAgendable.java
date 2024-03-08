package org.ptech.java.cita.Interfaces;

import java.time.LocalDateTime;

import org.ptech.java.cita.Consultorio;

public interface IAgendable {
    //proponer un metod para agendar la cita

    public boolean agendarCita (LocalDateTime fecha, Consultorio c );

    //proponer un metodo para reagendar cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);
     // cancelar cita
     public boolean cancelarCita ();

}
