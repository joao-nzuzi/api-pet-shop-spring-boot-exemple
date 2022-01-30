package com.nzuzi.joao.petshop.service;

import com.nzuzi.joao.petshop.entity.Pet;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public interface IPetService {

    ResponseStatusException cadastrar(Pet pet);
    ResponseStatusException update(Pet pet, Long id);
    List<Pet> getAllPet();
    Pet getPetById(Long id);
    Pet getPetByName(String nome);
    Pet getPetByGenero(String genero);
    Pet getPetByTipo(String tipo);
    Pet getPetByEspecie(String especie);
    Pet getPetByIdade(String idade);

}
