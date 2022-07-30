package com.studies.apispringstudies.repository;

import com.studies.apispringstudies.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> { //interface criada para realizar consultas no db

}

// é o repositorio que tem sua classe com metodos de pesquisa de ID