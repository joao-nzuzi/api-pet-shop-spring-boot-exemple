package com.nzuzi.joao.petshop.entity;

import com.nzuzi.joao.petshop.enums.Especie;
import com.nzuzi.joao.petshop.enums.Genero;
import com.nzuzi.joao.petshop.enums.Status;
import com.nzuzi.joao.petshop.enums.Tipo;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private String idade;
    @Column(nullable = false)
    private String cor;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Genero genero;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Especie especie;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Status status;
    @Column(nullable = false)
    private double preco;
}
