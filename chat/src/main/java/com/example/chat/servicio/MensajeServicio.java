package com.example.chat.servicio;

import com.example.chat.modelo.Mensaje;
import com.example.chat.modelo.Usuario;
import com.example.chat.repositorio.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MensajeServicio implements IMensajeServicio{

    @Autowired
    private MensajeRepositorio mensajeRepositorio;

    @Override
    public List<Mensaje> listarMensajes() {

        return this.mensajeRepositorio.findAll();
    }

    @Override
    public List<Mensaje> encontrarPorUsuario(Usuario usuario){

        return this.mensajeRepositorio.findByUsuario(usuario);
    }
}
