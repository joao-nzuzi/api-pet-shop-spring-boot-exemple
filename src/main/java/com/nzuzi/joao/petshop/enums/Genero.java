package com.nzuzi.joao.petshop.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genero {
    MACHO("Macho"),
    FEMEA("Fêmea");

    private final String descricao;

}
