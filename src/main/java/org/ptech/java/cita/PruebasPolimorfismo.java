package org.ptech.java.cita;

import java.time.LocalDate;

import org.ptech.java.cita.enums.Especialidad;
import org.ptech.java.cita.enums.TipoDocumento;
import org.ptech.java.cita.enums.TipoSangre;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
        // instanciar usuario
        usuario u = new Medico(1, "Oscar", "Ruiz", TipoDocumento.TI, 231423424L, 13231312321L,Especialidad.PEDIATRIA);
        
        System.out.println(u.toString());

        usuario u1 = new Medico(2, "Lucas", "Pepe", TipoDocumento.TI, 223123234234L, 1323131543534L,Especialidad.OTORRINOLARINGOLOGIA);
        
        System.out.println(u1.toString());

        usuario u2 = new Paciente (3, "Ñoño", "Suarez", TipoDocumento.RC,3123131L, "123@gmail.com",3213123L,LocalDate.of(2025, 3, 25), 1.70, 30, TipoSangre.B, '+');
        
        System.out.println(u2.toString());

        usuario u3 = new Enfermero(4, "Locuaz", "Rojas", TipoDocumento.TI,132313L);
        
        System.out.println(u3.toString());



    }
}
