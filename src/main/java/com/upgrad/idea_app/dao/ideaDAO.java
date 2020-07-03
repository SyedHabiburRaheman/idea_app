package com.upgrad.idea_app.dao;

import com.upgrad.idea_app.entities.ideaDO;

import java.util.List;

//Contract of ideaDAO layer for CRUD operation

public interface ideaDAO {

    public void save(ideaDO ideaDO);

    public ideaDO find(long id);

    public List<ideaDO> findAll();

    public void update(ideaDO ideaDO);

    public void delete(long id);
}
