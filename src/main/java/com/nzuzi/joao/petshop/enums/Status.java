package com.nzuzi.joao.petshop.enums;

public enum Status {
    DISPONIVEL("Disponível"),
    VENDIDO("Vendido");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }
}
