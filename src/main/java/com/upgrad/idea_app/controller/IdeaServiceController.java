package com.upgrad.idea_app.controller;

import com.upgrad.idea_app.dto.ideaDTO;
import com.upgrad.idea_app.service.ideaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ideas")
public class IdeaServiceController {

    @Autowired
    private com.upgrad.idea_app.service.ideaService ideaService;

//    POST
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<ideaDTO> createIdea (@RequestBody ideaDTO ideaDTO) {
        ideaService.saveIdea(ideaDTO);
        return new ResponseEntity<>(ideaDTO, HttpStatus.CREATED);
    }

//    GET
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ideaDTO>> getAllIdeas(){
        return new ResponseEntity<>(ideaService.getAllIdeas(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<ideaDTO> getIdeaBasedOnId( @PathVariable(name = "id") long movieId){
        return new ResponseEntity<>(ideaService.getIdea(movieId), HttpStatus.OK);
    }

//    UPDATE
    @PutMapping(value="/{id}")
    public ResponseEntity<ideaDTO> updateIdea( @PathVariable(name = "id") long movieId, @RequestBody ideaDTO ideaDTO){
        ideaService.updateIdea(ideaDTO);
        return new ResponseEntity<>(ideaDTO, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ideaDTO> deleteIdea( @PathVariable(name = "id") long movieId){
        ideaService.deleteIdea(movieId);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
