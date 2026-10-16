package com.senai.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.colegio.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository< Aluno, Integer>{
    
}
