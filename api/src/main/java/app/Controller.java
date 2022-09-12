package app;

import io.jooby.annotations.*;

@Path("/bem-vindos")
public class Controller {

  @GET
  public String welcomeAll() {
    return "São todos/as Bem-vindos/as!";
  }
}