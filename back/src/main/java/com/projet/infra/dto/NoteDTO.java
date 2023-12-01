package com.projet.infra.dto;

public class NoteDTO {

    private String titre;
    private String description;
    public NoteDTO() {
    }

    public NoteDTO(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }
}
