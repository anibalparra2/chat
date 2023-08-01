package com.example.chat.servicio;

import com.example.chat.modelo.Usuario;
import com.example.chat.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> listarUsuarios() {

        return this.usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer id) {
        Usuario usuario = this.usuarioRepositorio.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public List<Usuario> buscarPorEmailAndPassword(String email, String password){
        List<Usuario> usuarios = this.usuarioRepositorio.findByEmailAndPassword(email,password);
        return usuarios;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuarioPorId(Integer id) {
        this.usuarioRepositorio.deleteById(id);
    }
}
