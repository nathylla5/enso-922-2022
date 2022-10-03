package app;

import io.jooby.annotations.*;

@Path("/subtracao/{numUm}/{numDois}")
public class Subtracao {

    @GET
    public double calculaSubtracao(@PathParam double numUm, @PathParam double numDois) {
        return numUm - numDois;
    }
}