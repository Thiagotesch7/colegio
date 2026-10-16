package com.senai.colegio.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.colegio.models.Usuario;
import com.senai.colegio.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario login(String nome, String senha) {

        String senhaCriptografada = md5(senha);

        Usuario usuario = usuarioRepository.login(nome, senhaCriptografada);

        if (usuario == null) {
            throw new RuntimeException("Usuário ou senha inválidos");
        }

        return usuario;
    }

    public Usuario cadastrar(Usuario usuario) {

        usuario.setSenha(md5(usuario.getSenha()));

        return usuarioRepository.save(usuario);
    }

    private String md5(String senha) {

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] bytes = md.digest(senha.getBytes());

            StringBuilder resultado = new StringBuilder();

            for (byte b : bytes) {
                resultado.append(String.format("%02x", b));
            }

            return resultado.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar MD5", e);
        }
    }
}
    

