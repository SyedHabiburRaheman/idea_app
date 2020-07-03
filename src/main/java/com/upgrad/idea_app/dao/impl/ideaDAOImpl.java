package com.upgrad.idea_app.dao.impl;

import com.upgrad.idea_app.dao.ideaDAO;
import com.upgrad.idea_app.entities.ideaDO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ideaDAOImpl implements ideaDAO {

    private static final Map<Long,ideaDO> IDEA_STORE = new HashMap<>();
    @Override
    public void save(ideaDO ideaDO) {
        IDEA_STORE.put(ideaDO.getId(), ideaDO);
    }

    @Override
    public ideaDO find(long id) {
        return IDEA_STORE.get(id);
    }

    @Override
    public List<ideaDO> findAll() {
        return IDEA_STORE.values().stream().collect(Collectors.toList());
    }

    @Override
    public void update(ideaDO ideaDO) {
        IDEA_STORE.put(ideaDO.getId(), ideaDO);
    }

    @Override
    public void delete(long id) {
        IDEA_STORE.remove(id);
    }
}
