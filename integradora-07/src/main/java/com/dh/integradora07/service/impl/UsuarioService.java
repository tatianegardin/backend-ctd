package com.dh.integradora07.service.impl;

import com.dh.integradora07.model.Usuario;
import com.dh.integradora07.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UsuarioService implements IService<Usuario> {

    public static Map<Integer, Usuario> usuarioMap = new HashMap<>();

    @Override
    public Usuario save(Usuario usuario) {
            usuarioMap.put(usuario.getId(), usuario);
            return usuario;
    }

    @Override
    public List<Usuario> getAll() {
        return new ArrayList<>(usuarioMap.values());
    }

    @Override
    public String deleteById(int id) {
            usuarioMap.remove(id);
            return "Usuário deletado com sucesso!";

    }

    @Override
    public Usuario getById(int id) {
        if (usuarioMap.containsKey(id)){
            return usuarioMap.get(id);
        }
        return null;
    }
}
