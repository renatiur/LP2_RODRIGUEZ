package com.t1.rodriguez.repository;

import  com.t1.rodriguez.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProfesorRepository extends JpaRepository<Profesor, Integer> {
}
