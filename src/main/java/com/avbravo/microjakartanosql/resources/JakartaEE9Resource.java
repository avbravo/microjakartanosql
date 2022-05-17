package com.avbravo.microjakartanosql.resources;

import jakarta.inject.Inject;
import jakarta.nosql.document.DocumentCollectionManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE9Resource {
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
