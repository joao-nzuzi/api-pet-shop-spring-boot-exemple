package com.nzuzi.joao.petshop.enums;

public enum Especie {
    MAMIFERO("Mamífero"),
    AVE("Ave"),
    REPTIL("Reptil"),
    ANFIBIO("Anfíbio"),
    PEIXE("Peixe"),
    INVERTEBRADO("Invertebrado");

    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }
}
