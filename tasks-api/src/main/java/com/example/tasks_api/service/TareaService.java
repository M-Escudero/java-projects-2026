package com.example.tasks_api.service;

import com.example.tasks_api.entity.Tarea;
import com.example.tasks_api.exception.TareaNoEncontradaException;
import com.example.tasks_api.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository){
        this.tareaRepository = tareaRepository;
    }

    public Tarea crear(String titulo){
        Tarea tarea = new Tarea();
        tarea.setTitulo(titulo);

        return tareaRepository.save(tarea);
    }

    public List<Tarea> listarTodas(){
        return tareaRepository.findAll();
    }

    public Tarea completar(Long id){
        Optional<Tarea> resultado = tareaRepository.findById(id);

        if (resultado.isPresent()){
            Tarea tarea = resultado.get();
            tarea.setCompletada(true);
            return tareaRepository.save(tarea);
        }else {
            throw new TareaNoEncontradaException(id);
        }
    }

    public void eliminar(Long id){
        boolean resultado = tareaRepository.existsById(id);

        if (resultado){
            tareaRepository.deleteById(id);
        } else {
            throw new TareaNoEncontradaException(id);
        }
    }
}
