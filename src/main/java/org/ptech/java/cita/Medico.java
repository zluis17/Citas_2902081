package org.ptech.java.cita;

public class Medico {

//por regla general
//los atributos de una clase
//deben ser privados

private int id;
private String nombres;
private String apellidos;
private TipoDocumento tipoDocumento;
private Long numeroDocumento;
private Long registroMedico;
private Especialidad especialidad;

//constructor por defecto
//siempre debe ser public
public Medico() {
}

public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
        Long registroMedico, Especialidad especialidad) {
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
}
//Getters y setters deben ser publicos
//firma de un getter:
//tipo de dato de retorno de un getter es el t.d del atributo
// nombre del metodo :
// get seguido del nombre del atributo
// retorna el valor del atributo

public String getNombres() {
    //return sirve para retornar el valor al invocante (main)
    
    return this.nombres;
}
//setter: sirve para asignar un valor a un atributo privado
//firma de un setter:
// - Tipo de dato  de retorno: VOID
// - Nombre: set seguido del nombre del atributo
// - Parametros, 1, input del valor a asignar al atributo
// - Retorna : nada
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


// constructor parametrizado




}
