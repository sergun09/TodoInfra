package com.projet.infra.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projet.infra.dto.NoteDTO;
import com.projet.infra.modele.Note;
import com.projet.infra.service.FacadeNote;
import com.projet.infra.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@CrossOrigin(origins = "${front.uri}")
@RequestMapping(value = "/api")
public class ControllerNote {

    @Autowired
    FacadeNote facadeNote;

    @GetMapping(value = "${controller.note.getAllNotes}")
    public ResponseEntity<Collection<Note>> getNothing(){
        return ResponseEntity.ok(facadeNote.getAllNotes());

    }

    @PostMapping(value = "${controller.note.postNote}")
    @ResponseBody
    public ResponseEntity<String> postNote(@RequestBody NoteDTO noteDto){
        String idNote = facadeNote.addNote(noteDto);
        ResponseBuilder response = new ResponseBuilder().addArg("idNote", String.valueOf(idNote));
        return ResponseEntity.status(HttpStatus.CREATED).body(response.toString());

    }


}
