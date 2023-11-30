package com.sri.pi.dbknowledge.model;


import com.sri.pi.persona.enums.Aplicaciones;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class DbKnowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;


    private Aplicaciones aplicaciones;
    private String description;
    private String troubleShooting;

    private int estimateTime;


}
