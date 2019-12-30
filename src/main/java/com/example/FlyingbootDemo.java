package com.example;

import com.github.gaojh.Flying;
import com.github.gaojh.ioc.annotation.ComponentScan;

/**
 * @author 高建华
 * @date 2019-03-31 22:43
 */
public class FlyingbootDemo {
    public static void main(String[] args) {
        new Flying().port(11111).enableWebsocket(true).run(FlyingbootDemo.class);
    }
}
