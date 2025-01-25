package com.curso.Springboot.Repositories;

import com.curso.Springboot.Entities.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {


    List<Asignatura> findByhcatedra(int h);
}
