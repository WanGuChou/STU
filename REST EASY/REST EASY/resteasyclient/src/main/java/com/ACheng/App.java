package com.ACheng;

import com.ACheng.resteasy.Proxy;
import com.ACheng.resteasy.RestSimpleClient;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {

/*
       String resp= SimpleClient.get("http://127.0.0.1:8888/");
        System.out.println(SimpleClient.get("http://www.baidu.com/"));
*/

String uri="http://127.0.0.1:8888/";
        RestSimpleClient client=  Proxy.getProxyClient(RestSimpleClient.class,uri);

        String str=client.getHome();
        System.out.println(str);
        System.out.println(client.putSomething("123"));
    }


    public static String beanToJson(Object object)
    {
        Gson gson=new Gson();
        return gson.toJson(object);
    }

}
