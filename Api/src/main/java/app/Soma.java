package app;

import io.jooby.annotations.*;

@Path("/soma/{numUm}/{numDois}")
public class Soma {
    @GET
    public long calculaSoma(@PathParam int numUm, @PathParam int numDois) {
        return numUm+numDois;
    }
}