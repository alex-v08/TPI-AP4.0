package com.sri.pi.persona.model;

import com.sri.pi.persona.enums.Rol;
import com.sri.pi.persona.enums.TipoDoc;


import java.time.LocalDate;


public abstract class Persona {


    protected String nombre;
    protected String direccion;
    protected String nroDoc;

    protected LocalDate newhire;
    protected String email;
    protected TipoDoc tipoDoc;
    protected Rol rol;
    protected LocalDate fechaAlta;






    public abstract LocalDate newhire();


}
