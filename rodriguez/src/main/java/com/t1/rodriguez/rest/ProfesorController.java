package com.t1.rodriguez.rest;

import com.t1.rodriguez.model.Profesor;
import com.t1.rodriguez.services.IProfesorServices;
import com.t1.rodriguez.services.IProfesorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfesorController {

    IProfesorServices profesorServices;

    @Autowired
    public ProfesorController(IProfesorServices profesorServices) {
        this.profesorServices=profesorServices;
    }

    @GetMapping("/profesores")
    public List<Profesor> getAll() {
        return profesorServices.GetAllProfesores();
    }

    @GetMapping("/profesor/{id}")
    public Profesor getAll(@PathVariable int id) {
        return profesorServices.FindProfesorById(id);
    }

    @PostMapping("/profesor")
    public Profesor saveProfesor(@RequestBody Profesor entity) { return profesorServices.SaveProfesor(entity); }

    @PutMapping("/profesor/{id}")
    public Profesor updateProfesor(@PathVariable int id, @RequestBody Profesor entity) { return profesorServices.UpdateProfesor(id, entity); }

    @DeleteMapping("/profesor/{id}")
    public void deleteProfesor(@PathVariable int id) { profesorServices.DeleteProfesor(id); }
}
