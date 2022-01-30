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
        repository.save(pet);
        return new ResponseStatusException(HttpStatus.CREATED, "Pet Cadastrado Com Sucesso");
    }

    @Override
    public ResponseStatusException update(Pet pet, Long id) {
        try {
            Pet novoPet = verificaSePetExiste(id);
            novoPet.setCor(pet.getCor());
            novoPet.setNome(pet.getNome());
            novoPet.setIdade(pet.getIdade());
            novoPet.setTipo(pet.getTipo());
            novoPet.setEspecie(pet.getEspecie());
            novoPet.setGenero(pet.getGenero());
            repository.save(novoPet);
            return new ResponseStatusException(HttpStatus.CREATED, "Pet com " + id + " atualizado com sucesso");
        } catch (Exception e) {
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
    public List<Pet> getPetByName(String nome) {
        if (repository.getPetByName(nome).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet com o nome " + nome + " não encontrado");
        return repository.getPetByName(nome);
    }

    @Override
    public List<Pet> getPetByGenero(String genero) {
        if(repository.getPetByGenero(genero).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com o gênero " + genero + " não encontrado");
        return repository.getPetByGenero(genero);
    }

    @Override
    public List<Pet> getPetByTipo(String tipo) {
        if(repository.getPetByTipo(tipo).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets do tipo " + tipo + " não encontrado");
        else{
            return repository.getPetByTipo(tipo);
        }
    }

    @Override
    public List<Pet> getPetByEspecie(String especie) {
        if(repository.getPetByEspecie(especie).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets da espécie " + especie + " não encontrado");

        return repository.getPetByEspecie(especie);
    }

    @Override
    public List<Pet> getPetByIdade(String idade) {
        if(repository.getPetByIdade(idade).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com idade " + idade + " não encontrado");
        return repository.getPetByIdade(idade);
    }

    @Override
    public List<Pet> getPetByStatus(String status) {
        if(repository.getPetByStatus(status).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com status " + status + " não encontrado");
        return repository.getPetByStatus(status);
    }

    @Override
    public List<Pet> getPetByRaca(String raca) {
        if (repository.getPetByRaca(raca).isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pets com a raca " + raca + " não encontrado");
        return repository.getPetByRaca(raca);
    }
}
