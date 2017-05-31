package com.wallace.jeffrey.services.impl;

import com.wallace.jeffrey.entities.Note;
import com.wallace.jeffrey.services.NoteServiceBeanLocal;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

/**
 * Created by jeffreywallace on 5/30/17.
 */
@Stateless
public class NoteServiceBean implements NoteServiceBeanLocal {

    private EntityManagerFactory emf    = Persistence.createEntityManagerFactory("NotePU_dev");
    private EntityManager em            = emf.createEntityManager();
    private EntityTransaction tx        = em.getTransaction();

    public void addNote(String content) {
        Note note = new Note(content);

        tx.begin();
        em.persist(note);
        tx.commit();
    }

    public Note getById(long id) {
        return em.find(Note.class, id);
    }

    public List<Note> getAllNotes() {
        TypedQuery<Note> namedQuery = em.createNamedQuery(Note.FIND_ALL, Note.class);
        List<Note> results = namedQuery.getResultList();

        return results;
    }
}
