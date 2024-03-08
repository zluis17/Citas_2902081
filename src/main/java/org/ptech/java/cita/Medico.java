package org.ptech.java.cita;

import org.ptech.java.cita.enums.Especialidad;
import org.ptech.java.cita.enums.TipoDocumento;

//clases que heredan:
// - hijas
// - subclases
// - clases detalle
// - clases especificas

public class Medico extends usuario {



private Long registroMedico;
private Especialidad especialidad;


@Override
public String toString() {
    return "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]"+ "nombre:" +super.nombres + "]" ;
}

public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
        Long registroMedico, Especialidad especialidad) {
    super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
        }

public Long getRegistroMedico() {
    return registroMedico;
}

public void setRegistroMedico(Long registroMedico) {
    this.registroMedico = registroMedico;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}







}
