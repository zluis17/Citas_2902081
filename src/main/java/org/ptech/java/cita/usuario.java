package org.ptech.java.cita;

import org.ptech.java.cita.enums.TipoDocumento;

//clase padre
//superclase
//clase maestra
//clase base


public abstract class usuario {

    // atributos a heredarse deben ser protec

protected int id;
protected String nombres;
protected String apellidos;
protected TipoDocumento tipoDocumento;
protected Long numeroDocumento;


public usuario(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getNombres() {
    return nombres;
}


public void setNombres(String nombres) {
    this.nombres = nombres;
}


public String getApellidos() {
    return apellidos;
}


public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}


public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
}


public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}


public Long getNumeroDocumento() {
    return numeroDocumento;
}


public void setNumeroDocumento(Long numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
}





}
