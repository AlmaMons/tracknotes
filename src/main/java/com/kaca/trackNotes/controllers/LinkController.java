package com.kaca.trackNotes.controllers;


import com.kaca.trackNotes.model.Link;
import com.kaca.trackNotes.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/link")
public class LinkController {

    private LinkRepository linkRepository;

    @Autowired
    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }


    @GetMapping
    public ResponseEntity<List<Link>> getItem(){
        return new ResponseEntity<>(linkRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping (consumes = "application/json")
    public ResponseEntity<Link> saveItem(@RequestBody Link link){
        System.out.println(link);
        return new ResponseEntity<>(linkRepository.save(link), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public ResponseEntity<Link> updateItem (@RequestBody Link link,
                                            @PathVariable ("id") long id){
        Optional<Link> link1=linkRepository.findById(id);
        if (!link1.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Link l =link1.get();
        l.setUrlLink(link.getUrlLink());
        l.setBoja(link.getBoja());
        l.setObrisan(link.isObrisan());
        return new ResponseEntity<Link>(linkRepository.save(l), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity <Void> deleteItem(@PathVariable long id){

        Optional<Link> link1 = linkRepository.findById(id);
        if (!link1.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Link l=link1.get();
        linkRepository.delete(l);
        return new ResponseEntity<>(HttpStatus.OK);


    }



}
