package com.upgrad.idea_app.service;

//Acts like a facilitator. takes the request from the controller and order dao for data manipulation.
//CRUD operations

import com.upgrad.idea_app.dto.ideaDTO;

import java.util.List;

public interface ideaService {
    public void saveIdea(ideaDTO ideaDTO);

    public ideaDTO getIdea(long id);

    public List<ideaDTO> getAllIdeas();

    public void updateIdea(ideaDTO ideaDTO);

    public void deleteIdea(long id);
}
