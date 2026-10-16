package com.senai.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.colegio.models.Responsavel;

@Repository 
public interface ResponsavelRepository extends JpaRepository <Responsavel, Integer> { 
}
