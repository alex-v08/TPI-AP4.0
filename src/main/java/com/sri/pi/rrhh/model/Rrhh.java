package com.sri.pi.rrhh.model;


import com.sri.pi.persona.model.Persona;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "rrhh")

public class Rrhh extends Persona {

    @Id
    private Long Id;

    public Rrhh() {

    }


    @Override
    public LocalDate newhire() {

        LocalDate newhire = LocalDate.now();

        return newhire;
    }
}
