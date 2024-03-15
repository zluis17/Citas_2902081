package org.ptech.java.cita;

import java.time.LocalDateTime;

public class Consultorio {

    private int id;
    private String direccion;
    private int numero;
    private LocalDateTime fecha;
    private  int consultorio;
    

    


    @Override
    public String toString() {
        return "Consultorio [id=" + id + ", direccion=" + direccion + ", numero=" + numero + "]";
    }


    public Consultorio() {
    }


    
    


   

   

    public Consultorio(int id, String direccion, int numero, LocalDateTime fecha, int consultorio) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
        this.fecha = fecha;
        this.consultorio = consultorio;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public int getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }


    public String getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }


    
    


}
