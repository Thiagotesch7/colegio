package com.senai.colegio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.colegio.models.Aluno;
import com.senai.colegio.repositories.AlunoRepository;

@Service 
public class AlunoService {
    
    private AlunoRepository alunoRepository;

    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listar () {
        return alunoRepository.findAll();
    }

       public Aluno buscarPorId(Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

       public Aluno atualizar(Integer id, Aluno alunoAtualizado) {
        Aluno alunoExistente = alunoRepository.findById(id).orElse(null);

        if (alunoExistente == null) {
            return null;
        }

         alunoExistente.setNome(alunoAtualizado.getNome());
        alunoExistente.setResponsavel(alunoAtualizado.getResponsavel());

        return alunoRepository.save(alunoExistente);
    }

    public void excluir(Integer id) {
        alunoRepository.deleteById(id);
    }
}
