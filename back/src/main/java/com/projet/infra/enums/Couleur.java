package com.projet.infra.enums;

public enum Couleur {
    ROSE("#f3858e"), VERT("#eaec40"), BLEU("#79cbc5"), ORANGE("#fbae4a"), JAUNE("#ffff97");

    private final String couleur;
    Couleur(String couleur) {
        this.couleur = couleur;
    }
    public String getCouleur() {
        return couleur;
    }

}
