package com.example.chat.controlador;

import com.example.chat.modelo.Mensaje;
import com.example.chat.modelo.Usuario;
import com.example.chat.servicio.MensajeServicio;
import com.example.chat.servicio.UsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chat-app")
@CrossOrigin(value = "http://localhost:4200")
public class MensajeControlador {

    private static final Logger logger = LoggerFactory.getLogger(MensajeControlador.class);

    @Autowired
    private MensajeServicio mensajeServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/mensajes")
    public List<Mensaje> obtenerMensajes(){
        List<Mensaje> mensajes = this.mensajeServicio.listarMensajes();
        mensajes.forEach(mensaje -> logger.info(mensaje.toString()));

        return mensajes;
    }

    @GetMapping("/mensajesUsuario")
    public List<Mensaje> obtenerMensajesPorUsuario(@RequestParam Integer idUsuario){
        Usuario usuario = this.usuarioServicio.buscarUsuarioPorId(idUsuario);
        List<Mensaje> mensajes = mensajeServicio.encontrarPorUsuario(usuario);

        return mensajes;
    }

}
