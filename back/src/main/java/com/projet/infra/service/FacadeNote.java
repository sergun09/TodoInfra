package com.projet.infra.service;

import com.projet.infra.dto.NoteDTO;
import com.projet.infra.modele.Note;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class FacadeNote {
    @PersistenceContext
    EntityManager em;



    public Collection<Note> getAllNotes(){
        return em.createQuery("from Note ").getResultList();
    }

    @Transactional
    public String addNote(NoteDTO noteDto){
        Note note = new Note(noteDto.getTitre(), noteDto.getDescription());
        em.persist(note);
        return note.getId();
    }

}
