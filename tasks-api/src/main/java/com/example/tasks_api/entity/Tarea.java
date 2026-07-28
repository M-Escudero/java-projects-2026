package com.example.tasks_api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private boolean completada;

    //Constructor sin parámetros
    public Tarea() {
    }

    //Constructor con parámetros
    public Tarea(String titulo, boolean completada){
        this.titulo = titulo;
        this.completada = completada;
    }

    //Getters
     public String getTitulo(){
        return titulo;
     }

     public boolean isCompletada(){
        return completada;
     }

     //Setters
     public void setTitulo(String titulo){
        this.titulo = titulo;
     }

     public void setCompletada(boolean completada){
        this.completada = completada;
     }
}
