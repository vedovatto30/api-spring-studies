package com.studies.apispringstudies.controller;

import com.studies.apispringstudies.model.UsuarioModel;
import com.studies.apispringstudies.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build()); //pegamos o repositorio e usamos
        // o finById que é ume metodo proprio do repositorio o qual ele chama o metodo map, em que atraves da solicitação ao retornar alguma coisa, apresentamos OK e monta o
        // corp da requisição com o registro, caso contrario retorna um notfound

    }
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }
}

//realiza a consulta e salva no banco de dados