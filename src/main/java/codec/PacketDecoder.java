package codec;

import command.Packet;
import command.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * Created by chen on 2018/11/28.
 */
public class PacketDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

        Packet decode = PacketCodeC.INSTANCE.decode(byteBuf);
        if(decode!=null) list.add(decode);

    }
}
