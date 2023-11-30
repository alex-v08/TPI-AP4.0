package com.sri.pi.dptoComercial.entity;


import com.sri.pi.client.model.Client;
import com.sri.pi.persona.model.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity

@Setter@Getter

@NoArgsConstructor
@AllArgsConstructor



public class DptoComercial extends Persona {

    @Id
    private Long Id;


    @Override
    public LocalDate newhire() {

        newhire = LocalDate.now();

        return newhire;

    }


    public newClient() {
        return new Client();
    }
}
