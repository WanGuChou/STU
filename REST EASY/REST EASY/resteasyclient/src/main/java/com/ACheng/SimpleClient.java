package com.ACheng;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Created by tsk on 2017/4/15.
 */


public class SimpleClient {


    public static String get(String uri){
    Client client= ClientBuilder.newBuilder().build();   //  或者使用   Client client=ClientBuilder.newClient();

        //client.getConfiguration();client的相关配置

    WebTarget target=client.target(uri);

    Response response =target.request().get();

    String en =  response.readEntity(String.class);


    response.close();
     return en ;
    }

    public  static String easy_get(String uri){
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(uri);
        Response response =  target.request().get();
        String en =  response.readEntity(String.class);
        response.close();
        return en ;
    }

}
