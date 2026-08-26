package com.example.tasks_api.controller;

import com.example.tasks_api.entity.Tarea;
import com.example.tasks_api.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService){
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> listarTodas() {
        return tareaService.listarTodas();
    }

    @PostMapping
    public Tarea crear(@RequestBody Tarea tarea){
        return tareaService.crear(tarea.getTitulo());
    }

    @PutMapping("/{id}/completar")
    public Tarea completar(@PathVariable Long id) {
        return tareaService.completar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        tareaService.eliminar(id);
    }
}
