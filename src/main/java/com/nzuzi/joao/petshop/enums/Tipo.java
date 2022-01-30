package com.nzuzi.joao.petshop.enums;

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

     private String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }
}
