package com.nzuzi.joao.petshop.service;

import com.nzuzi.joao.petshop.entity.Pet;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public interface IPetService {

    ResponseStatusException cadastrar(Pet pet);
    ResponseStatusException update(Pet pet, Long id);
    List<Pet> getAllPet();
    Pet getPetById(Long id);
    List<Pet> getPetByName(String nome);
    List<Pet> getPetByGenero(String genero);
    List<Pet> getPetByTipo(String tipo);
    List<Pet> getPetByEspecie(String especie);
    List<Pet> getPetByIdade(String idade);
    List<Pet> getPetByStatus(String status);
    List<Pet> getPetByRaca(String raca);

}
