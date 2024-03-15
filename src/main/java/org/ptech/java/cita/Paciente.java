package org.ptech.java.cita;
import java.time.LocalDate;

import org.ptech.java.cita.enums.Motivo;
import org.ptech.java.cita.enums.TipoDocumento;
import org.ptech.java.cita.enums.TipoSangre;

public class Paciente  extends usuario{


private String email;
private Long celular;
private LocalDate fechaNacimiento;
private Double altura;
private Double peso;
private TipoSangre tipoSangre;
private char factorRH;
private Motivo motivo;


public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
        String email, Long celular, LocalDate fechaNacimiento, Double altura, int i, TipoSangre tipoSangre,
        char factorRH) {
    super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
    this.email = email;
    this.celular = celular;
    this.fechaNacimiento = fechaNacimiento;
    this.altura = altura;
    this.tipoSangre = tipoSangre;
    this.factorRH = factorRH;
    this.motivo = motivo;


    
}


public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {
    super(id, nombres, apellidos, tipoDocumento, numeroDocumento);

    





}


@Override
public String toString() {
    return "Paciente [email=" + email + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", altura="
            + altura + ", peso=" + peso + ", tipoSangre=" + tipoSangre + ", factorRH=" + factorRH + "id:" + super.id + "nombres:" + super.nombres + "Apellidos:" + super.apellidos + "TipoDocumento:" + super.tipoDocumento + "numeroDocumento:" + super.numeroDocumento + "]";
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


public Long getCelular() {
    return celular;
}


public void setCelular(Long celular) {
    this.celular = celular;
}


public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}


public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}


public Double getAltura() {
    return altura;
}


public void setAltura(Double altura) {
    this.altura = altura;
}


public Double getPeso() {
    return peso;
}


public void setPeso(Double peso) {
    this.peso = peso;
}


public TipoSangre getTipoSangre() {
    return tipoSangre;
}


public void setTipoSangre(TipoSangre tipoSangre) {
    this.tipoSangre = tipoSangre;
}


public char getFactorRH() {
    return factorRH;
}


public void setFactorRH(char factorRH) {
    this.factorRH = factorRH;
}


public Motivo getMotivo() {
    return motivo;
}


public void setMotivo(Motivo motivo) {
    this.motivo = motivo;
}








}