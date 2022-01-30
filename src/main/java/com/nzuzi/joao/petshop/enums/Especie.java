package com.nzuzi.joao.petshop.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Especie {
    MAMIFERO("Mamífero"),
    AVE("Ave"),
    REPTIL("Reptil"),
    ANFIBIO("Anfíbio"),
    PEIXE("Peixe"),
    INVERTEBRADO("Invertebrado");

    private final String descricao;

}
