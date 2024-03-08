package org.ptech.java.cita;
import java.time.LocalDateTime;

import org.ptech.java.cita.enums.EstadoCita;


public class Cita {

    int id;
     LocalDateTime fecha;
     Consultorio consultorio;
     paciente;
    public Cita() {

        
    }
    public Cita(int id, LocalDateTime fecha, Paciente paciente,Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.paciente = paciente;


        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
}