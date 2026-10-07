package com.senai.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.colegio.models.Responsavel;
import com.senai.colegio.services.ResponsavelService;

@RestController 
@RequestMapping ("/responsavel")
public class ResponsavelController {
    
    @Autowired 
    private ResponsavelService responsavelService;

    @PostMapping public Responsavel cadastrar(@RequestBody Responsavel responsavel) {
        return responsavelService.cadastrar(responsavel);
    }

    @GetMapping 
    public List<Responsavel> listar() {
        return responsavelService.listar();
    }
}
