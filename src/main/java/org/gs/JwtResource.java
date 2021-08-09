package org.gs;

import io.smallrye.jwt.build.Jwt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/jwt")
public class JwtResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getToken() {
    String token =
        Jwt.claims()
            .issuedAt(new Date().toInstant())
            .subject("giuseppe")
            .groups("Admin")
            .claim("demo", "quarkus")
            .sign();
    return Response.ok(token).build();
  }
}
