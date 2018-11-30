package client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import response.MessageResponsePacket;

import java.util.Date;

/**
 * Created by chen on 2018/11/28.
 */
public class MessageResponseHandler extends SimpleChannelInboundHandler<MessageResponsePacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageResponsePacket messageResponsePacket) throws Exception {
        System.out.println(new Date() + "[" + messageResponsePacket.getFromUserName() + "]:" + messageResponsePacket.getResponseMessage());
    }
}
