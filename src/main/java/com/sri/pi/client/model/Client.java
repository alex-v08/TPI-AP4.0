package com.sri.pi.client.model;

import com.sri.pi.persona.model.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;


@Data
@Entity
@Getter@Setter

@AllArgsConstructor
@NoArgsConstructor
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
