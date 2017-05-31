package com.wallace.jeffrey.services;

import com.wallace.jeffrey.entities.Note;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by jeffreywallace on 5/30/17.
 */
@Local
public interface NoteServiceBeanLocal {
    public void addNote(String content);
    public Note getById(long id);
    public List<Note> getAllNotes();
}
