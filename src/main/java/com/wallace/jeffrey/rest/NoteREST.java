package com.wallace.jeffrey.rest;

import com.wallace.jeffrey.entities.Note;
import com.wallace.jeffrey.services.NoteServiceBeanLocal;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by jeffreywallace on 5/30/17.
 */

@Path("/note")
public class NoteREST {

    @EJB
    NoteServiceBeanLocal noteServiceBean;

    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNote(@QueryParam("content") String content){
        noteServiceBean.addNote(content);

        return Response.ok().build();
    }


    @GET
    @Path("/getById")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@QueryParam("id") long id){
        Note note = noteServiceBean.getById(id);

        return Response.ok(note).build();
    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<Note> notes = noteServiceBean.getAllNotes();

        return Response.ok(notes).build();
    }


    @GET
    @Path("/hello_world")
    public Response helloWorld(){
        return Response.ok("Hello World").build();
    }

}
