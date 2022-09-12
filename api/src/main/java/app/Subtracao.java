package app;

import io.jooby.annotations.*;

@Path("/subtracao/{numUm}/{numDois}")
public class Subtracao {
    @GET
    public long calculaSubtracao(@PathParam int numUm, @PathParam int numDois) {
        return numUm-numDois;
    }
}