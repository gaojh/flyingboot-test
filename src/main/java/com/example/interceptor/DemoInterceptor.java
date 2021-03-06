package com.example.interceptor;

import com.github.gaojh.mvc.annotation.Interceptor;
import com.github.gaojh.mvc.interceptor.HandlerInterceptor;
import com.github.gaojh.mvc.interceptor.HandlerResponse;
import com.github.gaojh.server.http.HttpRequest;
import com.github.gaojh.server.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 高建华
 * @date 2019-04-16 20:52
 */
@Interceptor(pathPatterns = {"/**"}, ignorePathPatterns = {"/hello"}, order = 5)
public class DemoInterceptor implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(DemoInterceptor.class);

    @Override
    public HandlerResponse preHandle(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        logger.info("demo");
        return HandlerResponse.success();
    }

    @Override
    public void postHandle(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        logger.info("demo postHandle");
    }

}
