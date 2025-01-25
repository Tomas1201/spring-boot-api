package com.curso.Springboot.Controllers;

import com.curso.Springboot.Entities.Asignatura;
import com.curso.Springboot.Services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> todasAsignaturas(){
        return asignaturaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Asignatura> getbyid(@PathVariable Long id){
       return asignaturaService.getbyid(id);
    }

    @PostMapping
    public ResponseEntity<Asignatura> Create_update(@RequestBody Asignatura asignatura){
        asignaturaService.Create_Update(asignatura);
        return ResponseEntity.ok(asignatura);
    }
}
