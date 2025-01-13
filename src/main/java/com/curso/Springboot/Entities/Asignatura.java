package com.curso.Springboot.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_asignatura;
    private String f;
    private String nombre;

}
