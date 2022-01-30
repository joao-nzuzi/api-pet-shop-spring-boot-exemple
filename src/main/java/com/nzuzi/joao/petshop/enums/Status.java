package com.nzuzi.joao.petshop.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    DISPONIVEL("Disponível"),
    VENDIDO("Vendido");

    private final String descricao;

}
