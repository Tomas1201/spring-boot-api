package com.curso.Springboot.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_asignatura;
    private int hcatedra;
    private String nombre;

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int gethcatedra() {
        return hcatedra;
    }

    public void sethcatedra(int hcatedra) {
        this.hcatedra = hcatedra;
    }
}
