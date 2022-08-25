package com.dh.integradora07.controller;

import com.dh.integradora07.model.Usuario;
import com.dh.integradora07.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/save")
    public Usuario save(@RequestParam(value = "id") int id,
                        @RequestParam(value = "nome") String nome,
                        @RequestParam(value = "email") String email,
                        @RequestParam(value = "senha") String senha,
                        @RequestParam(value = "nivelAcesso") String nivelAcesso){
        return usuarioService.save(new Usuario(id, nome, email, senha, nivelAcesso));
    }

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable int id){
        return usuarioService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return usuarioService.deleteById(id);
    }
}
