package com.example.chat.servicio;

import com.example.chat.modelo.Usuario;
import java.util.List;

public interface IUsuarioServicio {

    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorId(Integer id);
    List<Usuario> buscarPorEmailAndPassword(String email, String password);
    void guardarUsuario(Usuario usuario);
    void eliminarUsuarioPorId(Integer id);

}
