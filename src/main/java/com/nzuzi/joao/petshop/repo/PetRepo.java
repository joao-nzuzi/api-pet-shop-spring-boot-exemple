package com.nzuzi.joao.petshop.repo;

import com.nzuzi.joao.petshop.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PetRepo extends JpaRepository<Pet, Long> {

    @Query(value = "select * from pet where nome = :nome", nativeQuery = true)
    Optional<Pet> getPetByName(String nome);

    @Query(value = "select * from pet where genero = :genero", nativeQuery = true)
    Optional<Pet> getPetByGenero(String genero);

    @Query(value = "select * from pet where tipo = :tipo", nativeQuery = true)
    Optional<Pet> getPetByTipo(String tipo);

    @Query(value = "select * from pet where especie = :especie", nativeQuery = true)
    Optional<Pet> getPetByEspecie(String especie);

    @Query(value = "select * from pet where idade = :idade", nativeQuery = true)
    Optional<Pet> getPetByIdade(String idade);
}
