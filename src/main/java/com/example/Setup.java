package com.example;

import com.github.gaojh.mvc.route.Routers;
import com.github.gaojh.mvc.setup.SetupRunner;

/**
 * @author gaojianhua
 * @date 2019/12/11 3:18 下午
 */
@com.github.gaojh.mvc.annotation.Setup
public class Setup implements SetupRunner {
    @Override
    public void run() {
        Routers.me.get("/taobao", httpRequest -> "123123123");
    }
}
