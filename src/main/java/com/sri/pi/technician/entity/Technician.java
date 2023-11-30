package com.sri.pi.technician.entity;


import com.sri.pi.skill.model.Especialidad;
import com.sri.pi.persona.enums.MedioCom;
import com.sri.pi.persona.model.Persona;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Technician extends Persona {
    @Id
    private Long Id;
    private Boolean isDisponible;

    @OneToMany
    @JoinTable (name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private Set<Especialidad> especialidades;

    private String whatsapp;
    private MedioCom medioCom;


    public Technician() {
        super();
    }


    @Override
    public LocalDate newhire() {
        return newhire;
    }
}
