package com.ACheng.resteasy;

import com.ACheng.SimpleClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Created by tsk on 2017/4/15.
 */
public class Proxy {


    public static  <T>T getProxyClient(Class<T> clzz,String uri){
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(uri);
       return target.proxy(clzz);
    }


}

