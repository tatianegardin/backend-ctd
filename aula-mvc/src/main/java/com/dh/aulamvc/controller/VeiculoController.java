package com.dh.aulamvc.controller;

import com.dh.aulamvc.model.Veiculo;
import com.dh.aulamvc.service.IVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    IVeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> getAll(){
        return veiculoService.getAll();
    }
}
