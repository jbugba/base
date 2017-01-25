package ar.com.jbugba.base.wildfly.rest;

import ar.com.jbugba.base.wildfly.model.Guitar;
import ar.com.jbugba.base.wildfly.service.GuitarService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("guitars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GuitarsRest {

    @Inject
    private GuitarService guitarService;

    @GET
    @Path("/")
    public List<Guitar> getGuitars(@QueryParam("page") int page, @QueryParam("size") int size) {
        return this.guitarService.getGuitars(page, size);
    }

}
