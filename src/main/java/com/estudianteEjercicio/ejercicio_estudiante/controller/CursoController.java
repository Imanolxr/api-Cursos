
package com.estudianteEjercicio.ejercicio_estudiante.controller;

import com.estudianteEjercicio.ejercicio_estudiante.model.Curso;
import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import com.estudianteEjercicio.ejercicio_estudiante.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired 
    ICursoService cursoServ;
    
    //crear un curso
    @PostMapping("/curso/crear")
    public String crearCurso(@RequestBody Curso curso){
        cursoServ.crearCurso(curso);
        return "Curso Creado exitosamente";        
    }
    
    // mostrar la lista de cursos
    @GetMapping("/curso/traer/lista")
    public List<Curso> traerListaCursos(){
        return cursoServ.listaCursos();
    }
    
    //mostrar lista de temas de un curso
    @GetMapping("/curso/traer/temas/{id_curso}")
    public List<Tema>traerListaTemas(@PathVariable Long id_curso){
        return cursoServ.listaTemas(id_curso);
    }
    
    //obtener los cursos que contengan una palabra especifica
    @GetMapping("/curso/busqueda/{palabra}")
    public List<Curso>busquedaCurso(@PathVariable String palabra){
        return cursoServ.busquedaCurso(palabra);
    }
    
    @PutMapping("/curso/modificar")
    public String modificarCurso(@RequestBody Curso curso){
        cursoServ.modificarCurso(curso);
        return "Curso Modificado";
    }
    
}
