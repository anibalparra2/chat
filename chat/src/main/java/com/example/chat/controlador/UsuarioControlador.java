package com.example.chat.controlador;

import com.example.chat.modelo.Credenciales;
import com.example.chat.modelo.Usuario;
import com.example.chat.servicio.UsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
//http://localhost:8080/chat-app
@RequestMapping("chat-app")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioControlador {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioControlador.class);

    @Autowired
    private UsuarioServicio usuarioServicio;

    //http://localhost:8080/chat-app/usuarios
    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        logger.info("Usuarios obtenidos:");
        usuarios.forEach(usuario -> logger.info(usuario.toString()));
        return usuarios;
    }

    //http://localhost:8080/chat-app/usuarios
    @PostMapping("/usuarios")
    public Usuario ingresar(@RequestBody Credenciales cred){
        logger.info("Credenciales: " + cred);
        List<Usuario> usuarios = this.usuarioServicio.buscarPorEmailAndPassword(cred.getEmail(),cred.getPassword());
        logger.info("Usuarios obtenidos:");
        usuarios.forEach(usu -> logger.info(usu.toString()));
        if(usuarios.size() > 0)
            return usuarios.get(0);
        else
            return null;
    }

}
