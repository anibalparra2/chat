package com.example.chat.servicio;

import com.example.chat.modelo.Usuario;
import java.util.List;

public interface IUsuarioServicio {

    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuarioPorId(Integer id);
    public List<Usuario> buscarPorEmailAndPassword(String email,String password);
    public void guardarUsuario(Usuario usuario);
    public void eliminarUsuarioPorId(Integer id);

}
