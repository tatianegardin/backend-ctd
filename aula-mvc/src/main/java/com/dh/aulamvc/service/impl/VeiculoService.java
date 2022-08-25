package com.dh.aulamvc.service.impl;

import com.dh.aulamvc.model.Veiculo;
import com.dh.aulamvc.service.IVeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class VeiculoService implements IVeiculoService {


    @Override
    public List<Veiculo> getAll() {
        return Arrays.asList(new Veiculo("Preto", "Corolla"));
    }
}
