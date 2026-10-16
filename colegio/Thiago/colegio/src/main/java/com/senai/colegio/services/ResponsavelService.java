package com.senai.colegio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.colegio.models.Responsavel;
import com.senai.colegio.repositories.ResponsavelRepository;

@Service 
public class ResponsavelService {
    
    @Autowired 
    private ResponsavelRepository responsavelRepository;

    public Responsavel cadastrar(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }

    public List<Responsavel> listar() {
        return responsavelRepository.findAll();
    }
}
