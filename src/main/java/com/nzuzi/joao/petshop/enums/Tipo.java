package com.nzuzi.joao.petshop.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tipo {
     CAO("Cão"),
     GATO("Gato"),
     FURAO("Furão"),
     COELHO("Coelho"),
     HAMSTER("Hamster"),
     RATO("Rato"),
     CAMUNDONGO("Camundongo"),
     ESQUILO("Esquilo"),
     GALINHA("Galinha"),
     PATO("Pato"),
     ARARA("Arara"),
     CAGADO("Cagado"),
     TARTARUGAS("Tartaruga");

     private final String descricao;

}
