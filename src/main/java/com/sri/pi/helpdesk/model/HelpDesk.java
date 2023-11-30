package com.sri.pi.helpdesk.model;


import com.sri.pi.persona.model.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;

import lombok.Setter;

import java.time.LocalDate;

@Entity

@Setter@Getter

public class HelpDesk extends Persona {

    @Id
    private Long Id;

    @Override
    public LocalDate newhire() {
        return newhire;
    }
}
