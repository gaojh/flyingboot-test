package com.example.handler;

import com.github.gaojh.ioc.annotation.Component;
import com.github.gaojh.server.ws.WebSocketHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @author 高建华
 * @date 2019-07-25 14:47
 * @description
 */
@Component
public class MyWebSocketHandler implements WebSocketHandler {

    @Override
    public void onHandshake(ChannelHandlerContext ctx, FullHttpRequest fullHttpRequest) throws Exception {
        System.out.println(fullHttpRequest.uri());
    }

    @Override
    public void onMessage(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("msg: "+msg);
        sendMessage(ctx,"回复："+msg);
    }

    @Override
    public void onClose(ChannelHandlerContext ctx) throws Exception {

    }

}
