package org.ptech.java.cita;

import java.time.LocalDateTime;

import org.ptech.java.cita.enums.EstadoCita;

public class CitaEnfermeros extends  Cita implements lAgendable {

    Enfermero enfermero;
    EstadoCita estado;
    public String procesoRealizar;
    
    public CitaEnfermeros(int id, LocalDateTime fecha, Paciente paciente, Enfermero e2) {
        super(id, fecha, paciente, e2);
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public EstadoCita getEstado() {
        return estado;
    }
    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    public String getProcesoRealizar() {
        return procesoRealizar;
    }
    public void setProcesoRealizar(String procesoRealizar) {
        this.procesoRealizar = procesoRealizar;
    }

    
    



}
