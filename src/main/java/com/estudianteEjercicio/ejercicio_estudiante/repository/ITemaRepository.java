
package com.estudianteEjercicio.ejercicio_estudiante.repository;

import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository <Tema, Long> {
    
}
