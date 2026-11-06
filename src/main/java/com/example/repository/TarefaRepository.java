package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
