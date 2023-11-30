package com.sri.pi.rrhh.model;


import com.sri.pi.persona.model.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Rrhh extends Persona {

    @Id
    private Long Id;

    public Rrhh() {

    }


    @Override
    public LocalDate newhire() {
        return newhire;
    }
}
