package com.curso.Springboot.Controllers;

import com.curso.Springboot.Entities.Alumno;
import com.curso.Springboot.Services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService AlumnoService;

    /**
     * @
     * @param
     * @return
     */
    @GetMapping
    public List<Alumno> getallalumnos(){
        return AlumnoService.getallAlumnos();
    }

    @GetMapping("/alumnos/{id}")
    public Optional<Alumno> getalumno(@PathVariable Long id){
        return AlumnoService.getAlumno(id);
    }

    @PostMapping
    public ResponseEntity<Alumno> guardar(@RequestBody Alumno alumno){
    AlumnoService.saveorupdate(alumno);
    return ResponseEntity.ok(alumno);
    }
}
