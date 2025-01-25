package com.curso.Springboot.Repositories;

import com.curso.Springboot.Entities.Profesor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {


    /**
     *
     * @param n
     * @return
     */
    //Devuelve un profesor con ese nombre si existe, sino es null
    List<Profesor> findBynombre(String n);
    //Devuelve un profesor con ese apellido si existe, sino es null

    List<Profesor> findByapellido(String n);


    List<Profesor> findBynombreStartingWithOrderByNombreAsc(@Param("prefijo")String prefijo);


    List<Profesor> findByapellidoStartingWithOrderByNombreAsc(@Param("prefijo")String prefijo);
}
