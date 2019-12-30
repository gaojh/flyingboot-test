package com.example.handler;

import com.github.gaojh.ioc.annotation.Component;
import com.github.gaojh.mvc.route.DynamicRouteHandler;
import com.github.gaojh.server.http.HttpRequest;


/**
 * @author 高建华
 * @date 2019-04-30 10:00
 */
@Component
public class DemoDynamicHandler implements DynamicRouteHandler {


    @Override
    public Object handle(HttpRequest httpRequest) {
        return "ok";
    }
}
