package com.curso.Springboot.Services;

import com.curso.Springboot.Entities.Profesor;
import com.curso.Springboot.Repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> getAll(){
      return profesorRepository.findAll();
    };

    public ResponseEntity<Optional<Profesor>> getByID(Long n){
        Optional<Profesor> a= profesorRepository.findById(n);
        if (a.isEmpty()){
            return ResponseEntity.notFound().build();
        }
            return ResponseEntity.ok(a);

    };

    public List<Profesor> getByname(String name){
        return profesorRepository.findBynombre(name);
    };

    public List<Profesor> getAllByname(String sufijo){
        return profesorRepository.findBynombreStartingWithOrderByNombreAsc(sufijo);
    };

    public List<Profesor> getAllByapellido(String apellido){
        return profesorRepository.findByapellidoStartingWithOrderByNombreAsc(apellido);
    }

    public Profesor save(Profesor p){
        return profesorRepository.saveAndFlush(p);

    }

    public void save(List<Profesor> p){
        p.forEach(c -> profesorRepository.save(c));
    }
}
