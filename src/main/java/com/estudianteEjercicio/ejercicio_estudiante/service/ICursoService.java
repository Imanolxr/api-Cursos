
package com.estudianteEjercicio.ejercicio_estudiante.service;

import com.estudianteEjercicio.ejercicio_estudiante.model.Curso;
import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import java.util.List;


public interface ICursoService {
    
    //crear nuevo curso
    public void crearCurso(Curso curso);

    //obtener todos los cursos
    public List<Curso> listaCursos();
    
    // obtener lista de temas de un curso
    public List <Tema> listaTemas(Long id_curso);
    
    //busqueda curso por palabra
    public List<Curso> busquedaCurso(String palabra);
    
    public void modificarCurso(Curso curso);
    
}
