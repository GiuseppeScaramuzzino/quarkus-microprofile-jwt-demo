package org.gs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jwt")
public class JwtResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getToken() {
    String token = "";
    return Response.ok(token).build();
  }
}
