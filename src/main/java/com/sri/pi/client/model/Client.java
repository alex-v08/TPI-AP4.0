package com.sri.pi.client.model;

import com.sri.pi.persona.model.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Data
@Entity
@Getter@Setter
public class Client extends Persona {
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
