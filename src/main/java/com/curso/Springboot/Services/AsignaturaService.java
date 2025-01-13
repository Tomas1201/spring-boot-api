package com.curso.Springboot.Services;

import com.curso.Springboot.Entities.Asignatura;
import com.curso.Springboot.Repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<Asignatura> traertodo(){
       return asignaturaRepository.findAll();
    }

    public Optional<Asignatura> getbyid(Long id){
        return asignaturaRepository.findById(id);
    }

    public void Create_Update(Asignatura asi){
        asignaturaRepository.save(asi);
    }
}
