package com.ACheng.resteasy;

import javax.ws.rs.*;

/**
 * Created by tsk on 2017/4/15.
 */
public interface RestSimpleClient {

@Path("/")
@GET
@Produces("text/plain")
String getHome();



    @PUT
    @Path("/putSomething")
    @Consumes("text/plain")
    String putSomething(String body);

}
