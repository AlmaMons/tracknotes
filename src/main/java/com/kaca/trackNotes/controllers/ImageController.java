package com.kaca.trackNotes.controllers;


import com.kaca.trackNotes.model.Image;
import com.kaca.trackNotes.model.Link;
import com.kaca.trackNotes.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/image")
public class ImageController {



    private ImageRepository imageRepository;

    @Autowired
    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @GetMapping
    public ResponseEntity<List<Image>>getItem (){
        return new ResponseEntity<>(imageRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    //@RequestBody mapira body zahteva i prebacuje json u objekat
    public ResponseEntity<Image> saveItem(@RequestBody Image image){
        return new ResponseEntity<>(imageRepository.save(image), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public ResponseEntity<Image>updateItem(@RequestBody Image image,
                                           @PathVariable("id") long id){

        Optional<Image> image1=imageRepository.findById(id);
        if (!image1.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Image img=image1.get();
        img.setUrlImg(image.getUrlImg());
        img.setObrisan(image.isObrisan());
        return new ResponseEntity<Image>(imageRepository.save(img), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Value>deleteItem(@PathVariable long id){
        Optional<Image>image1=imageRepository.findById(id);
        if (!image1.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Image img=image1.get();
        imageRepository.delete(img);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
