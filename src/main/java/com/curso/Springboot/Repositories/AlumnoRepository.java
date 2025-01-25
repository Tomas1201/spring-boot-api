package com.curso.Springboot.Repositories;

import com.curso.Springboot.Entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    List<Alumno> findBynombre(String name);
    List<Alumno> findByapellido(String name);

}
