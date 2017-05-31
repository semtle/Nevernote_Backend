package com.wallace.jeffrey.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jeffreywallace on 5/30/17.
 */

@Entity
@XmlRootElement(name = "note")
@NamedQueries({@NamedQuery(name = Note.FIND_ALL, query = "Select n from Note n")})
public class Note {
    public static final String FIND_ALL = "Note.find_all";

    //This gives you a sequence that always increments by 1
    @TableGenerator(name = "noteSequenceGenerator", allocationSize = 1, initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "noteSequenceGenerator")
    private long id;

    private String content;

    public Note(String content){
        this.content = content;
    }

    public long getId(){
        return this.id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
