package com.upgrad.idea_app.utill;

import com.upgrad.idea_app.dto.ideaDTO;
import com.upgrad.idea_app.entities.ideaDO;

public class ideaUtill {
    private ideaUtill(){

    }

    public static ideaDO convertideaDTOtoideaDO(ideaDTO ideaDTO) {
        ideaDO ideaDO = new ideaDO();

        ideaDO.setId(ideaDTO.getId());
        ideaDO.setAuthorName(ideaDTO.getAuthorName());
        ideaDO.setIdeaDescription(ideaDTO.getIdeaDescription());
        ideaDO.setIdeaName(ideaDTO.getIdeaName());

        return ideaDO;
    }

    public static ideaDTO convertideaDOtoideaDTO(ideaDO ideaDO) {
        ideaDTO ideaDTO = new ideaDTO();

        ideaDTO.setId(ideaDO.getId());
        ideaDTO.setAuthorName(ideaDO.getAuthorName());
        ideaDTO.setIdeaDescription(ideaDO.getIdeaDescription());
        ideaDTO.setIdeaName(ideaDO.getIdeaName());

        return ideaDTO;
    }
}
