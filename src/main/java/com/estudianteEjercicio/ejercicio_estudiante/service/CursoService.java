
package com.estudianteEjercicio.ejercicio_estudiante.service;

import com.estudianteEjercicio.ejercicio_estudiante.model.Curso;
import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import com.estudianteEjercicio.ejercicio_estudiante.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    @Autowired ICursoRepository cursoRepo;

    @Override
    public void crearCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> listaCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public List<Tema> listaTemas(Long id_curso) {
        return cursoRepo.findById(id_curso).map(Curso::getListaDeTemas).orElse(Collections.emptyList());        
    }

    @Override
    public List<Curso> busquedaCurso(String palabra) {
        return cursoRepo.findByNombreContainingIgnoreCase(palabra);
    }

    @Override
    public void modificarCurso(Curso curso) {
        this.crearCurso(curso);
    }
    
}
