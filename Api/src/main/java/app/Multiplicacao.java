package app;

import io.jooby.annotations.*;

@Path("/multiplicacao/{numUm}/{numDois}")
public class Multiplicacao {

    @GET
    public double calculaMultiplicacao(@PathParam double numUm, @PathParam double numDois) {
        return numUm * numDois;
    }
}