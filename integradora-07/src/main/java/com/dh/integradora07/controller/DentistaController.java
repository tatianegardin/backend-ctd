package com.dh.integradora07.controller;

import com.dh.integradora07.model.Dentista;
import com.dh.integradora07.model.Usuario;
import com.dh.integradora07.service.impl.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {
    @Autowired
    DentistaService dentistaService;


    @GetMapping("/save")
    public Dentista save(@RequestParam(value = "id") int id,
                        @RequestParam(value = "nome") String nome,
                        @RequestParam(value = "email") String email,
                        @RequestParam(value = "numeroMatricula") int numeroMatricula,
                        @RequestParam(value = "atendeConvenio") boolean atendeConvenio){
        return dentistaService.save(new Dentista(id, nome, email, numeroMatricula, atendeConvenio));
    }

    @GetMapping("/all")
    public List<Dentista> getAll(){
        return dentistaService.getAll();
    }

    @GetMapping("/{id}")
    public Dentista getById(@PathVariable int id){
        return dentistaService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return dentistaService.deleteById(id);
    }

}
