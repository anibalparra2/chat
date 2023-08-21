package com.example.chat.repositorio;

import com.example.chat.modelo.Mensaje;
import com.example.chat.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeRepositorio extends JpaRepository<Mensaje, Integer> {

    List<Mensaje> findByUsuario(Usuario usuario);

}
