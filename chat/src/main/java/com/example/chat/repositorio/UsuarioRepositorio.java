package com.example.chat.repositorio;

import com.example.chat.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByEmailAndPassword(String email,String password);
}
