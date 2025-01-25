package com.curso.Springboot.Controllers;

import com.curso.Springboot.Entities.Profesor;
import com.curso.Springboot.Services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getall(){
        return profesorService.getAll();
    };

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Profesor>> getByID(@PathVariable("id") Long id){
        return profesorService.getByID(id);
    }

    @GetMapping("/nombre/{name}")
    public List<Profesor> getByname(@PathVariable("name") String name){
        return profesorService.getAllByname(name);
    }

    @GetMapping("/apellido/{apellido}")
    public List<Profesor> getByapellido(@PathVariable("apellido") String apellido){
        return profesorService.getAllByapellido(apellido);
    }

    @PostMapping
    public ResponseEntity<Profesor> save(@RequestBody Profesor profe){
        Profesor New = profesorService.save(profe);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(New.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/list")
    public ResponseEntity<Profesor> save(@RequestBody List<Profesor> profe){
        profesorService.save(profe);
        return ResponseEntity.ok().build();
    }
}
