package com.example.tasks_api;

import com.example.tasks_api.entity.Tarea;
import com.example.tasks_api.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TasksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApiApplication.class, args);
	}


	@Bean
	CommandLineRunner run(TareaRepository tareaRepository) {
		return args -> {
			tareaRepository.save(new Tarea("Estudiar Spring Boot", false));
			tareaRepository.save(new Tarea("Repasar JPA", false));
			tareaRepository.save(new Tarea("Hacer la compra", true));

			System.out.println("--- Tareas guardadas ---");
			tareaRepository.findAll().forEach(tarea -> System.out.println(tarea.getTitulo() + " - completada: " + tarea.isCompletada()));
			System.out.println("--- Tareas completadas ---");
			tareaRepository.findByCompletada(true).forEach(tarea -> System.out.println(tarea.getTitulo()));
		};
	}



}
