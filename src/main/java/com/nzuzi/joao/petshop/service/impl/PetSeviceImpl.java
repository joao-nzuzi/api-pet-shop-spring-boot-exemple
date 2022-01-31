package com.nzuzi.joao.petshop.service.impl;

import com.nzuzi.joao.petshop.entity.Pet;
import com.nzuzi.joao.petshop.repo.PetRepo;
import com.nzuzi.joao.petshop.service.IPetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetSeviceImpl implements IPetService {

    @Autowired
    private PetRepo repository;

    Logger logger = LoggerFactory.getLogger(PetSeviceImpl.class);

    @Override
    public ResponseEntity<?> cadastrar(Pet pet) {
        repository.save(pet);
        return new ResponseEntity<>("Pet Cadastrado Com Sucesso", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> update(Pet pet, Long id) {
        try {
            if(verificaSePetExiste(id).getStatusCodeValue() != 404) {
                repository.save(pet);
                return new ResponseEntity<>("Pet com id " + id + " atualizado com sucesso", HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Pet com id " + id + " não encontrado", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            logger.error("Pet não encontrado", e);
        }
        return null;
    }

    @Override
    public ResponseEntity<?> getAllPet() {
        List<Pet> all = repository.findAll();
        if(all.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Nenhum pet encontrado");
        }
        return ResponseEntity.ok().body(all);
    }

    @Override
    public ResponseEntity<?> getPetById(Long id) {
        return verificaSePetExiste(id);
    }

    private ResponseEntity<?> verificaSePetExiste(Long id) {
        Optional<Pet> petExistente = repository.findById(id);
        if(petExistente.isPresent()){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(petExistente);
        }
        return new ResponseEntity<>("Pet não encontrado", HttpStatus.NOT_FOUND);
    }


    @Override
    public ResponseEntity<?> getPetByNome(String nome) {
        if (repository.getPetByNome(nome).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pet com o nome " + nome + " não encontrado");
        return ResponseEntity.ok().body(repository.getPetByNome(nome));
    }

    @Override
    public ResponseEntity<?> getPetByGenero(String genero) {
        if(repository.getPetByGenero(genero).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets com o gênero " + genero + " não encontrado");
        return ResponseEntity.ok().body(repository.getPetByGenero(genero));
    }

    @Override
    public ResponseEntity<?> getPetByTipo(String tipo) {
        if(repository.getPetByTipo(tipo).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets do tipo " + tipo + " não encontrado");
        else{
            return ResponseEntity.ok().body(repository.getPetByTipo(tipo));
        }
    }

    @Override
    public ResponseEntity<?> getPetByEspecie(String especie) {
        if(repository.getPetByEspecie(especie).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets da espécie " + especie + " não encontrado");

        return ResponseEntity.ok().body(repository.getPetByEspecie(especie));
    }

    @Override
    public ResponseEntity<?> getPetByIdade(String idade) {
        if(repository.getPetByIdade(idade).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets com idade " + idade + " não encontrado");
        return ResponseEntity.ok().body(repository.getPetByIdade(idade));
    }

    @Override
    public ResponseEntity<?> getPetByStatus(String status) {
        if(repository.getPetByStatus(status).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets com status " + status + " não encontrado");
        return ResponseEntity.ok().body(repository.getPetByStatus(status));
    }

    @Override
    public ResponseEntity<?> getPetByRaca(String raca) {
        if (repository.getPetByRaca(raca).isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Pets com a raca " + raca + " não encontrado");
        return ResponseEntity.ok().body(repository.getPetByRaca(raca));
    }
}
