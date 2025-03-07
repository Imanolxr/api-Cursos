
package com.estudianteEjercicio.ejercicio_estudiante.service;

import com.estudianteEjercicio.ejercicio_estudiante.model.Tema;
import com.estudianteEjercicio.ejercicio_estudiante.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService {
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public void crearTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public void modificarTema(Tema tema) {
        this.crearTema(tema);
    }
    
}
