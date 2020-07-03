package com.upgrad.idea_app.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

//This ideaDO object will be used to store the idea resource in the internal storage system

public class ideaDO {

    private long id;

    private String ideaName;

    private String authorName;

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
        return "ideaDO{" +
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
        ideaDO ideaDO = (ideaDO) o;
        return id == ideaDO.id &&
                Objects.equals(ideaName, ideaDO.ideaName) &&
                Objects.equals(authorName, ideaDO.authorName) &&
                Objects.equals(ideaDescription, ideaDO.ideaDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaName, authorName, ideaDescription);
    }
}
