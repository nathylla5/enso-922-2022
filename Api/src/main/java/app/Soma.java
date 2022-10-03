package app;

import io.jooby.annotations.*;

@Path("/soma/{numUm}/{numDois}")
public class Soma {
    @GET
    public double calculaSoma(@PathParam double numUm, @PathParam double numDois) {
        return numUm + numDois;
    }
}