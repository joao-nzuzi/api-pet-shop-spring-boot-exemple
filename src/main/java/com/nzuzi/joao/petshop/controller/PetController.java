package com.nzuzi.joao.petshop.controller;

import com.nzuzi.joao.petshop.entity.Pet;
import com.nzuzi.joao.petshop.service.impl.PetSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/petshop")
public class PetController{

    @Autowired
    private PetSeviceImpl service;

    @PostMapping("/")
    public ResponseEntity<?> cadastrar(@RequestBody Pet pet) {
        return service.cadastrar(pet);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Pet pet, @PathVariable Long id) {
        return service.update(pet, id);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllPet() {
        return service.getAllPet();
    }

    @GetMapping("/{id}")
    public Object getPetById(@PathVariable("id") Long id) {
        return service.getPetById(id);
    }

    @GetMapping("/find_by_name/{nome}")
    public ResponseEntity getPetByName(@PathVariable String nome) {
        return service.getPetByNome(nome);
    }

    @GetMapping("/find_by_genero/{genero}")
    public ResponseEntity<?> getPetByGenero(@PathVariable String genero) {
        return service.getPetByGenero(genero);
    }

    @GetMapping("/find_by_tipo/{tipo}")
    public ResponseEntity<?> getPetByTipo(@PathVariable String tipo) {
        return service.getPetByTipo(tipo);
    }

    @GetMapping("/find_by_especie/{especie}")
    public ResponseEntity<?> getPetByEspecie(@PathVariable String especie) {
        return service.getPetByEspecie(especie);
    }

    @GetMapping("/find_by_idade/{idade}")
    public ResponseEntity<?> getPetByIdade(@PathVariable String idade) {
        return service.getPetByIdade(idade);
    }

    @GetMapping("/find_by_status/{status}")
    public ResponseEntity<?> getPetByStatus(@PathVariable String status) {
        return service.getPetByStatus(status);
    }

    @GetMapping("/find_by_raca/{raca}")
    public ResponseEntity<?> getPetByRaca(@PathVariable String raca) {
        return service.getPetByRaca(raca);
    }
}
