package com.senai.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.senai.colegio.models.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {

     @Query ("SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha")
    Usuario login(
        @Param("nome") String nome,
        @Param("senha") String senha
    );
    
}
