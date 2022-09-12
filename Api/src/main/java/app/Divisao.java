package app;

import io.jooby.annotations.*;

@Path("/divisao/{numUm}/{numDois}")
public class Divisao {

    @GET
    public double calculaDivisao(@PathParam double numUm, @PathParam double numDois) {
        return numUm / numDois;
    }
}