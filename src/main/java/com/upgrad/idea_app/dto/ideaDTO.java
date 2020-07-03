package com.upgrad.idea_app.dto;

//This DTO class will be used to share idea data between client and server

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ideaDTO {
    @JsonProperty("id")
    private long id;

    @JsonProperty("idea_name")
    private String ideaName;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("idea_description")
    private String  ideaDescription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdeaName() {
        return ideaName;
    }

    public void setIdeaName(String ideaName) {
        this.ideaName = ideaName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIdeaDescription() {
        return ideaDescription;
    }

    public void setIdeaDescription(String ideaDescription) {
        this.ideaDescription = ideaDescription;
    }

    @Override
    public String toString() {
        return "ideaDTO{" +
                "id=" + id +
                ", ideaName='" + ideaName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ideaDescription='" + ideaDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ideaDTO ideaDTO = (ideaDTO) o;
        return id == ideaDTO.id &&
                Objects.equals(ideaName, ideaDTO.ideaName) &&
                Objects.equals(authorName, ideaDTO.authorName) &&
                Objects.equals(ideaDescription, ideaDTO.ideaDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaName, authorName, ideaDescription);
    }
}
