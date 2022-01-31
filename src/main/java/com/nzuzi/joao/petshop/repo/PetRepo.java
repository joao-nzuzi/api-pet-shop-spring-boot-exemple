package com.nzuzi.joao.petshop.repo;

import com.nzuzi.joao.petshop.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PetRepo extends JpaRepository<Pet, Long> {

    @Query(value = "select * from pet where nome = :nome", nativeQuery = true)
    List<Pet> getPetByNome(String nome);

    @Query(value = "select * from pet where genero = :genero", nativeQuery = true)
    List<Pet> getPetByGenero(String genero);

    @Query(value = "select * from pet where tipo = :tipo", nativeQuery = true)
    List<Pet> getPetByTipo(String tipo);

    @Query(value = "select * from pet where especie = :especie", nativeQuery = true)
    List<Pet> getPetByEspecie(String especie);

    @Query(value = "select * from pet where idade = :idade", nativeQuery = true)
    List<Pet> getPetByIdade(String idade);

    @Query(value = "select * from pet where status = :status", nativeQuery = true)
    List<Pet> getPetByStatus(String status);

    @Query(value = "select * from pet where raca = :raca", nativeQuery = true)
    List<Pet> getPetByRaca(String raca);
}
