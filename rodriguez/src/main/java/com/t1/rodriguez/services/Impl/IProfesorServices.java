package com.t1.rodriguez.services.Impl;


import com.t1.rodriguez.model.Profesor;
import com.t1.rodriguez.repository.IProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class IProfesorServices implements com.t1.rodriguez.services.IProfesorServices {

    IProfesorRepository _profesorRepository;

    @Autowired
    public IProfesorServices(IProfesorRepository profesorRepository) {
        _profesorRepository = profesorRepository;
    }

    @Override
    public List<Profesor> GetAllProfesores() {
        return _profesorRepository.findAll();
    }

    @Override
    public Profesor SaveProfesor(Profesor entity) {
        Profesor profesorSaved = _profesorRepository.save(entity);
        return profesorSaved;
    }

    @Override
    public Profesor FindProfesorById(int id) {
        Optional<Profesor> rowInDB = _profesorRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new Profesor();
    }

    @Override
    public Profesor UpdateProfesor(int id, Profesor entity) {
        Optional<Profesor> rowInDB = _profesorRepository.findById(id);
        if (rowInDB.isPresent()) {
            Profesor pro = rowInDB.get();
            pro.setNombre(entity.getNombre());
            pro.setApellidos(entity.getApellidos());
            pro.setEdad(entity.getEdad());
            pro.setGenero(entity.getGenero());
            pro.setCurso(entity.getCurso());
            return _profesorRepository.save(pro);
        } else {
            return null;
        }
    }

    @Override
    public void DeleteProfesor(int id) {
        _profesorRepository.deleteById(id);
    }

    @Override
    public List<Profesor> SearchProfesores(String name) {
        return null;
    }
}
