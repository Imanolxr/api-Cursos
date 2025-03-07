
package com.estudianteEjercicio.ejercicio_estudiante.repository;

import com.estudianteEjercicio.ejercicio_estudiante.model.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository <Curso, Long> {
    List<Curso> findByNombreContainingIgnoreCase(String palabra);
    
}
