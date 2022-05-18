package com.avbravo.microjakartanosql.controller;


import com.avbravo.microjakartanosql.model.Pais;
import com.avbravo.microjakartanosql.model.Persona;
import com.avbravo.microjakartanosql.repository.PersonaRepository;
import jakarta.nosql.mapping.Param;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;

@ApplicationScoped
@Path("persona")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaController {

    private static final Supplier<WebApplicationException> NOT_FOUND =
            () -> new WebApplicationException(Response.Status.NOT_FOUND);

    @Inject
    private PersonaRepository repository;

    @GET
    public List<Persona> findAll() {
        return repository.findAll()
                .collect(toList());
    }

    @GET
    @Path("/{id}")
    public Persona findById(@PathParam("id") String id) {
        return repository.findById(id).orElseThrow(NOT_FOUND);
    }

    @GET
    @Path("paisin/{code}")
    public List<Persona> findByPaisIn(@PathParam("code") String  code) {
     
       return repository.findByPaisIn(code)
                .collect(toList());
    }
    @GET
    @Path("seniors/{age}")
    public List<Persona> findByOlder(@PathParam("age") Integer age) {
        return repository.findByAgeGreaterThan(age)
                .collect(toList());
    }

    @GET
    @Path("youngs/{age}")
    public List<Persona> findByYounger(@PathParam("age") Integer age) {
        return repository.findByAgeLessThan(age)
                .collect(toList());
    }

    @POST
    public void save(Persona hero) {
        repository.save(hero);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") String id, Persona hero) {
        repository.save(hero);
    }

    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") String name) {
        repository.deleteById(name);
    }
}
