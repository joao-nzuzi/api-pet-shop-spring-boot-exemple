package com.nzuzi.joao.petshop.service.impl;

import com.nzuzi.joao.petshop.entity.Pet;
import com.nzuzi.joao.petshop.repo.PetRepo;
import com.nzuzi.joao.petshop.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PetSeviceImpl implements IPetService {

    @Autowired
    private PetRepo repository;

    @Override
    public ResponseStatusException cadastrar(Pet pet) {
        try {
            repository.save(pet);
            return new ResponseStatusException(HttpStatus.CREATED, "Pet Cadastrado Com Sucesso");
        }catch (Exception e){
            return new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Informa um pet, por favor", e);
        }

    }

    @Override
    public ResponseStatusException update(Pet pet, Long id) {
        try{
            Pet novoPet = verificaSePetExiste(id);
            novoPet.setCor(pet.getCor());
            novoPet.setNome(pet.getNome());
            novoPet.setIdade(pet.getIdade());
            novoPet.setTipo(pet.getTipo());
            novoPet.setEspecie(pet.getEspecie());
            novoPet.setGenero(pet.getGenero());
            repository.save(novoPet);
            return new ResponseStatusException(HttpStatus.CREATED, "Pet com "+id+ " atualizado com sucesso");
        }catch (Exception e){
            return new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet não encontrado", e);
        }
    }

    @Override
    public List<Pet> getAllPet() {
        return repository.findAll();
    }

    @Override
    public Pet getPetById(Long id) {
        return verificaSePetExiste(id);
    }

    private Pet verificaSePetExiste(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet não encontrado"));
    }


    @Override
    public Pet getPetByName(String nome) {
        return repository.getPetByName(nome).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet com o nome "+nome+" não encontrado"));
    }

    @Override
    public Pet getPetByGenero(String genero) {
        return repository.getPetByGenero(genero).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com o gênero "+genero+" não encontrado"));
    }

    @Override
    public Pet getPetByTipo(String tipo) {
        return repository.getPetByTipo(tipo).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets do tipo "+tipo+" não encontrado"));
    }

    @Override
    public Pet getPetByEspecie(String especie){
        return repository.getPetByEspecie(especie).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets da espécie "+especie+" não encontrado"));
    }

    @Override
    public Pet getPetByIdade(String idade) {
        return repository.getPetByIdade(idade).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com idade "+idade+" não encontrado"));
    }

    @Override
    public Pet getPetByStatus(String status) {
        return repository.getPetByStatus(status).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com status "+status+" não encontrado"));
    }
}
