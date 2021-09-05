package com.java.comment.s.site.demo.dao;
import com.java.comment.s.site.demo.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<User> getUsuarios() {
        String query = "FROM User";
        return (List<User>) manager.createQuery(query).getResultList();
    }
}
