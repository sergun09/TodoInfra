package com.projet.infra.modele;


import com.projet.infra.enums.Couleur;
import jakarta.persistence.*;
import javax.persistence.GeneratedValue;
import java.util.Random;
import java.util.UUID;

@Entity
public class Note {

    @Id
    private String id;
    private String titre;
    private String description;

    private String couleur;

    public Note() {
    }

    public Note(String titre, String description) {
        this.id = UUID.randomUUID().toString();
        this.titre = titre;
        this.description = description;
        this.couleur = Couleur.values()[new Random()
                .nextInt(Couleur.values().length)]
                .getCouleur();
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCouleur() { return couleur;}
}
