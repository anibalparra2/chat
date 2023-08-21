package com.example.chat.servicio;

import com.example.chat.modelo.Mensaje;
import com.example.chat.modelo.Usuario;

import java.util.List;

public interface IMensajeServicio {

    List<Mensaje> listarMensajes();
    List<Mensaje> encontrarPorUsuario(Usuario usuario);
}
