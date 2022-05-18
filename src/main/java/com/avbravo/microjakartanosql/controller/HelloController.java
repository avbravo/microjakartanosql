package com.avbravo.microjavaxnosql.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author 
 */
@Path("hello")
public class HelloController {
       @Inject
    @ConfigProperty(name = "document")
        private String document;
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE" + document)
                .build();
    }
}
