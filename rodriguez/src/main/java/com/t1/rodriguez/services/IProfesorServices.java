package com.t1.rodriguez.services;

import com.t1.rodriguez.model.Profesor;
import java.util.List;

public interface IProfesorServices {
    List<Profesor> GetAllProfesores();

    Profesor SaveProfesor(Profesor entity);

    Profesor FindProfesorById(int id);

    Profesor UpdateProfesor(int id, Profesor entity);

    void DeleteProfesor(int id);

    List<Profesor> SearchProfesores(String name);
}

