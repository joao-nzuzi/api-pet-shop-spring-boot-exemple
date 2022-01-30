package com.nzuzi.joao.petshop.controller;

import com.nzuzi.joao.petshop.entity.Pet;
import com.nzuzi.joao.petshop.service.impl.PetSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/petshop")
public class PetController{

    @Autowired
    private PetSeviceImpl service;

    @PostMapping("/")
    public ResponseStatusException cadastrar(@RequestBody Pet pet) {
        return service.cadastrar(pet);
    }

    @PutMapping("/{id}")
    public ResponseStatusException update(@RequestBody Pet pet, @PathVariable Long id) {
        return service.update(pet, id);
    }

    @GetMapping("/")
    public List<Pet> getAllPet() {
        return service.getAllPet();
    }

    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id) {
        return service.getPetById(id);
    }

    @GetMapping("/{nome}")
    public Pet getPetByName(@PathVariable String nome) {
        return service.getPetByName(nome);
    }

    @GetMapping("/{genero}")
    public Pet getPetByGenero(String genero) {
        return service.getPetByGenero(genero);
    }

    @GetMapping("/{tipo}")
    public Pet getPetByTipo(String tipo) {
        return service.getPetByTipo(tipo);
    }

    @GetMapping("/{especie}")
    public Pet getPetByEspecie(String especie) {
        return service.getPetByEspecie(especie);
    }

    @GetMapping("/{idade}")
    public Pet getPetByIdade(String idade) {
        return service.getPetByIdade(idade);
    }

    @GetMapping("/{status}")
    public Pet getPetByStatus(String status) {
        return service.getPetByStatus(status);
    }
}
