package com.sri.pi.empleado.model;


import com.sri.pi.persona.model.Persona;

import java.time.LocalDate;

public class Empleado extends Persona {


    @Override
    public LocalDate newhire() {
        return newhire;
    }
}
