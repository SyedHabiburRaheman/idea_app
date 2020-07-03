package com.upgrad.idea_app.service.impl;

import com.upgrad.idea_app.dao.ideaDAO;
import com.upgrad.idea_app.dto.ideaDTO;
import com.upgrad.idea_app.service.ideaService;
import com.upgrad.idea_app.utill.ideaUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ideaServiceImpl  implements ideaService {

    @Autowired
    private ideaDAO ideaDAO;

    @Override
    public void saveIdea(ideaDTO ideaDTO) {
        ideaDAO.save(ideaUtill.convertideaDTOtoideaDO(ideaDTO));
    }

    @Override
    public ideaDTO getIdea(long id) {
        return ideaUtill.convertideaDOtoideaDTO(ideaDAO.find(id));
    }

    @Override
    public List<ideaDTO> getAllIdeas() {
        return ideaDAO.findAll().stream().map(ideaDO -> ideaUtill.convertideaDOtoideaDTO(ideaDO))
                .collect(Collectors.toList());
    }

    @Override
    public void updateIdea(ideaDTO ideaDTO) {
        ideaDAO.update(ideaUtill.convertideaDTOtoideaDO(ideaDTO));
    }

    @Override
    public void deleteIdea(long id) {
        ideaDAO.delete(id);
    }
}
