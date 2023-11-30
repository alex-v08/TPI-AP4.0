package com.sri.pi.cliente.model;

import com.sri.pi.incidente.model.Incidente;
import com.sri.pi.persona.model.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
public class Cliente extends Persona {
    @Id
    private Long Id;
    private String razonsocial;
    private String CUIT;
    private String categoria;

    @Override
    public LocalDate newhire() {
        return newhire;
    }
}
