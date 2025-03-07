
package com.estudianteEjercicio.ejercicio_estudiante.controller;

import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import com.estudianteEjercicio.ejercicio_estudiante.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    ITemaService temaServ;
    
    @PostMapping("/tema/crear")
    public String crearTema(@RequestBody Tema tema){
        temaServ.crearTema(tema);
        return "Tema Creado correctamente";        
    }
    
    @PutMapping("/tema/modificar")
    public String modificarTema(@RequestBody Tema tema){
        temaServ.modificarTema(tema);
        return "Tema modificado correctamente";
    }
    
    
}
