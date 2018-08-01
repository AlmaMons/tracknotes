package com.kaca.trackNotes.controllers;


import com.kaca.trackNotes.model.Note;
import com.kaca.trackNotes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/note")
public class NoteController {

    private NoteRepository noteRepository;

    @Autowired
    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public ResponseEntity<List<Note>> getItems(){
        return new ResponseEntity<>(noteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping (consumes = "application/json")
    public ResponseEntity<Note> saveItem(@RequestBody Note note){
        return new ResponseEntity<>(noteRepository.save(note), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public ResponseEntity<Note>updateItem(@RequestBody Note note,
                                          @PathVariable("id") long id){
          Optional<Note> note1=noteRepository.findById(id);
            if (!note1.isPresent()){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);}

            Note n = note1.get();
            n.setNaslov(note.getNaslov());
            n.setTekst(note.getTekst());
            n.setBoja(note.getBoja());
            n.setObrisan(note.isObrisan());
            return new ResponseEntity<Note>(noteRepository.save(n), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable long id){

        Optional<Note> n= noteRepository.findById(id);
        if (!n.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);}

            Note n1 = n.get();

        noteRepository.delete(n1);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
