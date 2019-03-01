package com.jcrogel.jax;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class JAXHelloWorld {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMsg() {
        String result = "Hello World";
        return Response.status(200).entity(result).build();
    }
}
