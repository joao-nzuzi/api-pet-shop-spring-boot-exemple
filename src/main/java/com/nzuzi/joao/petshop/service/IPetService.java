package com.nzuzi.joao.petshop.service;

import com.nzuzi.joao.petshop.entity.Pet;
import org.springframework.http.ResponseEntity;

public interface IPetService {

    ResponseEntity<?> cadastrar(Pet pet);
    ResponseEntity<?> update(Pet pet, Long id);
    ResponseEntity<?> getAllPet();
    Object getPetById(Long id);
    ResponseEntity<?> getPetByNome(String nome);
    ResponseEntity<?> getPetByGenero(String genero);
    ResponseEntity<?> getPetByTipo(String tipo);
    ResponseEntity<?> getPetByEspecie(String especie);
    ResponseEntity<?> getPetByIdade(String idade);
    ResponseEntity<?> getPetByStatus(String status);
    ResponseEntity<?> getPetByRaca(String raca);

}
