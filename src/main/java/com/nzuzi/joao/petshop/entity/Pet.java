package com.nzuzi.joao.petshop.entity;

import com.nzuzi.joao.petshop.enums.Genero;
import com.nzuzi.joao.petshop.enums.Tipo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {

    private Long id;
    private String nome;
    private String idade;
    private String cor;
    private Tipo tipo;
    private Genero genero;
}
