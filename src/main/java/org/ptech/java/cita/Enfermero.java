package org.ptech.java.cita;

import java.util.ArrayList;
import java.util.List;
import org.ptech.java.cita.enums.TipoDocumento;

public class Enfermero extends usuario {

    private List <String> procedimientos;

    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {

        
        
       
       // llamar al constructor de
       // super clase
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        // inicializar atributos
        //intrinsecos del objeto

        this.procedimientos = new ArrayList<String>();

    }

    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + "id:" + super.id + "nombres:" + super.nombres + "Apellidos:" + super.apellidos + "TipoDocumento:" + super.tipoDocumento + "numeroDocumento:" + super.numeroDocumento + "]";
    }

    public void addProcedure (String procedure){
        //añadir el procedimiento 
        // a la lista de procedimientos
        this.procedimientos.add(procedure);
        


    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }

 
    }

    


