package com.dh.integradora07.service.impl;

import com.dh.integradora07.model.Dentista;
import com.dh.integradora07.model.Usuario;
import com.dh.integradora07.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class DentistaService implements IService<Dentista> {
    public static Map<Integer, Dentista> dentistaMap = new HashMap<>();

    @Override
    public Dentista save(Dentista dentista) {
        dentistaMap.put(dentista.getId(), dentista);
        return dentista;
    }

    @Override
    public List<Dentista> getAll() {
        return new ArrayList<>(dentistaMap.values());
    }

    @Override
    public String deleteById(int id) {
        dentistaMap.remove(id);
        return "Usuário deletado com sucesso!";

    }

    @Override
    public Dentista getById(int id) {
        if (dentistaMap.containsKey(id)){
            return dentistaMap.get(id);
        }
        return null;
    }

}
