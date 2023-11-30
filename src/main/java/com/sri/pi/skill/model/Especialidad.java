package com.sri.pi.skill.model;


import jakarta.persistence.*;
import lombok.*;



@Entity

@NoArgsConstructor
@AllArgsConstructor


@Data
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Long Id;


    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "TiempoEstimado")
    private int tiempoEstimado;

}
