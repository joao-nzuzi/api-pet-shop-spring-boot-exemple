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
    public Pet getPetById(@PathVariable("id") Long id) {
        return service.getPetById(id);
    }

    @GetMapping("/find_by_name/{nome}")
    public List<Pet> getPetByName(@PathVariable String nome) {
        return service.getPetByName(nome);
    }

    @GetMapping("/find_by_genero/{genero}")
    public List<Pet> getPetByGenero(@PathVariable String genero) {
        return service.getPetByGenero(genero);
    }

    @GetMapping("/find_by_tipo/{tipo}")
    public List<Pet> getPetByTipo(@PathVariable String tipo) {
        return service.getPetByTipo(tipo);
    }

    @GetMapping("/find_by_especie/{especie}")
    public List<Pet> getPetByEspecie(@PathVariable String especie) {
        return service.getPetByEspecie(especie);
    }

    @GetMapping("/find_by_idade/{idade}")
    public List<Pet> getPetByIdade(@PathVariable String idade) {
        return service.getPetByIdade(idade);
    }

    @GetMapping("/find_by_status/{status}")
    public List<Pet> getPetByStatus(@PathVariable String status) {
        return service.getPetByStatus(status);
    }

    @GetMapping("/find_by_raca/{raca}")
    public List<Pet> getPetByRaca(@PathVariable String raca) {
        return service.getPetByRaca(raca);
    }
}
