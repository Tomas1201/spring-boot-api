package com.curso.Springboot.Services;

import com.curso.Springboot.Entities.Alumno;
import com.curso.Springboot.Entities.Profesor;
import com.curso.Springboot.Repositories.AlumnoRepository;
import org.hibernate.boot.model.internal.XMLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository AlumnoRepository;

    private Profesor pe = new Profesor();




    public List<Alumno> getallAlumnos(){
        return AlumnoRepository.findAll();
    }

    public Optional<Alumno> getAlumno(Long id){
        return AlumnoRepository.findById(id);
    }

    public void saveorupdate(Alumno alu){
        AlumnoRepository.save(alu);
    }

    public List<Alumno> getBynames(String name){
        return AlumnoRepository.findBynombre(name);
    }

    public List<Alumno> getByapellidos(String name){
        return AlumnoRepository.findByapellido(name);
    }
}
