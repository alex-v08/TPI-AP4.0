package com.sri.pi.incidente.model;


import com.sri.pi.client.model.Client;

import com.sri.pi.tecnico.model.Tecnico;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

import java.util.Set;


@Data
@Entity

public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String description;
    private String troubleShooting;



    @OneToMany(mappedBy = "incidente")
    @JoinTable (name = "incidente_especialidad",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private Set<Tecnico> tecnicos;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    private LocalDate estimateTime;



    private LocalDate closedDate;

    private Boolean isResolved;


}
